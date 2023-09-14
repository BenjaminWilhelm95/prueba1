package model;
import java.util.Date;
public class Baloncesto extends Partido {
    private String tipoCancha;
    private int numTiemposJugados;
    public Baloncesto(Equipo equipoLocal, Equipo equipoVisitante, int puntosLocal, int puntosVisitante, Date fecha,
                      String tipoCancha, int numTiemposJugados) {
        super(equipoLocal, equipoVisitante, puntosLocal, puntosVisitante, fecha);
        this.tipoCancha = tipoCancha;
        this.numTiemposJugados = numTiemposJugados;
    }
    public String getTipoCancha() {
        return tipoCancha;
    }
    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
    public int getNumTiemposJugados() {
        return numTiemposJugados;
    }
    public void setNumTiemposJugados(int numTiemposJugados) {
        this.numTiemposJugados = numTiemposJugados;
    }
}