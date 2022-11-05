package packages.sodas.flavours;

import packages.sodas.Bebida;

public class CocaCola extends Bebida {
    public CocaCola(int precio) {
        super("CocaCola 350cc", precio);
    }
    public String beber(){
        return "Estoy tomando una Coca Cola";
    } 
}
    
