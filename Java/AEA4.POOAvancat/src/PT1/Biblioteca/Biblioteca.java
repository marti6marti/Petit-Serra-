package PT1.Biblioteca;


import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Fitxa> fitxes;

    public Biblioteca() {
        this.fitxes = new ArrayList<>();
    }

    public void comprobarReferencia(Fitxa newFitxa){
        for (Fitxa f : fitxes){
            if (newFitxa.equals(f)){
                System.out.println("Aquesta referencia ja existeix");
            } else {
                System.out.println("afegit");
                fitxes.add(newFitxa);
            }
        }
    }
}
