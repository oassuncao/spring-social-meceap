package org.springframework.social.meceap.connect;

import org.springframework.social.meceap.api.Ceap;
import org.springframework.social.meceap.api.impl.CeapTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapServiceProvider extends AbstractOAuth2ServiceProvider<Ceap> {
// ------------------------------ FIELDS ------------------------------

    private final String baseUrl;

// --------------------------- CONSTRUCTORS ---------------------------

    public CeapServiceProvider(String clientId, String clientSecret, String baseUrl) {
        super(new CeapOAuth2Template(clientId, clientSecret, baseUrl));
        this.baseUrl = baseUrl;
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface OAuth2ServiceProvider ---------------------

    @Override
    public Ceap getApi(String accessToken) {
        return new CeapTemplate(baseUrl, accessToken);
    }
}
