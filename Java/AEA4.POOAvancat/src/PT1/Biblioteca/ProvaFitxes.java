package PT1.Biblioteca;

public class ProvaFitxes {
    public static void main(String[] args) {
        Fitxa fitxa1 = new Fitxa("hola", "Bondía");
        Fitxa fitxa2 = new Obra("mec", "Bondía","Mario",(short)12);
        Fitxa fitxa3 = new Volum("hola", "Bondía","Mario",(short)12,(short)14);
        Fitxa fitxa4 = new Revista("32","peix",(short)2006,(short)14);

        Biblioteca b1 = new Biblioteca();
        b1.comprobarReferencia(fitxa1);
        b1.comprobarReferencia(fitxa2);
        b1.comprobarReferencia(fitxa3);
        b1.comprobarReferencia(fitxa4);


    }
}
