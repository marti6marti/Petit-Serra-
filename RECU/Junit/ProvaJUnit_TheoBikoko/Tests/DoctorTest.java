import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    Patient p1,p2,p3,p4;
    Doctor doctor;
    @BeforeEach
    public void initialize(){
        p1 = new Patient("Theo", 27, "Fever");
        p2 = new Patient("Steven", 25, "Tuberculose");
        p3 = new Patient("Victor", 20, "Tuberculose");
        p4 = new Patient("CJ", 38, "Cancer");
        doctor = new Doctor("Alberto Montero", "Malalties");
    }

    @Test
    public void testAddPatientIncreasesPatientCount(){
        doctor.addPatient(p1);
        assertEquals(1, doctor.getPatients().size());
        doctor.addPatient(p2);
        assertEquals(2, doctor.getPatients().size());
        doctor.addPatient(p3);
        assertEquals(3, doctor.getPatients().size());
        doctor.addPatient(p4);
        assertEquals(4, doctor.getPatients().size());
    }

    @Test
    public void testHasPatientReturnsCorrectValue(){
        doctor.addPatient(p1);
        doctor.addPatient(p2);
        assertEquals(true, doctor.hasPatient("Theo"));
        assertEquals(false, doctor.hasPatient("Victor"));
    }

    @Test
    public void testRemovePatientWorksCorrectly() {
        doctor.addPatient(p3);
        doctor.addPatient(p4);
        doctor.removePatient("Victor");
        doctor.removePatient("CJ");
        assertEquals(false, doctor.hasPatient("Victor"));
        assertEquals(false, doctor.hasPatient("CJ"));
    }

    @Test
    public void testRemovePatientThrowsExceptionWhenNotFound(){
        doctor.addPatient(p3);
        doctor.addPatient(p4);
        doctor.removePatient("Victor");
        doctor.removePatient("CJ");
        Exception exception = assertThrows(NoSuchElementException.class, () -> doctor.removePatient("CJ"));
        assertEquals("The patient was not found", exception.getMessage());

    }

    @Test
    public void testGetPatientsWithDiagnosisReturnsCorrectPatients(){
        doctor.addPatient(p1);
        doctor.addPatient(p2);
        doctor.addPatient(p3);
        doctor.addPatient(p4);

        assertTrue(doctor.getPatientsWithDiagnosis("fever").contains((p1)));
        assertTrue(doctor.getPatientsWithDiagnosis("tuberculose").contains(p2));
        assertTrue(doctor.getPatientsWithDiagnosis("tuberculose").contains(p3));
        assertTrue(doctor.getPatientsWithDiagnosis("cancer").contains(p4));
    }

    @Test
    public void testGeneratePatientReportReturnsCorrectFormat(){
       assertEquals(String.class, doctor.generatePatientsReport().getClass());
    }

}