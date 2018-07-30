package org.springframework.social.meceap.connect.custom;

import org.springframework.social.meceap.api.UserOperations;
import org.springframework.social.meceap.api.custom.CustomApiBinding;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.api.impl.DefaultUserTemplate;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomTemplate extends DefaultTemplate implements CustomApiBinding {
// ------------------------------ FIELDS ------------------------------

    private final DefaultUserTemplate userTemplate;

// --------------------------- CONSTRUCTORS ---------------------------

    public CustomTemplate(String providerId, String accessToken, UserOperation params) {
        this(providerId, accessToken, true, params);
    }

    public CustomTemplate(String providerId, String accessToken, boolean isAuthorized, UserOperation params) {
        super(providerId, accessToken, isAuthorized, params);
        this.userTemplate = new DefaultUserTemplate(providerId, this, isAuthorized, params);
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface DefaultApiBinding ---------------------

    public final UserOperations userOperations() {
        return userTemplate;
    }
}
