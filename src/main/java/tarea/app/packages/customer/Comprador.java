package tarea.app.packages.customer;
//
import java.awt.*;
import java.lang.ProcessBuilder.Redirect;

import tarea.app.packages.coins.Moneda;

public class Comprador {
    private int option;
    private Moneda moneda;

    public Comprador(){}       
    
    public void setOption(int opcion){
        this.option = opcion;
    }

    public int getOption(){
        return option;
    }

    public void setMoneda(Moneda moneda){
        this.moneda = moneda;
    }
    public void getMoneda(){
        moneda.getValor();
    }
    public void paint(Graphics g) {
        //pants
        int[] puntosXPants = { 378, 400, 519,545,498,479,442,426 };
        int[] puntosYPants = { 589, 430, 432,560,558,465,458,538 };
        //shirt
        int[] puntosXShirt = { 400, 408, 381,347,384,516,577,535 };
        int[] puntosYShirt = { 428, 305, 407,402,240,233,396,410 };

        g.fillPolygon(puntosXPants, puntosYPants, 8);        

        g.setColor(Color.red);
        g.fillPolygon(puntosXShirt, puntosYShirt, 8);
        
        // g.fill
        g.setColor(Color.white);
        g.fillOval(410, 150, 100, 100);


    }
}
