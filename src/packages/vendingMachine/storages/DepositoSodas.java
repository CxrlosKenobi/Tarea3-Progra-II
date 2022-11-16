package packages.vendingMachine.storages;

import java.util.*;
import java.util.concurrent.BlockingQueue;

import packages.sodas.*;
import packages.sodas.flavours.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class DepositoSodas {
    private ArrayList<Bebida> dep;

    public DepositoSodas() {
        dep = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida a) {
        dep.add(a);
    }

    public Bebida getBebida() {
        if (dep.size() > 0) {
            return dep.remove(0);

        } else {
            return null;
        }
    }

    public void paint(Graphics g) {
            for(int i = 0; i < dep.size(); i++) {
                if(dep.get(i) instanceof CocaCola) {
                    g.setColor(Color.red);
                    g.fillRect(630 ,420-(90*i)  ,60 , 80);

                } else if(dep.get(i) instanceof Sprite) {
                    g.setColor(Color.gray);
                    g.fillRect(750  ,420-(90*i)  ,60 , 80);

                } else if(dep.get(i) instanceof Fanta) {
                    g.setColor(Color.orange);
                    g.fillRect(870 ,420-(90*i)  ,60 , 80);

                }
            }

    }
}
