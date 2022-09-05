package strategy;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("tablero  4x4", 10D);
        Articulo articulo2 = new Articulo("piezas Staunton n5", 30D);
        Articulo articulo3 = new Articulo("reloj DGT 6000", 50D);
        Articulo articulo4 = new Articulo("Ajedrez de torneo", 15D);

        List<Articulo> misArticulos = new ArrayList<Articulo>();
        misArticulos.add(articulo1);
        misArticulos.add(articulo2);
        misArticulos.add(articulo3);
        misArticulos.add(articulo4);

        //EnvioStrategy miEnvio = new EnvioRapido();
        //PagoStrategy miPago = new Transferencia();

        EnvioStrategy miEnvio = new EnvioVeloz();
        PagoStrategy miPago = new Tarjeta();

        Pedido miPedido = new Pedido(misArticulos, miEnvio, miPago);

        miPedido.mostrarPedido(miEnvio, miPago);

    }
}
