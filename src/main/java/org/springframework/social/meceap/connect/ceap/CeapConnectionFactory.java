package org.springframework.social.meceap.connect.ceap;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.meceap.api.ceap.CeapApiBinding;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapConnectionFactory extends OAuth2ConnectionFactory<CeapApiBinding> {
// --------------------------- CONSTRUCTORS ---------------------------

    public CeapConnectionFactory(String clientId, String clientSecret, String baseUrl) {
        super(CeapServiceProvider.PROVIDER, new CeapServiceProvider(clientId, clientSecret, baseUrl), new CeapAdapter());
    }
}
