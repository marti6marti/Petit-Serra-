package PT1_Herència.Biblioteca1;

import PT1_Herència.Biblioteca1.Biblioteca.*;

public class ProvaFitxes {
    public static void main(String[] args) {
        Fitxa fitxa1 = new Fitxa("hola", "Bondía");
        Fitxa fitxa2 = new Obra("mec", "Bondía","Mario",(short)12);
        Fitxa fitxa3 = new Volum("hola", "Bondía","Mario",(short)12,(short)14);
        Fitxa fitxa4 = new Revista("32","peix",(short)2006,(short)14);

        Biblioteca b1 = new Biblioteca();

        b1.comprobarReferenciaPerAdd(fitxa1);
        b1.comprobarReferenciaPerAdd(fitxa2);
        b1.comprobarReferenciaPerAdd(fitxa3);
        b1.comprobarReferenciaPerAdd(fitxa4);


    }
}
