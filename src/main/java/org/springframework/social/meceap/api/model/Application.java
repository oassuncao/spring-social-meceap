package org.springframework.social.meceap.api.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class Application {
// ------------------------------ FIELDS ------------------------------

    private String name;
    private List<Group> groups;
    private List<Role> roles;

    @XmlElementWrapper(name = "groups")
    @XmlElement(name = "group")
    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @XmlElementWrapper(name = "roles")
    @XmlElement(name = "role")
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
// --------------------- GETTER / SETTER METHODS ---------------------

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
