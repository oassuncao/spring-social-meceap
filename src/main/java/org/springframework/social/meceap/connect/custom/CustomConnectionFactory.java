package org.springframework.social.meceap.connect.custom;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.meceap.api.custom.CustomApiBinding;
import org.springframework.social.meceap.builder.BaseOperation;
import org.springframework.social.meceap.builder.UserOperation;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomConnectionFactory extends OAuth2ConnectionFactory<CustomApiBinding> {
// --------------------------- CONSTRUCTORS ---------------------------

    public CustomConnectionFactory(String providerId, String clientId, String clientSecret, BaseOperation baseOperation, UserOperation userOperation) {
        super(providerId, new CustomServiceProvider(providerId, clientId, clientSecret, baseOperation, userOperation), new CustomAdapter());
    }
}
