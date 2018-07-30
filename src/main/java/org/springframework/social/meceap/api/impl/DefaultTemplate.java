package org.springframework.social.meceap.api.impl;

import org.springframework.social.meceap.builder.UserOperation;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public abstract class DefaultTemplate extends AbstractOAuth2ApiBinding {
// ------------------------------ FIELDS ------------------------------


// --------------------------- CONSTRUCTORS ---------------------------

    public DefaultTemplate(String providerId, String accessToken, UserOperation params) {
        this(providerId, accessToken, true, params);
    }

    public DefaultTemplate(String providerId, String accessToken, boolean isAuthorized, UserOperation params) {
        super(accessToken);

    }
}
