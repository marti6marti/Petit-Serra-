package ex1;

public class Casa{
    private double superfície;
    private String direcció;
    private Sala salaCasa;
    private Cuina cuinaCasa;


    public Casa(double superfície, String direcció, Sala salaCasa,Cuina cuinaCasa) {
        this.superfície = superfície;
        this.direcció = direcció;
        this.salaCasa = salaCasa;
        this.cuinaCasa = cuinaCasa;
    }
    public Casa(){
        this.superfície = 0;
        this.direcció = "desconocida";
        this.salaCasa = new Sala();
        this.cuinaCasa = new Cuina();

    }

    public Cuina getCuinaCasa() {
        return cuinaCasa;
    }

    public void setCuinaCasa(Cuina cuinaCasa) {
        this.cuinaCasa = cuinaCasa;
    }

    public double getSuperfície() {
        return superfície;
    }

    public void setSuperfície(double superfície) {
        this.superfície = superfície;
    }

    public String getDirecció() {
        return direcció;
    }

    public void setDirecció(String direcció) {
        this.direcció = direcció;
    }

    public Sala getSalaCasa() {
        return salaCasa;
    }

    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "superfície=" + superfície +
                ", direcció='" + direcció + '\'' +
                ", salaCasa=" + salaCasa +
                ", cuinaCasa=" + cuinaCasa +
                '}';
    }
}
