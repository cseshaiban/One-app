package com.incture.oneapp.likeminds.Data;

import java.util.List;

/**
 * Created by Arjun on 05-09-2015.
 */
public class Profile {

    String title, name, emailId;


    List<ProfileListItem> personalDetails;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<ProfileListItem> getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(List<ProfileListItem> personalDetails) {
        this.personalDetails = personalDetails;
    }

    public List<ProfileListItem> getEmergencyDetails() {
        return emergencyDetails;
    }

    public void setEmergencyDetails(List<ProfileListItem> emergencyDetails) {
        this.emergencyDetails = emergencyDetails;
    }

    public List<ProfileListItem> getFamilyDetails() {
        return familyDetails;
    }

    public void setFamilyDetails(List<ProfileListItem> familyDetails) {
        this.familyDetails = familyDetails;
    }

    public List<ProfileListItem> getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(List<ProfileListItem> eventDetails) {
        this.eventDetails = eventDetails;
    }

    List<ProfileListItem> emergencyDetails;


    List<ProfileListItem> familyDetails;


    List<ProfileListItem> eventDetails;

    public List<ProfileListItem> getOrgData() {
        return orgData;
    }

    public void setOrgData(List<ProfileListItem> orgData) {
        this.orgData = orgData;
    }

    List<ProfileListItem> orgData;


}
