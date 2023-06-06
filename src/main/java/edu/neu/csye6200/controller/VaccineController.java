/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.controller;

import edu.neu.csye6200.model.ImmunizationClass;
import edu.neu.csye6200.service.VaccineService;
import edu.neu.csye6200.util.TestDataUtil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VaccineController {
    @Autowired
    VaccineService vaccineService;

    public void addTestData(){
        vaccineService.saveVaccinations(new TestDataUtil().populateVaccineData("src/main/resources/vaccines.csv"));
    }

    public void displayAllVaccines(){
        vaccineService.getAllVaccinations().forEach(System.out::println);
    }

    public List<ImmunizationClass> getAllVaccines(){
        return vaccineService.getAllVaccinations();
    }
    public void removeVaccineById(Integer id){
        vaccineService.deleteVaccinationsById(id);
    }
    public Optional<ImmunizationClass> getVaccinesById(Integer id){
        return vaccineService.getVaccinationById(id);
    }

    public void addVaccine(String csv){
        vaccineService.saveVaccination(csv);
    }

    public void removeAll(){
        vaccineService.deleteAll();
    }
}
