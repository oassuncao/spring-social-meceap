package org.springframework.social.meceap.connect.custom;

import org.springframework.social.meceap.api.custom.CustomApiBinding;
import org.springframework.social.meceap.builder.BaseOperation;
import org.springframework.social.meceap.builder.UserOperation;
import org.springframework.social.meceap.connect.AbstractServiceProvider;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomServiceProvider extends AbstractServiceProvider<CustomApiBinding> {
// ------------------------------ FIELDS ------------------------------

    private final String providerId;

// --------------------------- CONSTRUCTORS ---------------------------

    public CustomServiceProvider(String providerId, String clientId, String clientSecret, String baseUrl, UserOperation userOperation) {
        super(clientId, clientSecret, baseUrl, userOperation);
        this.providerId = providerId;
    }

    public CustomServiceProvider(String providerId, String clientId, String clientSecret, BaseOperation baseOperation, UserOperation userOperation) {
        super(clientId, clientSecret, baseOperation, userOperation);
        this.providerId = providerId;
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface OAuth2ServiceProvider ---------------------

    public CustomApiBinding getApi(String accessToken) {
        return new CustomTemplate(providerId, accessToken, userOperation);
    }
}
