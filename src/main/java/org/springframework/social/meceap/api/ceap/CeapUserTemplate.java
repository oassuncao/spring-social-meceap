package org.springframework.social.meceap.api.ceap;

import org.springframework.social.meceap.api.impl.AbstractOperations;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.api.model.ceap.CeapProfile;
import org.springframework.social.meceap.api.model.ceap.CeapUser;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.1
 */
public class CeapUserTemplate extends AbstractOperations implements CeapUserOperations {
// ------------------------------ FIELDS ------------------------------

    private final UserOperation params;

// --------------------------- CONSTRUCTORS ---------------------------

    public CeapUserTemplate(String providerId, DefaultTemplate template, boolean isAuthorized, UserOperation params) {
        super(providerId, template, isAuthorized);
        this.params = params;
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface CeapUserOperations ---------------------

    public CeapProfile getProfile() {
        requireUserAuthorization();
        return get(buildUri(null, params.getProfileUrl()), CeapProfile.class);
    }

    public CeapUser getUser() {
        requireUserAuthorization();
        return get(buildUri(null, params.getUserUrl()), CeapUser.class);
    }
}
