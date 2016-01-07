package org.springframework.social.meceap.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.meceap.api.Ceap;
import org.springframework.social.meceap.api.impl.CeapTemplate;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapConnectionFactory extends OAuth2ConnectionFactory<Ceap> {
// --------------------------- CONSTRUCTORS ---------------------------

    public CeapConnectionFactory(String clientId, String clientSecret, String baseUrl) {
        super(CeapTemplate.PROVIDER, new CeapServiceProvider(clientId, clientSecret, baseUrl), new CeapAdapter());
    }
}
