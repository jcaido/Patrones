package strategy;

public class Transferencia implements PagoStrategy{
    @Override
    public String formaDePago() {

        return "Transferencia bancaria";
    }
}
