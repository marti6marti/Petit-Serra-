package mobils2;

import java.util.HashMap;
import java.util.Map;

public class Inventari {
    private HashMap<String, Mobil> inventari;

    public Inventari() {
        this.inventari = new HashMap<>();
    }

    public void afegirMobil(String dni,Mobil mobil){
        if (inventari.containsKey(dni)){
            System.out.println("error , ja existeix un");
        }else {
            inventari.put(dni, mobil);
        }
    }

    public void treureMobil (String dni){
        inventari.remove(dni);
    }

    public Mobil buscarMobilAmbDni(String dni){
        return inventari.get(dni);
    }

    public String buscarDniPerNumero(String numero){
        return inventari.entrySet().stream()
                .filter(entry -> entry.getValue().getNumero().equals(numero))
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }

    public void mostrarInventari (){
       inventari.forEach((dni,mobil) -> System.out.println(dni + mobil));
    }
}
