import java.util.ArrayList;

import java.util.List;
public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization, List<Patient> patients) {
        this.name = name;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public boolean hasPatient(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public void removePatient(String name){
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                patients.remove(patient);
            } else {
                System.out.println("This patient not exist");
            }
        }
    }

    public List getPatientsWithDiagnosis(String diagnosis){
        List patientsDiagnostic = new ArrayList<>();

        for (Patient patient : patients) {
            if (patient.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                patientsDiagnostic.add(patient);
            } else {
                System.out.println("no hi ha pacients amb aquest diagnostic");
            }
        }
        return patientsDiagnostic;
    }

    public void notifyPatients(String message) {
        for (Patient patient : patients) {
            System.out.println(patient.getName() + ": " + message);
        }
    }

    public List<Patient> generatePatientReport() {
        return patients;
    }


}