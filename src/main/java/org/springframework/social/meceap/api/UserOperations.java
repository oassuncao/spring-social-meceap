package org.springframework.social.meceap.api;

import org.springframework.social.meceap.api.model.Profile;
import org.springframework.social.meceap.api.model.User;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public interface UserOperations {
// ------------------------------ FIELDS ------------------------------


// -------------------------- OTHER METHODS --------------------------

    /**
     * Get user profile
     *
     * @since 4.0
     */
    <T extends Profile> T getProfile(Class<T> clazz);

    <T extends User> T getUser(Class<T> clazz);
}
