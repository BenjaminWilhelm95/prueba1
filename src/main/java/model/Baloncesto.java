package model;

import java.util.Date;

public class Baloncesto {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private Date fecha;
    private boolean esLocal; // Indica si el equipo local es el anfitrión
    private int tiemposJugados; // Número de tiempos jugados en el partido

    public Baloncesto(Equipo equipoLocal, Equipo equipoVisitante, int puntosLocal, int puntosVisitante, Date fecha, boolean esLocal, int tiemposJugados) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
        this.fecha = fecha;
        this.esLocal = esLocal;
        this.tiemposJugados = tiemposJugados;
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
    public int getPuntosLocal() {
        return puntosLocal;
    }
    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }
    public int getPuntosVisitante() {
        return puntosVisitante;
    }
    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
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
    public int getTiemposJugados() {
        return tiemposJugados;
    }
    public void setTiemposJugados(int tiemposJugados) {
        this.tiemposJugados = tiemposJugados;
    }
}
