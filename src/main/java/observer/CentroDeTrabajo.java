package observer;

import java.util.ArrayList;
import java.util.List;

public class CentroDeTrabajo {

    private String apertura;
    private String cierre;
    private Menu menuDiario;

    private List<DepartamentoObserver> observers;

    public CentroDeTrabajo() {
    }

    public CentroDeTrabajo(String apertura, String cierre, Menu menuDiario) {
        this.apertura = apertura;
        this.cierre = cierre;
        this.menuDiario = menuDiario;
        this.observers = new ArrayList<>();
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public String getCierre() {
        return cierre;
    }

    public void setCierre(String cierre) {
        this.cierre = cierre;
    }

    public Menu getMenuDiario() {
        return menuDiario;
    }

    public void setMenuDiario(Menu menuDiario) {
        this.menuDiario = menuDiario;
    }

    public List<DepartamentoObserver> getObservers() {
        return observers;
    }


    public void addObserver(DepartamentoObserver observer) {
        this.observers.add(observer);
    }

    public void cambiarApertura(String nuevaApertura) {
        this.apertura = nuevaApertura;
        notificacionObserver();
    }

    public void cambiarCierre(String nuevoCierre) {
        this.cierre = nuevoCierre;
        notificacionObserver();
    }

    public void cambiarMenu(Menu nuevoMenu) {
        this.menuDiario = nuevoMenu;
        notificacionObserver();
    }

    private void notificacionObserver() {
        for(DepartamentoObserver observer: this.observers) {
            observer.actualizarApertura(this.apertura);
            observer.actualizarCierre(this.cierre);
            observer.actualizarMenu(this.menuDiario);
        }
    }
}
