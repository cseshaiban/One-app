package com.incture.oneapp.tacquisition;

/**
 * Created by harshu on 9/24/2015.
 */
public class SavedItem {

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    String jobrole;

    public String joblocation;

    public String getJoblocation(){
        return joblocation;
    }

    public void setJoblocation(String joblocation) {
        this.joblocation = joblocation;
    }

    public String jobdescription;
    public String getJobdescription()
    {
        return jobdescription;
    }
    public void setJobdescription()
    {
        this.jobdescription=jobdescription;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFavourite() {
        return favourite;
    }

    public void setFavourite(int favourite) {
        this.favourite = favourite;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    String experience;
    String time;
    int favourite;

    public SavedItem(String j,String d,String e,String l,String t,int f){
        this.jobrole=j;
        this.experience=e;
        this.joblocation=l;
        this.time=t;
        this.favourite=f;
        this.jobdescription=d;

    }

}
