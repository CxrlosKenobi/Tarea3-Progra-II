import packages.*;
import packages.vendingMachine.*;
import packages.coins.*;
//
public class App {
    public static void main(String[] args) throws Exception {
        // Rellenamos nuestro expendedor con valores iniciales para sus productos.
        int numBebidas = 5, precioBebidas = 600;
        Expendedor vendomatic = new Expendedor(numBebidas, precioBebidas);

        // Simulamos al cliente, eligiendo un tipo/marca de bebida e ingresando su moneda de intercambio
        int tipoBebida = 0; // 0: Benedictino, 1: CocaCola, 2: Fanta, ...
        Moneda moneda = new Moneda1000();
        Comprador JeanPierre = new Comprador(moneda, tipoBebida, vendomatic);


        // Excepciones auxiliares para testear //
        // 1. Si el comprador no entrega una moneda válida o simplemente no entrega moneda. (PagoIncorrectoException)
        // Comprador Harry = new Comprador(null, tipoBebida, vendomatic);

        // 2. Si la moneda no alcanza (PagoInsuficienteException)
        // Moneda moneda2 = new Moneda100();
        // Comprador Ron = new Comprador(moneda2, tipoBebida, vendomatic);

        // 3. Si ya no quedan bebidas disponibles para el tipo seleccionado de bebida. (NoHayBebidaException)
        // int tipoBebida2 = 4;
        // Comprador Hermione = new Comprador(moneda, tipoBebida2, vendomatic);
    }
}
