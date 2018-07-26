package org.springframework.social.meceap.api.model.custom;

import org.springframework.social.meceap.api.model.Profile;
import org.springframework.social.meceap.api.model.User;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomUser extends User {
// ------------------------------ FIELDS ------------------------------

    private Profile profile;

// --------------------- GETTER / SETTER METHODS ---------------------

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
