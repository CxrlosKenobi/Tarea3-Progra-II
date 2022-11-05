package packages.sodas.flavours;
//
import packages.sodas.Bebida;

public class Benedictino extends Bebida {
    public Benedictino(int precio) {
        super("Benedictino 350 cc", precio);
    }
    public String beber(){


        return "Estoy bebiendo Benedictino";
    }
}
