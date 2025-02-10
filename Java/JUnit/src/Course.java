import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private int maxStudents;
    private List<Student> students;


    public Course(String title, int maxStudents) {
        this.title = title;
        this.maxStudents = maxStudents;
        this.students = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public List<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student) {
        if (students.size() >= maxStudents) {
            throw new IllegalStateException("El curs està ple.");
        }
        students.add(student);
    }


    public void removeStudent(String name) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
        } else {
            throw new IllegalArgumentException("No s'ha trobat l'estudiant: " + name);
        }
    }


    public boolean isStudentEnrolled(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public double calculateAverageGrade() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No hi ha estudiants al curs.");
        }
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return sum / students.size();
    }

    public Student findTopStudent() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No hi ha estudiants al curs.");
        }
        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getGrade() > topStudent.getGrade()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}