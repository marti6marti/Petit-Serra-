package Pt3_Interfaces.CosGeometric;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura2D> figures2D = new ArrayList<>();
        ArrayList<Figura3D> figures3D = new ArrayList<>();

        Rectangle rectangle = new Rectangle(1, 8, 4);
        Cercle cercle = new Cercle(2, 6);
        Piramide piramide = new Piramide(3, 4, 10);
        Cilindre cilindre = new Cilindre(4, 7, 12);

        figures2D.add(rectangle);
        figures2D.add(cercle);
        figures3D.add(piramide);
        figures3D.add(cilindre);

        System.out.println("Figures 2D");
        System.out.println();

        for (Figura2D figura2D : figures2D) {
            System.out.println(figura2D);
            if (figura2D instanceof Cercle) {
                System.out.println("Àrea del cercle: " + cercle.area() + " m²");
                System.out.println("Perímetre del cercle: " + cercle.perimetre() + " m");
            } else if (figura2D instanceof Rectangle) {
                System.out.println("Àrea del rectangle: " + rectangle.area() + " m²");
                System.out.println("Perímetre del rectangle: " + rectangle.perimetre() + " m");
            }
            System.out.println();
        }

        System.out.println("Figures 3D");
        System.out.println();

        for (Figura3D figura3D : figures3D) {
            System.out.println(figura3D);
            if (figura3D instanceof Cilindre) {
                System.out.println("Perímetre del cilindre: " + cilindre.perimetre() + " m");
                System.out.println("Àrea del cilindre: " + cilindre.area() + " m²");
                System.out.println("Volum del cilindre: " + cilindre.volum() + " m³");
            } else if (figura3D instanceof Piramide) {
                System.out.println("Perímetre de la piràmide: " + piramide.perimetre() + " m");
                System.out.println("Àrea de la piràmide: " + piramide.area() + " m²");
                System.out.println("Volum de la piràmide: " + piramide.volum() + " m³");
            }
            System.out.println();
        }
    }
}
