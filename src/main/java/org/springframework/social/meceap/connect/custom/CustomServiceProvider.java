package org.springframework.social.meceap.connect.custom;

import org.springframework.social.meceap.api.DefaultApiBinding;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.builder.BaseOperation;
import org.springframework.social.meceap.builder.UserOperation;
import org.springframework.social.meceap.connect.AbstractServiceProvider;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomServiceProvider extends AbstractServiceProvider {
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

    public DefaultApiBinding getApi(String accessToken) {
        return new DefaultTemplate(providerId, accessToken, userOperation);
    }
}
