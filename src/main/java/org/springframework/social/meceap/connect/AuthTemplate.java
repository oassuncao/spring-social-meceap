package org.springframework.social.meceap.connect;

import org.springframework.social.oauth2.OAuth2Template;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public final class AuthTemplate extends OAuth2Template {
// --------------------------- CONSTRUCTORS ---------------------------

    public AuthTemplate(String clientId, String clientSecret, String authorizeUrl, String tokenUrl) {
        super(clientId, clientSecret, authorizeUrl, tokenUrl);
    }
}
