package model;

import java.util.Date;

public class Tenis {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private boolean esLocal;
    private boolean esDoble;
    private Date fecha;
    public Tenis(Equipo equipoLocal, Equipo equipoVisitante, boolean esLocal, boolean esDoble, Date fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.esLocal = esLocal;
        this.esDoble = esDoble;
        this.fecha = fecha;
    }
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    public boolean esLocal() {
        return esLocal;
    }
    public void setLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }
    public boolean esDoble() {
        return esDoble;
    }
    public void setDoble(boolean esDoble) {
        this.esDoble = esDoble;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
