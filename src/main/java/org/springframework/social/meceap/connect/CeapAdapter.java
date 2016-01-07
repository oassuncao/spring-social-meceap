package org.springframework.social.meceap.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.meceap.api.Ceap;
import org.springframework.social.meceap.api.CeapProfile;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapAdapter implements ApiAdapter<Ceap> {
// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface ApiAdapter ---------------------

    public boolean test(Ceap api) {
        try {
            api.userOperations().getUser();
            return true;
        } catch (ApiException e) {
            return false;
        }
    }

    public void setConnectionValues(Ceap api, ConnectionValues values) {
        CeapProfile profile = api.userOperations().getUser();
        values.setDisplayName(profile.getName());
        values.setProviderUserId(profile.getId().toString());
    }

    public UserProfile fetchUserProfile(Ceap api) {
        CeapProfile profile = api.userOperations().getUser();
        return new UserProfileBuilder()
                .setName(profile.getName())
                .setEmail(profile.getEmail())
                .setUsername(profile.getEmail()).build();
    }

    public void updateStatus(Ceap api, String message) {

    }
}
