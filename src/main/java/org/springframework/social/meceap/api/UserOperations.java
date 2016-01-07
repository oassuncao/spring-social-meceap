package org.springframework.social.meceap.api;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public interface UserOperations {
// ------------------------------ FIELDS ------------------------------

    String USERS_ENDPOINT = "/api/users";

// -------------------------- OTHER METHODS --------------------------

    CeapProfile getUser();
}
