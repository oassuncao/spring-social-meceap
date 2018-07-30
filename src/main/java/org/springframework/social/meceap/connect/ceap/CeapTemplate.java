package org.springframework.social.meceap.connect.ceap;

import org.springframework.social.meceap.api.UserOperations;
import org.springframework.social.meceap.api.ceap.CeapApiBinding;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.api.impl.DefaultUserTemplate;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CeapTemplate extends DefaultTemplate implements CeapApiBinding {
// ------------------------------ FIELDS ------------------------------

    private final DefaultUserTemplate userTemplate;

// --------------------------- CONSTRUCTORS ---------------------------

    public CeapTemplate(String providerId, String accessToken, UserOperation params) {
        this(providerId, accessToken, true, params);
    }

    public CeapTemplate(String providerId, String accessToken, boolean isAuthorized, UserOperation params) {
        super(providerId, accessToken, isAuthorized, params);
        this.userTemplate = new DefaultUserTemplate(providerId, this, isAuthorized, params);
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface DefaultApiBinding ---------------------

    public final UserOperations userOperations() {
        return userTemplate;
    }
}
