package HashMap.Curs;

import java.util.HashMap;

public class CourseManager {
    private HashMap<String, Student> students;

    public CourseManager() {
        this.students = new HashMap<>();
    }

    public void enrollStudent(Student student) {
        if (students.containsKey(student.getIdStudent())) {
            System.out.println("Aquest estudiant ja està inscrit.");
        } else {
            students.put(student.getIdStudent(), student);
            System.out.println("Estudiant inscrit correctament.");
        }
    }

    public void unenrollStudent(String id) {
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("Matrícula anul·lada correctament.");
        } else {
            System.out.println("No s'ha trobat cap estudiant amb aquest ID.");
        }
    }

    public void findStudentById(String id) {
        if (students.containsKey(id)) {
            System.out.println(students.get(id));
        } else {
            System.out.println("No s'ha trobat cap estudiant amb aquest ID.");
        }
    }

    public void listAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No hi ha estudiants inscrits.");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }
}

