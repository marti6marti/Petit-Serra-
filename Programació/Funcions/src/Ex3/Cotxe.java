package Ex3;

public class Cotxe {
    private String model;
    private String matricula;


    public void setModel(String model) {
        this.model = model;
    }


    public String getModel() {
        return model;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public void imprimirCotxe(){
        System.out.println("Al model: " + model + " li correspon la matricula: " + matricula);
    }
}
