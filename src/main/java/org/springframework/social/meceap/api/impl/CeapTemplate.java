package org.springframework.social.meceap.api.impl;

import org.springframework.social.meceap.api.Ceap;
import org.springframework.social.meceap.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.URIBuilder;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapTemplate extends AbstractOAuth2ApiBinding implements Ceap {
// ------------------------------ FIELDS ------------------------------

    public static String PROVIDER = "meceap";

    private final String baseUrl;
    private final UserOperations userOperations;

// --------------------------- CONSTRUCTORS ---------------------------

    public CeapTemplate(String baseUrl) {
        this(baseUrl, null, false);
    }

    public CeapTemplate(String baseUrl, String accessToken) {
        this(baseUrl, accessToken, true);
    }

    private CeapTemplate(String baseUrl, String accessToken, boolean isAuthorizedForUser) {
        super(accessToken);
        this.baseUrl = baseUrl;

        userOperations = new UserTemplate(this, isAuthorizedForUser);
    }

// ------------------------ INTERFACE METHODS ------------------------


// --------------------- Interface Ceap ---------------------

    public UserOperations userOperations() {
        return userOperations;
    }

// -------------------------- OTHER METHODS --------------------------

    public URIBuilder getUrl(String uri) {
        return URIBuilder.fromUri(baseUrl + uri);
    }
}
