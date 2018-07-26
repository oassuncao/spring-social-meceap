package org.springframework.social.meceap.connect.ceap;

import org.springframework.social.meceap.api.DefaultApiBinding;
import org.springframework.social.meceap.api.impl.DefaultTemplate;
import org.springframework.social.meceap.builder.UserOperationBuilder;
import org.springframework.social.meceap.connect.AbstractServiceProvider;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
class CeapServiceProvider extends AbstractServiceProvider {
// ------------------------------ FIELDS ------------------------------

    public static final String PROVIDER = "meceap";

// --------------------------- CONSTRUCTORS ---------------------------

    CeapServiceProvider(String clientId, String clientSecret, String baseUrl) {
        super(clientId, clientSecret, baseUrl, UserOperationBuilder.url(baseUrl).build());
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface OAuth2ServiceProvider ---------------------

    public DefaultApiBinding getApi(String accessToken) {
        return new DefaultTemplate(PROVIDER, accessToken, userOperation);
    }
}
