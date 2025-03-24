package ActivitatsSOLID.ex1;

import java.util.Random;

public class EmployeeIdGenerator {
    public String generateEmpId(String firstName) {
        int random = new Random().nextInt(1000);
        return firstName.substring(0, 1).toUpperCase() + random;
    }
}
