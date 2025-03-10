package PT2_Abstractes.Aquarium;

public class Peix extends Orgamisme {
    public String procedencia;
    public String dieta;   // w o l
    public double longCm;


    public Peix(String nom, String familia, String tipusLlum, double tMax, double tMin, double phMax, double phMin, String procedencia, String dieta, double longCm) {
        super(nom, familia, tipusLlum, tMax, tMin, phMax, phMin);
        this.procedencia = procedencia;
        if (dieta == "W" || dieta == "O" || dieta == "L") {
            this.dieta = dieta;
        }else {
            System.out.println("tipus incorrecte");
        }
        this.longCm = longCm;
    }

    public String getDescripcioDieta() {
        switch (dieta) {
            case "W":
                return "Algues";
            case "O":
                return "Omnívor";
            case "L":
                return "Fulles";
            default:
                return "Desconegut";
        }
    }


}
