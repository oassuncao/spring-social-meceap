package org.springframework.social.meceap.api.impl;

import org.springframework.social.meceap.api.UserOperations;
import org.springframework.social.meceap.api.model.Profile;
import org.springframework.social.meceap.api.model.User;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class DefaultUserTemplate extends AbstractOperations implements UserOperations {
// ------------------------------ FIELDS ------------------------------

    private final UserOperation params;

// --------------------------- CONSTRUCTORS ---------------------------

    public DefaultUserTemplate(String providerId, DefaultTemplate template, boolean isAuthorized, UserOperation params) {
        super(providerId, template, isAuthorized);
        this.params = params;
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface UserOperations ---------------------

    public <T extends Profile> T getProfile(Class<T> clazz) {
        requireUserAuthorization();
        return get(buildUri(null, params.getProfileUrl()), clazz);
    }

    public <T extends User> T getUser(Class<T> clazz) {
        requireUserAuthorization();
        return get(buildUri(null, params.getUserUrl()), clazz);
    }
}
