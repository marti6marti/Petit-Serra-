package PT1_Herència.Biblioteca2.Biblioteca;


import java.util.ArrayList;

public class Biblioteca {
    public int dimencio;
    public ArrayList<Fitxa> fitxes;

    public Biblioteca(int dimencio) {
        this.dimencio = dimencio;
        this.fitxes = new ArrayList<>();
    }

    public int capacitat() {
        return dimencio;
    }

    public int nElements() {
        return fitxes.size();
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

    public Fitxa extreureFixaByReferencia(String referencia) {
        boolean trobat = false;
        for (Fitxa f : fitxes){
            if (f.getReferencia().equals(referencia)){
                trobat = true;
                return f;
            }
        }
        if (!trobat) {
            System.out.println("la referencia no existeix");
        }
        return null;
    }

    public Fitxa extreureFixaByPosicio(int posicio) {
        if (posicio < 0 || posicio >= fitxes.size()) {
            System.out.println("Posició fora dels límits.");
        }else {
            return fitxes.get(posicio);
        }
        return null;
    }

    public void allBibloteca() {
        for (Fitxa f : fitxes){
            System.out.println(f);
        }
    }

}
