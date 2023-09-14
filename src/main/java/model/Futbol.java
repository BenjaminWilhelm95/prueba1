package model;
import java.util.Date;
public class Futbol extends Partido {
    private String tipoCampo;
    private boolean esLocalEquipoLocal;
    private boolean esLocalEquipoVisitante;
    
    public Futbol(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante, Date fecha,
                  String tipoCampo, boolean esLocalEquipoLocal, boolean esLocalEquipoVisitante) {
        super(equipoLocal, equipoVisitante, golesLocal, golesVisitante, fecha);
        this.tipoCampo = tipoCampo;
        this.esLocalEquipoLocal = esLocalEquipoLocal;
        this.esLocalEquipoVisitante = esLocalEquipoVisitante;

    }
    public String getTipoCampo() {
        return tipoCampo;
    }
    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }
    public boolean isEsLocalEquipoLocal() {
        return esLocalEquipoLocal;
    }
    public void setEsLocalEquipoLocal(boolean esLocalEquipoLocal) {
        this.esLocalEquipoLocal = esLocalEquipoLocal;
    }
    public boolean isEsLocalEquipoVisitante() {
        return esLocalEquipoVisitante;
    }
    public void setEsLocalEquipoVisitante(boolean esLocalEquipoVisitante) {
        this.esLocalEquipoVisitante = esLocalEquipoVisitante;
    }
}
