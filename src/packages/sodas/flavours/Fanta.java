package packages.sodas.flavours;

import packages.sodas.Bebida;

public class Fanta extends Bebida {
    public Fanta(int precio ) {
        super("Fanta 350cc", precio);
    }

    public String beber(){
        return "Estoy tomando una Fanta";
    } 
}
