package org.springframework.social.meceap.api.custom;

import org.springframework.social.ApiBinding;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public interface CustomApiBinding extends ApiBinding {
// -------------------------- OTHER METHODS --------------------------

    CustomUserOperations userOperations();
}
