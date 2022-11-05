package entities;

import intefaces.IVeicolo;

public class Auto implements IVeicolo {
    private int numeroRuote;
    private int numeroPosti;
    public Auto(int numeroRuote, int numeroPosti){
        this.numeroRuote = numeroRuote;
        this.numeroPosti = numeroPosti;
    }

    @Override
    public String tipologiaVeicolo() {
        return "Questa è un'automobile";
    }

    @Override
    public void stampaCaratteristiche() {
        System.out.println("numero ruote: " + numeroRuote + "numero posti: " + numeroPosti);
    }
}
