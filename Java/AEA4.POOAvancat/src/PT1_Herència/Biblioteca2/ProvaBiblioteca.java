package PT1_Herència.Biblioteca2;

import PT1_Herència.Biblioteca2.Biblioteca.*;

public class ProvaBiblioteca {
    public static void main(String[] args) {
        Fitxa fitxa1 = new Fitxa("hola", "Bondía");
        Fitxa fitxa2 = new Obra("mec", "Bondía","Mario",(short)12);
        Fitxa fitxa3 = new Volum("hola", "Bondía","Mario",(short)12,(short)14);
        Fitxa fitxa4 = new Revista("32","peix",(short)2006,(short)14);

        Biblioteca b1 = new Biblioteca(12);

        System.out.println();
        System.out.println("----------capacitat------------");
        System.out.println("la capacitat es de: " + b1.capacitat());



        System.out.println();
        System.out.println("--------comprobarReferencia i Add---------");
        b1.comprobarReferenciaPerAdd(fitxa1);
        b1.comprobarReferenciaPerAdd(fitxa2);
        b1.comprobarReferenciaPerAdd(fitxa3);
        b1.comprobarReferenciaPerAdd(fitxa4);

        System.out.println();
        System.out.println("----------------nElements-----------------");
        System.out.println("la biblioteca te : " + b1.nElements() + " elements.");

        System.out.println();
        System.out.println("--------------extreureFixaByReferencia------------");
        System.out.println(b1.extreureFixaByReferencia("mec"));

        System.out.println();
        System.out.println("--------------extreureFixaByPosicio------------------");
        System.out.println(b1.extreureFixaByPosicio(2));

        System.out.println();
        System.out.println("---------allBibloteca-------------");
        b1.allBibloteca();

    }
}
