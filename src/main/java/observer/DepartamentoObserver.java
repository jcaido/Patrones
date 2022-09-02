package observer;

public interface DepartamentoObserver {

    public void actualizarApertura(String nuevaApertura);
    public void actualizarCierre(String nuevoCierre);
    public void actualizarMenu(Menu nuevoMenu);
}
