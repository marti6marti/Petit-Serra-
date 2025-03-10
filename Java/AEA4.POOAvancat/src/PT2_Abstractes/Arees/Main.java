package PT2_Abstractes.Arees;

public class Main {
    public static void main(String[] args) {
        Aula a1 = new Aula("0000", 50, true, 2.5, 25, true, 1, true);
        AulaInformatica aInf = new AulaInformatica("2006", 40, true, 3, 20, false, 15, true, 2);
        Gimnas gim = new Gimnas("007", 200, false, 1.5, true, 10);

        System.out.println();
        System.out.println("Consum total de l'aula: " + a1.calcularConsumTotal() + " Kwh");
        System.out.println("Espai per estudiant a l'aula: " + a1.calcularEspaiPerEstudiant() + " m2");

        System.out.println();
        System.out.println("Consum total de l'aula d'informatica: " + aInf.calcularConsumTotal() + " Kwh");
        System.out.println("Espai per estudiant a l'aula d'informatica: " + aInf.calcularEspaiPerEstudiant() + " m2");

        System.out.println();
        System.out.println("Consum total del gimnas: " + gim.calcularConsumTotal() + " Kwh");
        System.out.println("Espai per estudiant al gimnas: " + gim.calcularEspaiPerEstudiant() + " m2");
    }
}
