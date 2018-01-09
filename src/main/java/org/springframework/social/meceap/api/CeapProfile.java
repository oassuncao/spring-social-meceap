package org.springframework.social.meceap.api;

/**
 * @author Silvio Assunção
 * @since 1.0
 */
public class CeapProfile {
// ------------------------------ FIELDS ------------------------------

    private String id;
    private String name;
    private String email;
    private String uniqueIdentifier;

// --------------------- GETTER / SETTER METHODS ---------------------

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }
}
