package org.springframework.social.meceap.builder;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class BaseOperation {
// ------------------------------ FIELDS ------------------------------

    private final String authorizeUrl;
    private final String tokenUrl;

// --------------------------- CONSTRUCTORS ---------------------------

    BaseOperation(String authorizeUrl, String tokenUrl) {
        this.authorizeUrl = authorizeUrl;
        this.tokenUrl = tokenUrl;
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }
}
