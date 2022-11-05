package packages.vendingMachine.storages;
import java.util.*;

import packages.coins.*;

public class DepositoMonedas {
    private ArrayList<Moneda> deposito;

    public DepositoMonedas() {
        deposito = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda a) {
        deposito.add(a);
    }

    public Moneda getMoneda() {
        if (deposito.size() > 0)
            return deposito.remove(0);
        else
          return null;
    }

    public int getNumMonedas() {
        return deposito.size();
    }

}
