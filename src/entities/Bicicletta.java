package entities;

import intefaces.IVeicolo;

public class Bicicletta implements IVeicolo {
    private int numeroRuote;
    private int numeroPosti;

    public Bicicletta(int numeroRuote, int numeroPosti){
        this.numeroRuote = numeroRuote;
        this.numeroPosti = numeroPosti;
    }

    @Override
    public String tipologiaVeicolo() {
        return "Questa è una bicicletta";
    }

    @Override
    public void stampaCaratteristiche() {
        System.out.println("numero ruote: " + numeroRuote + "numero posti: " + numeroPosti);
    }
}
