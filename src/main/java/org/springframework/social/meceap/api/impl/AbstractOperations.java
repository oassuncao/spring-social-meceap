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
public class AbstractOperations {
// ------------------------------ FIELDS ------------------------------

    private final String providerId;
    private final DefaultTemplate template;
    private final boolean isAuthorized;

// --------------------------- CONSTRUCTORS ---------------------------

    public AbstractOperations(String providerId, DefaultTemplate template, boolean isAuthorized) {
        this.providerId = providerId;
        this.template = template;
        this.isAuthorized = isAuthorized;
    }

// -------------------------- OTHER METHODS --------------------------

    protected URI buildUri(String baseUrl, String path) {
        return buildUri(baseUrl, path, Collections.<String, String>emptyMap());
    }

    protected URI buildUri(String baseUrl, String path, Map<String, String> params) {
        URIBuilder uriBuilder = getUrl(baseUrl, path);
        for (String paramName : params.keySet()) {
            uriBuilder.queryParam(paramName, String.valueOf(params.get(paramName)));
        }
        return uriBuilder.build();
    }

    public URIBuilder getUrl(String baseUrl, String uri) {
        if (baseUrl == null)
            return URIBuilder.fromUri(uri);
        return URIBuilder.fromUri(baseUrl + uri);
    }

    protected <T> T get(URI uri, Class<T> responseType) {
        return template.getRestTemplate().getForObject(uri, responseType);
    }

    protected void requireUserAuthorization() {
        if (!isAuthorized)
            throw new MissingAuthorizationException(providerId);
    }
}
