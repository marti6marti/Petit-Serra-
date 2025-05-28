import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Doctor {
        private String name;
        private String specialization;
        private List<Patient> patients;

        public Doctor(String name, String specialization) {
            this.name = name;
            this.specialization = specialization;
            this.patients = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public String getSpecialization() {
            return specialization;
        }

        public List<Patient> getPatients() {
            return patients;
        }

        public void addPatient(Patient patient) {
            patients.add(patient);
        }

        public boolean hasPatient(String name) {
            boolean checker = false;
            Iterator<Patient> patientIterator = patients.iterator();

            while (patientIterator.hasNext()){
                Patient patient = patientIterator.next();
                if (patient.getName().equalsIgnoreCase(name)){
                    checker = true;
                    break;
                }
            }
            return checker;
        }

        public void removePatient(String name){
            Iterator<Patient> patientIterator = patients.iterator();
                boolean found = false;

            while (patientIterator.hasNext()){
                Patient patient = patientIterator.next();
                if (patient.getName().equalsIgnoreCase(name)){
                    patients.remove(patient);
                    found = true;
                    break;
                }
            }
            if(!found){
                throw new NoSuchElementException("The patient was not found");
            }
        }

        public List<Patient> getPatientsWithDiagnosis(String diagnosis){
            List<Patient> patientsWithDiagnosis = new ArrayList<>();
            Iterator<Patient> patientIterator = patients.iterator();

            while (patientIterator.hasNext()){
                Patient patient = patientIterator.next();
                if (patient.getDiagnosis().equalsIgnoreCase(diagnosis)){
                    patientsWithDiagnosis.add(patient);
                }
            }
            return patientsWithDiagnosis;
        }

        public void notifyPatients(String message){
            Iterator<Patient> patientIterator = patients.iterator();

            while (patientIterator.hasNext()){
                Patient patient = patientIterator.next();
                System.out.println(patient.getName() + ": " + message);
                }
            }

        public String generatePatientsReport(){
            return patients.toString();
        }
}
