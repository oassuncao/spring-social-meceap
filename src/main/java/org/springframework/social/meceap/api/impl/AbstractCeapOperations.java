package org.springframework.social.meceap.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;

import java.net.URI;
import java.util.Collections;
import java.util.Map;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class AbstractCeapOperations {
// ------------------------------ FIELDS ------------------------------

    protected final CeapTemplate ceap;
    private final boolean isAuthorized;

// --------------------------- CONSTRUCTORS ---------------------------

    public AbstractCeapOperations(CeapTemplate ceap, boolean isAuthorized) {
        this.ceap = ceap;
        this.isAuthorized = isAuthorized;
    }

// -------------------------- OTHER METHODS --------------------------

    protected URI buildUri(String path) {
        return buildUri(path, Collections.<String, String>emptyMap());
    }

    protected URI buildUri(String path, Map<String, String> params) {
        URIBuilder uriBuilder = ceap.getUrl(path);
        for (String paramName : params.keySet()) {
            uriBuilder.queryParam(paramName, String.valueOf(params.get(paramName)));
        }
        return uriBuilder.build();
    }

    protected <T> T get(URI uri, Class<T> responseType) {
        return ceap.getRestTemplate().getForObject(uri, responseType);
    }

    protected void requireUserAuthorization() {
        if (!isAuthorized) {
            throw new MissingAuthorizationException(CeapTemplate.PROVIDER);
        }
    }
}
