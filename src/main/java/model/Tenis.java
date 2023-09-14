package model;
import java.util.Date;
public class Tenis extends Partido {
    private String tipoCancha;
    private boolean esIndividual;
    private boolean esDoble;
    public Tenis(Equipo equipoLocal, Equipo equipoVisitante, String tipoCancha, boolean esIndividual, boolean esDoble, Date fecha) {
        super(equipoLocal, equipoVisitante, 0, 0, fecha);
        this.tipoCancha = tipoCancha;
        this.esIndividual = esIndividual;
        this.esDoble = esDoble;
    }
    public String getTipoCancha() {
        return tipoCancha;
    }
    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
    public boolean isEsIndividual() {
        return esIndividual;
    }
    public void setEsIndividual(boolean esIndividual) {
        this.esIndividual = esIndividual;
    }
    public boolean isEsDoble() {
        return esDoble;
    }
    public void setEsDoble(boolean esDoble) {
        this.esDoble = esDoble;
    }
}