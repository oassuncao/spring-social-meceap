package org.springframework.social.meceap.api.model.custom;

import org.springframework.social.meceap.api.model.Application;
import org.springframework.social.meceap.api.model.User;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Silvio Assunção
 * @since 4.0
 */
public class CustomUser extends User {
// ------------------------------ FIELDS ------------------------------

    private List<Application> applications;

// --------------------- GETTER / SETTER METHODS ---------------------

    @XmlElementWrapper(name = "applications")
    @XmlElement(name = "application")
    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
