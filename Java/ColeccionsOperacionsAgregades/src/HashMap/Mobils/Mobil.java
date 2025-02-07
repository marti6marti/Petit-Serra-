package HashMap.Mobils;

public class Mobil {
    private String marca;
    private String model;
    private int num;

    public Mobil(String marca, String model, int num) {
        this.marca = marca;
        this.model = model;
        this.num = num;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", num=" + num +
                '}';
    }
}
