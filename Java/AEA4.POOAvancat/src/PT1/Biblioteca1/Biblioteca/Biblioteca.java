package PT1.Biblioteca1.Biblioteca;


import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Fitxa> fitxes;

    public Biblioteca() {
        this.fitxes = new ArrayList<>();
    }


    public void comprobarReferenciaPerAdd(Fitxa newFitxa) {
        if (fitxes.isEmpty()) {
            fitxes.add(newFitxa);
            System.out.println("Afegit: " + newFitxa);
            return;
        }

        boolean existeix = false;
        for (Fitxa f : fitxes) {
            if (f.equals(newFitxa)) {
                existeix = true;
                break;
            }
        }

        if (!existeix) {
            fitxes.add(newFitxa);
            System.out.println("Afegit: " + newFitxa);
        } else {
            System.out.println("Aquesta referencia ja existeix: " + newFitxa);
        }
    }
}
