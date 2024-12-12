package ex5;

import javax.swing.*;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Contracte {
    private int Codi;
    private LocalDate DataInici;
    private LocalDate DataFi;
    private Empresa empresa;

    public Contracte(int codi, LocalDate dataInici, LocalDate dataFi, Empresa empresa) {
        Codi = codi;
        DataInici = dataInici;
        DataFi = dataFi;
        this.empresa = empresa;
    }


    public int getCodi() {
        return Codi;
    }

    public void setCodi(int codi) {
        Codi = codi;
    }

    public LocalDate getDataInici() {
        return DataInici;
    }

    public void setDataInici(LocalDate dataInici) {
        DataInici = dataInici;
    }

    public LocalDate getDataFi() {
        return DataFi;
    }

    public void setDataFi(LocalDate dataFi) {
        DataFi = dataFi;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public long duradaContracte(LocalDate DataInici,LocalDate DataFinal){
        long duradaContracte = DAYS.between(DataInici, DataFinal);
        return duradaContracte;
    }

    @Override
    public String toString() {
        return "Contracte{" +
                "Codi=" + Codi +
                ", DataInici=" + DataInici +
                ", DataFi=" + DataFi +
                ", empresa=" + empresa +
                '}';
    }
}
