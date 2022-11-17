package tarea.app.packages.machine.storages;
import tarea.app.packages.sodas.Bebida;
import tarea.app.packages.sodas.flavours.*;

import java.util.*;
import java.awt.*;

public class DepositoSodas {
  private ArrayList<Bebida> dep;

  public DepositoSodas() {
    dep = new ArrayList<Bebida>();
  }

  public void addBebida(Bebida a) {
    this.dep.add(a);
  }

  public Bebida getBebida() {
      if (this.dep.size() > 0) {
          return this.dep.remove(0);

      } else {
          return null;
      }
  }

  public void paint(Graphics g) {
    for(int i = 0; i < this.dep.size(); i++) {
        if(this.dep.get(i) instanceof CocaCola) {
            g.setColor(Color.red);
            g.fillRect(630 ,420-(90*i)  ,60 , 80);

        } else if(this.dep.get(i) instanceof Fanta) {
            g.setColor(Color.gray);
            g.fillRect(750  ,420-(90*i)  ,60 , 80);

        } else if(this.dep.get(i) instanceof Fanta) {
            g.setColor(Color.orange);
            g.fillRect(870 ,420-(90*i)  ,60 , 80);

        }
    }
  }
}
