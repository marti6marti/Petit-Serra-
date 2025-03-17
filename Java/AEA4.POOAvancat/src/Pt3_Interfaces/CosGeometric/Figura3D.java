package Pt3_Interfaces.CosGeometric;

public abstract sealed class Figura3D extends FiguraGeometrica implements Calculs3D permits Cilindre, Piramide{
    public Figura3D(int idFigura) {
        super(idFigura);
    }
}
