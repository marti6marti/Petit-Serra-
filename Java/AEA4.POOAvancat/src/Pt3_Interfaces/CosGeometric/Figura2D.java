package Pt3_Interfaces.CosGeometric;

public abstract sealed class Figura2D extends FiguraGeometrica implements Calculs2D permits Cercle, Rectangle{
    public Figura2D(int idFigura) {
        super(idFigura);
    }
}