package tarea.app.packages.machine.storages;
//
import java.util.ArrayList;
import tarea.app.packages.coins.*;

public class DepositoMonedas {
  private ArrayList<Moneda> deposito;

  public DepositoMonedas() {
    this.deposito = new ArrayList<Moneda>();
  }

  public void addMoneda(Moneda a) {
    this.deposito.add(a);
  }

  public Moneda getMoneda() {
      if (this.deposito.size() > 0)
          return this.deposito.remove(0);
      else
        return null;
  }

  public int getNumMonedas() {
      return this.deposito.size();
  }
}
