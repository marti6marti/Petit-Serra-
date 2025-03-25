package   ex1;

public class EmployeePrinter {
    private SeniorityChecker seniorityChecker;
    private EmployeeIdGenerator idGenerator;

    public EmployeePrinter(SeniorityChecker seniorityChecker, EmployeeIdGenerator idGenerator) {
        this.seniorityChecker = seniorityChecker;
        this.idGenerator = idGenerator;
    }

    public void displayEmpDetail(Employee emp) {
        System.out.println("The employee name: " + emp.lastName + ", " + emp.firstName);
        System.out.println("This employee has " + emp.experienceInYears + " years of experience.");
        System.out.println("This employee is a " + seniorityChecker.checkSeniority(emp.experienceInYears) + " employee.");
        System.out.println("Generated Employee ID: " + idGenerator.generateEmpId(emp.firstName));
    }
}
