package org.springframework.social.meceap.api;

import org.springframework.social.ApiBinding;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public interface DefaultApiBinding extends ApiBinding {
// -------------------------- OTHER METHODS --------------------------

    UserOperations userOperations();
}
