package PT2.Aquarium;

public class Orgamisme {
    public String nom;
    public String familia;
    public String tipusLlum;       //pot ser H M L
    public double tMax;
    public double tMin;
    public double phMax;
    public double phMin;

    public Orgamisme(String nom, String familia, String tipusLlum, double tMax, double tMin, double phMax, double phMin) {
        this.nom = nom;
        this.familia = familia;

        if (tipusLlum == "H" || tipusLlum == "M" || tipusLlum == "L") {
            this.tipusLlum = tipusLlum;
        }else {
            System.out.println("tipus incorrecte");
        }

        this.tMax = tMax;
        this.tMin = tMin;
        this.phMax = phMax;
        this.phMin = phMin;
    }

    public String getDescripcioLlum() {
        switch (tipusLlum) {
            case "H":
                return "Alta";
            case "M":
                return "Mitjana";
            case "L":
                return "Baixa";
            default:
                return "Desconegut";
        }
    }

    public String getMargesAcidesa() {
        return phMin + "-" + phMax;
    }

    public String getMargesTemperatura() {
        return tMin + "-" + tMax;
    }

    @Override
    public String toString() {
        return "Orgamismes{" +
                "nom='" + nom + '\'' +
                ", familia='" + familia + '\'' +
                ", tipusLlum='" + tipusLlum + '\'' +
                ", tMax=" + tMax +
                ", tMin=" + tMin +
                ", phMax=" + phMax +
                ", phMin=" + phMin +
                '}';
    }
}

