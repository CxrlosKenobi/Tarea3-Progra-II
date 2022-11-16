package packages;

import packages.coins.*;
import packages.sodas.Bebida;
import packages.vendingMachine.*;
import packages._exceptions.*;

public class Comprador {
    private String direccionMoneda;
    private int dineroDevuelto = 0;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        try {
            Bebida enMano = null;
            
            enMano = exp.comprarBebida(m, cualBebida);
            System.out.println(queBebiste(enMano));
            
            
            Moneda monedita=null;
            while (true){
                monedita = exp.getVuelto();
                dineroDevuelto += 100;
                if (monedita == null){
                    dineroDevuelto -= 100;
                    break;
                }
            }

            System.out.println("Mi vuelto es: " + this.cuantoVuelto());

        } catch (PagoInsuficienteException | NoHayBebidaException | PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
    }

    public int cuantoVuelto() {
        return this.dineroDevuelto;
    }

    public String queBebiste(Bebida b) {
        return b.beber();
    }
}
