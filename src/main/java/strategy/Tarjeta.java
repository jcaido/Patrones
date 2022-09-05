package strategy;

public class Tarjeta implements PagoStrategy{
    @Override
    public String formaDePago() {

        return "Con tarjeta";
    }
}
