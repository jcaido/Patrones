package strategy;

public class Reembolso implements PagoStrategy{
    @Override
    public String formaDePago() {

        return "Contra Reembolso";
    }
}
