package org.springframework.social.meceap.connect.ceap;

import org.springframework.social.meceap.api.ceap.CeapApiBinding;
import org.springframework.social.meceap.api.model.ceap.CeapUser;
import org.springframework.social.meceap.connect.AbstractAdapter;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapAdapter extends AbstractAdapter<CeapUser, CeapApiBinding> {
// -------------------------- OTHER METHODS --------------------------

    protected CeapUser getUser(CeapApiBinding api) {
        return api.userOperations().getUser();
    }
}
