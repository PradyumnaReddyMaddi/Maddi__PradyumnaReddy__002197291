/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import java.util.Date;

public class PersonClass {

    public CommunityClass getCommunity() {
        return community;
    }

    public void setCommunity(CommunityClass community) {
        this.community = community;
    }

    CommunityClass community;

    public PersonClass(int patientId, String patientName, String dob, int age, CommunityClass community) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dob = dob;
        this.age = age;
        this.community = community;
    }

    public PersonClass() {
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    int patientId;
    String patientName;
    String dob;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int age;

}
