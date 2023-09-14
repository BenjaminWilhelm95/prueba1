package model;

public class EstadisticasDeportista {
    private Deportista deportista;
    private int partidosJugados;
    private int golesMarcados;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    public EstadisticasDeportista(Deportista deportista) {
        this.deportista = deportista;
        this.partidosJugados = 0;
        this.golesMarcados = 0;
        this.asistencias = 0;
        this.tarjetasAmarillas = 0;
        this.tarjetasRojas = 0;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public int getGolesMarcados() {
        return golesMarcados;
    }
    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    public void registrarGol() {
        this.golesMarcados++;
    }
    public void registrarAsistencia() {
        this.asistencias++;
    }
    public void registrarTarjetaAmarilla() {
        this.tarjetasAmarillas++;
    }
    public void registrarTarjetaRoja() {
        this.tarjetasRojas++;
    }
    public Deportista getDeportista() {
        return deportista;
    }
}
