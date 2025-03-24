package ActivitatsHerencia.PT1_Herència.School;

public class Student extends Person {
    public String cycle;
    public int course;

    public Student() {
        this.cycle = cycle;
        this.course = course;
        System.out.println("Sóc el constructor de la classe Student");

    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
