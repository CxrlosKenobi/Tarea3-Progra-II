package packages.vendingMachine;

import packages._exceptions.*;
import packages.coins.*;
import packages.sodas.*;
import packages.sodas.flavours.*;
import packages.vendingMachine.storages.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.io.*;

public class Expendedor  {
    private int precioBebidas;
    private DepositoSodas cocaCola;
    private DepositoSodas sprite;
    private DepositoSodas fanta;
    private DepositoMonedas monedas;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.precioBebidas = precioBebidas;
        this.cocaCola = new DepositoSodas();
        this.sprite = new DepositoSodas();
        this.fanta = new DepositoSodas();
        this.monedas = new DepositoMonedas();

        for (int i = 0; i < numBebidas; i++) {
            Bebida coke = new CocaCola(precioBebidas);
            Bebida white = new Sprite(precioBebidas);
            Bebida orange = new Fanta(precioBebidas);

            cocaCola.addBebida(coke);
            sprite.addBebida(white);
            fanta.addBebida(orange);
        }
    }

    public Bebida comprarBebida(Moneda coin, int opcionBebida)
            throws PagoInsuficienteException, NoHayBebidaException, PagoIncorrectoException {
        if (coin != null) {
            Bebida cache;
            int vuelto;

            switch (opcionBebida) {

                case 1:
                    cache = cocaCola.getBebida();
                    vuelto = checkPrecioBebida(coin);
                    generateChange(vuelto);
                    return checkBebidaCache(cache);

                case 2:
                    cache = fanta.getBebida();
                    vuelto = checkPrecioBebida(coin);
                    generateChange(vuelto);
                    return checkBebidaCache(cache);

                case 3:
                    cache = sprite.getBebida();
                    vuelto = checkPrecioBebida(coin);
                    generateChange(vuelto);
                    return checkBebidaCache(cache);

                default:
                    throw new NoHayBebidaException();
            }

        } else {
            throw new PagoIncorrectoException();
        }
    }

    public Moneda getVuelto() {
        if (monedas.getNumMonedas() != 0)
            return this.monedas.getMoneda();

        return null;
    }

    // Aux
    public void generateChange(int vuelto) {
        for (int i = 0; i < vuelto; i++) {
            this.monedas.addMoneda(new Moneda100());
        }
    }

    public Bebida checkBebidaCache(Bebida cache) throws NoHayBebidaException {
        if (cache == null)
            throw new NoHayBebidaException();
        else
            return cache;
    }

    public int checkPrecioBebida(Moneda coin) throws PagoInsuficienteException {
        if (this.precioBebidas > coin.getValor())
            throw new PagoInsuficienteException();

        int vuelto = (coin.getValor() - this.precioBebidas) / 100;
        
        return vuelto;
    }

    public void paint(Graphics g ){
        g.setColor(Color.gray);
        g.fillRect(590, 30, 600, 600);
        g.setColor(Color.black);
        g.fillRect(600, 40, 380, 580);
        g.setColor(new Color(130, 142, 161));
        g.fillRect(610, 520, 360, 80);

        cocaCola.paint(g);        
        sprite.paint(g);
        fanta.paint(g);

    }
}
