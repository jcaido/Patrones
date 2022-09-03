package decorator;

public abstract class TvDecorator extends Televisor{

    protected Televisor televisor;

    protected TvDecorator(Televisor televisor) {

        super();
        this.televisor = televisor;
    }
}
