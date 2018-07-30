package org.springframework.social.meceap.connect.ceap;

import org.springframework.social.meceap.api.ceap.CeapApiBinding;
import org.springframework.social.meceap.builder.UserOperationBuilder;
import org.springframework.social.meceap.connect.AbstractServiceProvider;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
class CeapServiceProvider extends AbstractServiceProvider<CeapApiBinding> {
// ------------------------------ FIELDS ------------------------------

    public static final String PROVIDER = "meceap";

// --------------------------- CONSTRUCTORS ---------------------------

    CeapServiceProvider(String clientId, String clientSecret, String baseUrl) {
        super(clientId, clientSecret, baseUrl, UserOperationBuilder.url(baseUrl).build());
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface OAuth2ServiceProvider ---------------------

    public CeapApiBinding getApi(String accessToken) {
        return new CeapTemplate(PROVIDER, accessToken, userOperation);
    }
}
