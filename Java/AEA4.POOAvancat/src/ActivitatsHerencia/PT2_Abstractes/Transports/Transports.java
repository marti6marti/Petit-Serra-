package ActivitatsHerencia.PT2_Abstractes.Transports;

public abstract class Transports {
    public int id;
    public double velocitat;

    public Transports(int id, double velocitat) {
        this.id = id;
        this.velocitat = velocitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(double velocitat) {
        this.velocitat = velocitat;
    }

    public void temps(double KmRecorre){
        double temps = KmRecorre/velocitat;
        int hores = (int) temps;
        double minutsDecimal = (temps - hores) * 60;
        int minuts = (int) minutsDecimal;
        int segons = (int) ((minutsDecimal - minuts) * 60);

        System.out.println("Tardarà: " + hores + " hores, " + minuts + " minuts i " + segons + " segons.");
    }

    public abstract double factura(double KmRecorre);
}
