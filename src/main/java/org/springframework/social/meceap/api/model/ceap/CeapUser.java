package org.springframework.social.meceap.api.model.ceap;

import org.springframework.social.meceap.api.model.User;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapUser extends User {
// ------------------------------ FIELDS ------------------------------

    private String id;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
