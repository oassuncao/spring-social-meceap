package org.springframework.social.meceap.connect.custom;

import org.springframework.social.meceap.api.model.custom.CustomUser;
import org.springframework.social.meceap.connect.AbstractAdapter;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomAdapter extends AbstractAdapter<CustomUser> {
// -------------------------- OTHER METHODS --------------------------

    protected Class<CustomUser> getUserClass() {
        return CustomUser.class;
    }
}
