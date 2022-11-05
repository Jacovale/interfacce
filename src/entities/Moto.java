package entities;

import intefaces.IVeicolo;

public class Moto implements IVeicolo {
    private int numeroRuote;
    private int numeroPosti;

    public Moto(int numeroRuote, int numeroPosti){
        this.numeroRuote = numeroRuote;
        this.numeroPosti = numeroPosti;
    }
    @Override
    public String tipologiaVeicolo() {
        return "Questa è una moto";
    }

    @Override
    public void stampaCaratteristiche() {
        System.out.println("numero ruote: " + numeroRuote + "numero posti: " + numeroPosti);
    }
}
