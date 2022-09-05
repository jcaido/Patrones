package strategy;

import java.util.List;

public class Pedido {

    private List<Articulo> articulos;
    private EnvioStrategy envio;
    private PagoStrategy pago;

    public Pedido() {
    }

    public Pedido(List<Articulo> articulos, EnvioStrategy envio, PagoStrategy pago) {
        this.articulos = articulos;
        this.envio = envio;
        this.pago = pago;
    }

    private Double calcularCoste() {
        Double coste = 0D;
        for (Articulo articulo: articulos) {
            coste += articulo.getPrecio();
        }
        return coste;
    }

    public void mostrarPedido(EnvioStrategy envio, PagoStrategy pago) {
        for (Articulo articulo: articulos) {
            System.out.println(articulo.getNombre() + ": " + articulo.getPrecio() + " Euros");
        }
        System.out.println("COSTE ARTICULOS => " + calcularCoste() + " Euros");
        System.out.println("FORMA DE ENVIO: " + envio.envio());
        System.out.println("GASTOS DE ENVIO: " + envio.costeEnvio() + " Euros");
        System.out.println("TOTAL PEDIDO: " + (calcularCoste() + envio.costeEnvio()) + " Euros");
        System.out.println("FORMA DE PAGO: " + pago.formaDePago());
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public EnvioStrategy getEnvio() {
        return envio;
    }

    public void setEnvio(EnvioStrategy envio) {
        this.envio = envio;
    }

    public PagoStrategy getPago() {
        return pago;
    }

    public void setPago(PagoStrategy pago) {
        this.pago = pago;
    }
}
