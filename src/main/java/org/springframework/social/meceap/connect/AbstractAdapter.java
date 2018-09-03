package org.springframework.social.meceap.connect;

import org.springframework.social.ApiBinding;
import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.meceap.api.model.User;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public abstract class AbstractAdapter<U extends User, A extends ApiBinding> implements ApiAdapter<A> {
// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface ApiAdapter ---------------------

    public boolean test(A api) {
        try {
            getUser(api);
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public void setConnectionValues(A api, ConnectionValues values) {
        U user = getUser(api);
        values.setDisplayName(user.getName());
        values.setProviderUserId(getProviderUserId(user));
    }

    @SuppressWarnings("unchecked")
    public UserProfile fetchUserProfile(A api) {
        U user = getUser(api);
        return new UserProfileBuilder()
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setUsername(getProviderUserId(user))
                .build();
    }

    public void updateStatus(A api, String message) {

    }

// -------------------------- OTHER METHODS --------------------------

    protected String getProviderUserId(U user) {
        if (user.getUniqueIdentifier() == null || user.getUniqueIdentifier().trim().equals(""))
            return user.getEmail();
        return user.getUniqueIdentifier();
    }

    protected abstract U getUser(A api);
}
