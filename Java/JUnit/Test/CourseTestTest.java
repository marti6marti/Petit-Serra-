import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTestTest {
    private Course course;


    public void setUp() {
        course = new Course("Matemàtiques", 2);
    }

    @Test
    public void testAddStudentThrowsExceptionWhenCourseIsFull() {
        course.addStudent(new Student("Martí", 20, 90.0));
        course.addStudent(new Student("Júlia", 21, 85.0));

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            course.addStudent(new Student("Pau", 22, 80.0));
        });

        assertEquals("El curs està ple.", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "90.0, 85.0, 87.5",
            "100.0, 50.0, 75.0",
            "70.0, 80.0, 75.0"
    })


    public void testCalculateAverageGradeReturnsCorrectValue(double grade1, double grade2, double expected) {
        course.addStudent(new Student("Martí", 20, grade1));
        course.addStudent(new Student("Júlia", 21, grade2));

        assertEquals(expected, course.calculateAverageGrade(), 0.01);
    }

    @Test
    public void testCalculateAverageGradeThrowsExceptionWhenNoStudents() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            course.calculateAverageGrade();
        });
        assertEquals("No hi ha estudiants al curs.", exception.getMessage());
    }

    @Test
    public void testFindTopStudentReturnsCorrectStudent() {
        Student marti = new Student("Martí", 20, 90.0);
        Student julia = new Student("Júlia", 21, 85.0);
        course.addStudent(marti);
        course.addStudent(julia);
        assertEquals(marti, course.findTopStudent());
    }

    @Test
    public void testFindTopStudentThrowsExceptionWhenNoStudents() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            course.findTopStudent();
        });
        assertEquals("No hi ha estudiants al curs.", exception.getMessage());
    }

    @Test
    public void testRemoveStudentWorksCorrectly() {
        Student marti = new Student("Martí", 20, 90.0);
        course.addStudent(marti);
        course.removeStudent("Martí");
        assertFalse(course.isStudentEnrolled("Martí"));
    }

    @Test
    public void testRemoveStudentThrowsExceptionWhenStudentNotFound() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            course.removeStudent("Martí");
        });
        assertEquals("No s'ha trobat l'estudiant: Martí", exception.getMessage());
    }

    @Test
    public void testIsStudentEnrolledReturnsTrueIfStudentExists() {
        Student marti = new Student("Martí", 20, 90.0);
        course.addStudent(marti);
        assertTrue(course.isStudentEnrolled("Martí"));
    }

    @Test
    public void testIsStudentEnrolledReturnsFalseIfStudentDoesNotExist() {
        assertFalse(course.isStudentEnrolled("Martí"));
    }
}