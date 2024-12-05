package Ex2;

public class PermisTest {
    public static void main(String[] args) {
        PermisConduir permisConduir1 = new PermisConduir();
        PermisConduir permisConduir2 = new PermisConduir();

        permisConduir1.setNom("Martí");
        permisConduir1.setTipusPermis("A1");
        permisConduir1.setPunts(8);

        permisConduir2.setNom("Marc");
        permisConduir2.setTipusPermis("B2");
        permisConduir2.setPunts(6);

        permisConduir1.restarPunts(3);
        permisConduir1.imprimirPermis();
        permisConduir2.imprimirPermis();


    }
}
