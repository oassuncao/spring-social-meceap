package org.springframework.social.meceap.api.custom;

import org.springframework.social.meceap.api.impl.AbstractOperations;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.api.model.custom.CustomUser;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.1
 */
public class CustomUserTemplate extends AbstractOperations implements CustomUserOperations {
// ------------------------------ FIELDS ------------------------------

    private final UserOperation params;

// --------------------------- CONSTRUCTORS ---------------------------

    public CustomUserTemplate(String providerId, DefaultTemplate template, boolean isAuthorized, UserOperation params) {
        super(providerId, template, isAuthorized);
        this.params = params;
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface CustomUserOperations ---------------------

    public CustomUser getUser() {
        requireUserAuthorization();
        return get(buildUri(null, params.getUserUrl()), CustomUser.class);
    }
}
