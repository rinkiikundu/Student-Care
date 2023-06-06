/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ImmunizationClass {
@Id
    private int personID;
    private String vaccine;
    private Date vaccine1Dose1;
    private Date vaccine1Dose2;
    private String vaccine2;
    private Date vaccine2Dose1;

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String readVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public Date getVaccine1Dose1() {
        return vaccine1Dose1;
    }

    public void setVaccine1Dose1(Date vaccine1Dose1) {
        this.vaccine1Dose1 = vaccine1Dose1;
    }

    public Date getVaccine1Dose2() {
        return vaccine1Dose2;
    }

    public void setVaccine1Dose2(Date vaccine1Dose2) {
        this.vaccine1Dose2 = vaccine1Dose2;
    }

    public String readVaccine2() {
        return vaccine2;
    }

    public void setVaccine2(String vaccine2) {
        this.vaccine2 = vaccine2;
    }

    public Date getVaccine2Dose1() {
        return vaccine2Dose1;
    }

    public void setVaccine2Dose1(Date vaccine2Dose1) {
        this.vaccine2Dose1 = vaccine2Dose1;
    }

    public ImmunizationClass(int personID, String vaccine, Date vaccine1Dose1, Date vaccine1Dose2, 
            String vaccine2, Date vaccine2Dose1) {
        this.personID = personID;
        this.vaccine = vaccine;
        this.vaccine1Dose1 = vaccine1Dose1;
        this.vaccine1Dose2 = vaccine1Dose2;
        this.vaccine2 = vaccine2;
        this.vaccine2Dose1 = vaccine2Dose1;
    }

    public ImmunizationClass() {
    }

    public ImmunizationClass(String csv){
    try {
            String[] field = csv.split(",");
            this.personID = Integer.parseInt(field[0]);
            this.vaccine = field[1];
            this.vaccine1Dose1 = validDateString(field[2]);
            this.vaccine1Dose2 = validDateString(field[3]);
            this.vaccine2 = field[4];
            this.vaccine2Dose1 = validDateString(field[5]);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public Date validDateString(String date) {
        if (date.equals(" ") || date == null || date.isEmpty()) {
            return null;
        } else {
            try {
                return new SimpleDateFormat("MM/dd/yyyy").parse(date);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
