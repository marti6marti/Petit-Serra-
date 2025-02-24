package PT1.School;

import java.util.HashSet;

public class Teacher extends Person {
    HashSet<String> subjects;

    public Teacher() {
        this.subjects = new HashSet<>();
        System.out.println("Sóc el constructor de la classe Teacher");

    }

    public HashSet<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashSet<String> subjects) {
        this.subjects = subjects;
    }
}
