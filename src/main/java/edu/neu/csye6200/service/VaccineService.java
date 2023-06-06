/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.service;

import edu.neu.csye6200.model.ImmunizationClass;
import edu.neu.csye6200.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class VaccineService {
    @Autowired
    VaccineRepository vaccineRepository;
    VaccineFactory vf = new VaccineFactory();

    public List<ImmunizationClass> getAllVaccinations() {
        List<ImmunizationClass> vaccinations = new ArrayList<>();
        if (vaccineRepository.findAll().iterator().hasNext()) {
            vaccineRepository.findAll().forEach(vaccinations::add);
        }
        return vaccinations;
    }

    public void saveVaccinations(List<ImmunizationClass> vaccinations) {
        vaccineRepository.saveAll(vaccinations);
    }

    public void saveVaccinations(ImmunizationClass vaccination) {
        vaccineRepository.save(vaccination);
    }

    public void saveVaccination(String csv) {
        vaccineRepository.save(vf.getObject(csv));
    }

    public Optional<ImmunizationClass> getVaccinationById(Integer id) {
        return vaccineRepository.findById(id);
    }

    public void deleteVaccinationsById(Integer id) {
        vaccineRepository.deleteById(id);
    }

    public void deleteAll() {
        vaccineRepository.deleteAll();
    }
}
