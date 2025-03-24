package ActivitatsHerencia.Pt3_Interfaces.CosGeometric;

public abstract sealed class FiguraGeometrica permits Figura2D, Figura3D {
    protected int idFigura;

    public FiguraGeometrica(int idFigura) {
        this.idFigura = idFigura;

    }
}