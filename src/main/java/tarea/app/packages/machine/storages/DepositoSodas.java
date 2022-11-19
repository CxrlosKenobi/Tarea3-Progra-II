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
    int x = 626;
    int y = 426;

    for (Bebida b : dep) {
      b.paint(g, x, y);
      y -= 80;
    }
  }
}
