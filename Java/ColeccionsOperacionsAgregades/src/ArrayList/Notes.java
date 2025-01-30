package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes {
    ArrayList<Float> notes;

    public Notes(){
        notes = new ArrayList<>();
    }

    public void introdueixValors (Float nota) {
        notes.add(nota);
    }

    public void sumaValors (){
        Float suma= 0F;
        for (int i = 0; i < notes.size(); i++) {
            suma += notes.get(i);
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notes notes = new Notes();

        // primer ap
        Float valor = 0F;
        while (valor != -1){
            valor = sc.nextFloat();
            if (valor == -1){
                break;
            }
            notes.introdueixValors(valor);
        }
        // segon ap
        notes.sumaValors();
    }
}
