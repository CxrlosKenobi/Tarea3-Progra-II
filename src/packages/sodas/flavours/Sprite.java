package packages.sodas.flavours;

import packages.sodas.Bebida;

public class Sprite extends Bebida {
    public Sprite(int precio) {
        super("Sprite 350cc", precio);
    }
    public String beber(){
        return "Estoy tomando Sprite";
    }
}
    

