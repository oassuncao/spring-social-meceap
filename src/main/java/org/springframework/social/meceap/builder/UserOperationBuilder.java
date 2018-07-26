package org.springframework.social.meceap.builder;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class UserOperationBuilder {
// ------------------------------ FIELDS ------------------------------

    private static final String USERS_ENDPOINT = "/api/users";
    private static final String USER_PROFILE_ENDPOINT = "/api/users/profile";

    private String userUrl;
    private String profileUrl;

// -------------------------- STATIC METHODS --------------------------

    public static UserOperationBuilder url(String baseUrl) {
        return new UserOperationBuilder(baseUrl + USERS_ENDPOINT, baseUrl + USER_PROFILE_ENDPOINT);
    }

    public static UserOperationBuilder url(String userUrl, String profileUrl) {
        return new UserOperationBuilder(userUrl, profileUrl);
    }

// --------------------------- CONSTRUCTORS ---------------------------

    private UserOperationBuilder(String userUrl, String profileUrl) {
        this.userUrl = userUrl;
        this.profileUrl = profileUrl;
    }

// -------------------------- OTHER METHODS --------------------------

    public UserOperation build() {
        return new UserOperation(userUrl, profileUrl);
    }
}
