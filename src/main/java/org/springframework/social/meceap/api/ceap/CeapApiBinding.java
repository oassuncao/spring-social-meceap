package org.springframework.social.meceap.api.ceap;

import org.springframework.social.ApiBinding;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public interface CeapApiBinding extends ApiBinding {

    CeapUserOperations userOperations();
}
