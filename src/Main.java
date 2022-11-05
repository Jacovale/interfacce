import entities.Auto;
import entities.Bicicletta;
import entities.Moto;
import intefaces.IVeicolo;

public class Main {
    public static void main(String[] args){
        Auto veicolo1 = new Auto(4, 5);
        Moto veicolo2 = new Moto(2, 2);
        Bicicletta veicolo3 = new Bicicletta(2, 1);

        
        IVeicolo tmp = new Auto(4, 5);
        System.out.println(tmp.tipologiaVeicolo());
        tmp.stampaCaratteristiche();


        System.out.println(veicolo1.tipologiaVeicolo());
        System.out.println(veicolo2.tipologiaVeicolo());
        System.out.println(veicolo3.tipologiaVeicolo());

        veicolo1.stampaCaratteristiche();
        veicolo2.stampaCaratteristiche();
        veicolo3.stampaCaratteristiche();
    }
}
