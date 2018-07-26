package org.springframework.social.meceap.builder;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class BaseOperationBuilder {
// ------------------------------ FIELDS ------------------------------

    private static final String AUTHORIZE_ENDPOINT = "/oauth/authorize";
    private static final String TOKEN_ENDPOINT = "/oauth/token";

    private String authorizeUrl;
    private String tokenUrl;

// -------------------------- STATIC METHODS --------------------------

    public static BaseOperationBuilder url(String baseUrl) {
        return new BaseOperationBuilder(baseUrl + AUTHORIZE_ENDPOINT, baseUrl + TOKEN_ENDPOINT);
    }

    public static BaseOperationBuilder url(String authorizeUrl, String tokenUrl) {
        return new BaseOperationBuilder(authorizeUrl, tokenUrl);
    }

// --------------------------- CONSTRUCTORS ---------------------------

    private BaseOperationBuilder(String authorizeUrl, String tokenUrl) {
        this.authorizeUrl = authorizeUrl;
        this.tokenUrl = tokenUrl;
    }

// -------------------------- OTHER METHODS --------------------------

    public BaseOperation build() {
        return new BaseOperation(authorizeUrl, tokenUrl);
    }
}
