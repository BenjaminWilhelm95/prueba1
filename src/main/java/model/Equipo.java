package model;
import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombre;
    private List<Deportista> jugadores;
    private Entrenador entrenador;

    public Equipo(String nombre, Entrenador entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Deportista> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Deportista jugador) {
        jugadores.add(jugador);
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}
