package org.springframework.social.meceap.connect;

import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapOAuth2Template extends OAuth2Template {
// --------------------------- CONSTRUCTORS ---------------------------

    public CeapOAuth2Template(String clientId, String clientSecret, String baseUrl) {
        super(clientId, clientSecret, baseUrl + "/oauth/authorize", baseUrl + "/oauth/token");
    }
}
