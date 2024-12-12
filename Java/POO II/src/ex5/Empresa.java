package ex5;

public class Empresa {
    private String NomEmpresa;
    private int CIF;
    private String SectorEmpreserial;

    public Empresa(String nomEmpresa, int CIF, String sectorEmpreserial) {
        NomEmpresa = nomEmpresa;
        this.CIF = CIF;
        SectorEmpreserial = sectorEmpreserial;
    }

    public String getNomEmpresa() {
        return NomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        NomEmpresa = nomEmpresa;
    }

    public String getSectorEmpreserial() {
        return SectorEmpreserial;
    }

    public void setSectorEmpreserial(String sectorEmpreserial) {
        SectorEmpreserial = sectorEmpreserial;
    }

    public int getCIF() {
        return CIF;
    }

    public void setCIF(int CIF) {
        this.CIF = CIF;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "NomEmpresa='" + NomEmpresa + '\'' +
                ", CIF=" + CIF +
                ", SectorEmpreserial='" + SectorEmpreserial + '\'' +
                '}';
    }
}
