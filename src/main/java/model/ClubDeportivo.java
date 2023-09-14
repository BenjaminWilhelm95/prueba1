package model;
import java.util.ArrayList;
import java.util.List;
public class ClubDeportivo {
    private List<Deportista> deportistas;
    private List<Entrenador> entrenadores;
    private List<Equipo> equipos;
    private List<Partido> partidos;
    public ClubDeportivo() {
        deportistas = new ArrayList<>();
        entrenadores = new ArrayList<>();
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
    }
    public void registrarDeportista(Deportista deportista) {
        deportistas.add(deportista);
    }
    public void registrarEntrenador(Entrenador entrenador) {
        entrenadores.add(entrenador);
    }
    public void crearEquipo(String nombreEquipo, Entrenador entrenador) {
        Equipo equipo = new Equipo(nombreEquipo, entrenador);
        equipos.add(equipo);
    }
    public void registrarPartido(Partido partido) {
        partidos.add(partido);
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public void consultarEstadisticasDeportista(Deportista deportista) {
        for (Deportista d : deportistas) {
            if (d.equals(deportista)) {
                System.out.println("Estadísticas de " + d.getNombre() + " " + d.getApellido());
                return;
            }
        }
        System.out.println("No se encontraron estadísticas para " + deportista.getNombre() + " " + deportista.getApellido());
    }
    public void consultarEstadisticasEquipo(Equipo equipo) {
        for (Equipo e : equipos) {
            if (e.equals(equipo)) {
                System.out.println("Estadísticas del equipo " + e.getNombre());
                return;
            }
        }
        System.out.println("No se encontraron estadísticas para el equipo " + equipo.getNombre());
    }
}
