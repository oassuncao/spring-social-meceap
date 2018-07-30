package org.springframework.social.meceap.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.meceap.api.DefaultApiBinding;
import org.springframework.social.meceap.api.model.User;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public abstract class AbstractAdapter<U extends User, A extends DefaultApiBinding> implements ApiAdapter<A> {
// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface ApiAdapter ---------------------

    public boolean test(A api) {
        try {
            api.userOperations().getUser(getUserClass());
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public void setConnectionValues(A api, ConnectionValues values) {
        U user = api.userOperations().getUser(getUserClass());
        values.setDisplayName(user.getName());
        values.setProviderUserId(getProviderUserId(user));
    }

    @SuppressWarnings("unchecked")
    public UserProfile fetchUserProfile(A api) {
        U user = api.userOperations().getUser(getUserClass());
        return new UserProfileBuilder()
                .setName(user.getName())
                .setEmail(user.getEmail())
                .setUsername(getProviderUserId(user))
                .build();
    }

    public void updateStatus(A defaultApiBinding, String message) {

    }

// -------------------------- OTHER METHODS --------------------------

    protected String getProviderUserId(U user) {
        return user.getUniqueIdentifier();
    }

    protected abstract Class<U> getUserClass();
}
