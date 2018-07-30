package org.springframework.social.meceap.connect.ceap;

import org.springframework.social.meceap.api.ceap.CeapApiBinding;
import org.springframework.social.meceap.api.ceap.CeapUserOperations;
import org.springframework.social.meceap.api.ceap.CeapUserTemplate;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CeapTemplate extends DefaultTemplate implements CeapApiBinding {
// ------------------------------ FIELDS ------------------------------

    private final CeapUserTemplate userTemplate;

// --------------------------- CONSTRUCTORS ---------------------------

    public CeapTemplate(String providerId, String accessToken, UserOperation params) {
        this(providerId, accessToken, true, params);
    }

    public CeapTemplate(String providerId, String accessToken, boolean isAuthorized, UserOperation params) {
        super(providerId, accessToken, isAuthorized, params);
        this.userTemplate = new CeapUserTemplate(providerId, this, isAuthorized, params);
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface CeapApiBinding ---------------------

    public final CeapUserOperations userOperations() {
        return userTemplate;
    }
}
