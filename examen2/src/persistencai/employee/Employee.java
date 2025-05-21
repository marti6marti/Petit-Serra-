package persistencai.employee;

public class Employee {
    public int idEmplyee;
    public String FirtsName;
    public String LastName;
    public int PostalCode;

    public Employee(int emplyeeId, String firtName, String lastName, int postalCode) {
        this.idEmplyee = emplyeeId;
        FirtsName = firtName;
        LastName = lastName;
        PostalCode = postalCode;
    }

    public Employee(){

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

    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(int postalCode) {
        PostalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplyeeId=" + idEmplyee +
                ", FirtName='" + FirtsName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", PostalCode=" + PostalCode +
                '}';
    }
}
