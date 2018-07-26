package org.springframework.social.meceap.connect;

import org.springframework.social.meceap.api.DefaultApiBinding;
import org.springframework.social.meceap.builder.BaseOperation;
import org.springframework.social.meceap.builder.BaseOperationBuilder;
import org.springframework.social.meceap.builder.UserOperation;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public abstract class AbstractServiceProvider extends AbstractOAuth2ServiceProvider<DefaultApiBinding> {
// ------------------------------ FIELDS ------------------------------

    protected UserOperation userOperation;

// --------------------------- CONSTRUCTORS ---------------------------

    public AbstractServiceProvider(String clientId, String clientSecret, String baseUrl, UserOperation userOperation) {
        this(clientId, clientSecret, BaseOperationBuilder.url(baseUrl).build(), userOperation);
    }

    public AbstractServiceProvider(String clientId, String clientSecret, BaseOperation baseOperation, UserOperation userOperation) {
        super(new AuthTemplate(clientId, clientSecret, baseOperation.getAuthorizeUrl(), baseOperation.getTokenUrl()));
        this.userOperation = userOperation;
    }
}
