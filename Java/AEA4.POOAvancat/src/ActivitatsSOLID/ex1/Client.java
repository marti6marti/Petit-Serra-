package ActivitatsSOLID.ex1;

public class Client {
    public static void main(String[] args) {

        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        SeniorityChecker seniorityChecker = new SeniorityChecker();
        EmployeePrinter printer = new EmployeePrinter(seniorityChecker, idGenerator);


        Employee robin = new Employee("Robin", "Smith", 7.5);
        printer.displayEmpDetail(robin);

        System.out.println("\n*******\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        printer.displayEmpDetail(kevin);
    }
}
