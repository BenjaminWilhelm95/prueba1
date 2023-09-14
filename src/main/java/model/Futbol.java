package model;

import java.util.Date;

public class Futbol {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private Date fecha;
    private boolean esLocal;
    public Futbol(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante, Date fecha, boolean esLocal) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.fecha = fecha;
        this.esLocal = esLocal;
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
    public int getGolesLocal() {
        return golesLocal;
    }
    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }
    public int getGolesVisitante() {
        return golesVisitante;
    }
    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean esLocal() {
        return esLocal;
    }

    public void setLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }
}
