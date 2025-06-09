import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class DoctorTest {


    @Test
    void testAddPatientIncreasesPatientCount() {
        Patient pati = new Patient("miqu",14,"curtet");
        Doctor dc = new Doctor("marti", "dentista");

        dc.addPatient(pati);
        Assertions.assertEquals(1,dc.getPatients().size());
    }

    @Test
    void testHasPatientReturnsCorrectValue() {
        Patient pati = new Patient("miqu",14,"curtet");
        Doctor dc = new Doctor("marti", "dentista");

        dc.addPatient(pati);
        Assertions.assertTrue(dc.hasPatient("miqu"));
    }

    @Test
    void testRemovePatientWorksCorrectly() {
        Patient pati = new Patient("miqu",14,"curtet");
        Doctor dc = new Doctor("marti", "dentista");
        dc.addPatient(pati);
        dc.removePatient("miqu");
        Assertions.assertEquals(0,dc.getPatients().size());
        Assertions.assertFalse(dc.hasPatient("miqu"));
    }

    @Test
    void testRemovePatientThrowsExceptionWhenNotFound() {
        Patient pati = new Patient("miqu",14,"curtet");
        Doctor dc = new Doctor("marti", "dentista");
        dc.addPatient(pati);
        dc.removePatient("miqu");
        Assertions.assertEquals(1,dc.getPatients().size());
        Assertions.assertTrue(dc.hasPatient("miqu"));
    }

    @Test
    void testGetPatientsWithDiagnosisReturnsCorrectPatients() {
        Doctor dc = new Doctor("Martí", "digestiu");
        Patient p1 = new Patient("Anna", 28, "gastritis");
        Patient p2 = new Patient("Biel", 35, "úlcera");
        Patient p3 = new Patient("Carla", 22, "gastritis");

        dc.addPatient(p1);
        dc.addPatient(p2);
        dc.addPatient(p3);

        List<Patient> result = dc.getPatientsWithDiagnosis("gastritis");

        Assertions.assertEquals(2, result.size());
        Assertions.assertTrue(result.contains(p1));
        Assertions.assertTrue(result.contains(p3));
        Assertions.assertFalse(result.contains(p2));
    }


    @Test
    void testGeneratePatientReportReturnsCorrectFormat() {
        Doctor dc = new Doctor("Martí", "dermatologia");
        Patient p1 = new Patient("Núria", 40, "eczema");
        Patient p2 = new Patient("Lluc", 31, "acne");

        dc.addPatient(p1);
        dc.addPatient(p2);

        List<Patient> report = dc.generatePatientReport();

        Assertions.assertEquals(2, report.size());
        Assertions.assertEquals(p1, report.get(0));
        Assertions.assertEquals(p2, report.get(1));
    }


}