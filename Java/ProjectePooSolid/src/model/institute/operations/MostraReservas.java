package model.institute.operations;

public class MostraReservas {
    public String mostrareservas() {
        for (int i = 0; i < reserves.size(); i++) {
            System.out.println(reserves.get(i));
        }
        return "";
    }
}
