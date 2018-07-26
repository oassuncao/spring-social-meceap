package org.springframework.social.meceap.api.impl;

import org.springframework.social.meceap.api.DefaultApiBinding;
import org.springframework.social.meceap.api.UserOperations;
import org.springframework.social.meceap.builder.UserOperation;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class DefaultTemplate extends AbstractOAuth2ApiBinding implements DefaultApiBinding {
// ------------------------------ FIELDS ------------------------------

    private final DefaultUserTemplate userTemplate;

// --------------------------- CONSTRUCTORS ---------------------------

    public DefaultTemplate(String providerId, String accessToken, UserOperation params) {
        this(providerId, accessToken, true, params);
    }

    public DefaultTemplate(String providerId, String accessToken, boolean isAuthorized, UserOperation params) {
        super(accessToken);
        this.userTemplate = new DefaultUserTemplate(providerId, this, isAuthorized, params);
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface DefaultApiBinding ---------------------

    public final UserOperations userOperations() {
        return userTemplate;
    }
}
