package org.springframework.social.meceap.api.ceap;

import org.springframework.social.meceap.api.model.ceap.CeapProfile;
import org.springframework.social.meceap.api.model.ceap.CeapUser;

/**
 * @author Silvio Assunção
 * @since 4.1
 */
public interface CeapUserOperations {
// -------------------------- OTHER METHODS --------------------------

    CeapProfile getProfile();

    CeapUser getUser();
}
