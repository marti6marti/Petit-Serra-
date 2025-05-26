package ra8i9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Employee {
    public int idEmplyee;
    public String FirtsName;
    public String LastName;
    public String title;
    public Employee reportsTo;
    public LocalDate birthDate;
    public LocalDate hireDate;
    public String correu;
    public ArrayList<Customer> clients;

    public Employee(){
    }

    public Employee(int idEmplyee, String firtsName, String lastName, String title, Employee reportsTo, LocalDate birthDate, LocalDate hireDate, String correu, ArrayList<Customer> clients) {
        this.idEmplyee = idEmplyee;
        FirtsName = firtsName;
        LastName = lastName;
        this.title = title;
        this.reportsTo = reportsTo;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.correu = correu;
        this.clients = new ArrayList<>();
    }

    public int getIdEmplyee() {
        return idEmplyee;
    }

    public void setIdEmplyee(int idEmplyee) {
        this.idEmplyee = idEmplyee;
    }

    public String getFirtsName() {
        return FirtsName;
    }

    public void setFirtsName(String firtsName) {
        FirtsName = firtsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmplyee=" + idEmplyee +
                ", FirtsName='" + FirtsName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", title='" + title + '\'' +
                ", reportsTo=" + reportsTo +
                ", birthDate=" + birthDate +
                ", hireDate=" + hireDate +
                ", correu='" + correu + '\'' +
                '}';
    }
}
