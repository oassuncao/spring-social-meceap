package org.springframework.social.meceap.builder;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class UserOperation {
// ------------------------------ FIELDS ------------------------------

    private final String userUrl;
    private final String profileUrl;

// --------------------------- CONSTRUCTORS ---------------------------

    UserOperation(String userUrl, String profileUrl) {
        this.userUrl = userUrl;
        this.profileUrl = profileUrl;
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }
}
