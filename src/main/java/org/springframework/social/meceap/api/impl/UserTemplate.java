package org.springframework.social.meceap.api.impl;

import org.springframework.social.meceap.api.CeapProfile;
import org.springframework.social.meceap.api.UserOperations;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class UserTemplate extends AbstractCeapOperations implements UserOperations {
// --------------------------- CONSTRUCTORS ---------------------------

    public UserTemplate(CeapTemplate ceap, boolean isAuthorized) {
        super(ceap, isAuthorized);
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface UserOperations ---------------------

    public CeapProfile getUser() {
        requireUserAuthorization();
        return get(buildUri(USERS_ENDPOINT), CeapProfile.class);
    }
}
