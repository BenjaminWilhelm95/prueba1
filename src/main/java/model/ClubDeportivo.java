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
    // Método para registrar deportista, entrenador, equipo y partido
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

    public void registrarPartido(Equipo equipoLocal, Equipo equipoVisitante, int resultadoLocal, int resultadoVisitante) {
        Partido partido = new Partido(equipoLocal, equipoVisitante, resultadoLocal, resultadoVisitante, new Date());
        partidos.add(partido);
    }

    // Métodos para consultar estadísticas de jugadores y equipos
    // Implementa tus propios métodos de consulta aquí

    // Otros métodos según tus necesidades
}
