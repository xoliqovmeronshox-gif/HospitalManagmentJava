package service;

import model.Patient;
import java.util.ArrayList;

public class HospitalService {

    private ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("✅ Patient added successfully");
    }

    public void showPatients() {
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
