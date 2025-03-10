package PT2_Abstractes.Aquarium;

public class Planta extends Orgamisme {
    public String tipus;

    public Planta(String nom, String familia, String tipusLlum, double tMax, double tMin, double phMax, double phMin, String tipus) {
        super(nom, familia, tipusLlum, tMax, tMin, phMax, phMin);
        if (tipus == "S" || tipus == "B" || tipus == "R") {
            this.tipus = tipus;
        }else {
            System.out.println("tipus incorrecte");
        }
    }

    public String getDescripcioTipus() {
        switch (tipus) {
            case "S":
                return "Tija";
            case "B":
                return "Bulb";
            case "R":
                return "Arrels";
            default:
                return "Desconegut";
        }
    }
}
