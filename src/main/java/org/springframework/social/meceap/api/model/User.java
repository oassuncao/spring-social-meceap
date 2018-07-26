package org.springframework.social.meceap.api.model;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public abstract class User {
// ------------------------------ FIELDS ------------------------------

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
