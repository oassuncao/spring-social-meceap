package org.springframework.social.meceap.api.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class Group {
// ------------------------------ FIELDS ------------------------------

    private String name;

// --------------------- GETTER / SETTER METHODS ---------------------

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
