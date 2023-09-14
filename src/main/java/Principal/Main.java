package Principal;
import model.ClubDeportivo;
import model.Entrenador;
import model.Deportista;
import model.Equipo;
import model.Futbol;
import model.Baloncesto;
import model.Tenis;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Crear un club deportivo
        ClubDeportivo club = new ClubDeportivo();

        // Registrar deportistas
        Deportista deportista1 = new Deportista("Juan", "Perez", 25, "juan@example.com", "123456789", "Fútbol", "Delantero");
        Deportista deportista2 = new Deportista("Maria", "Gomez", 22, "maria@example.com", "987654321", "Baloncesto", "Base");
        Deportista deportista3 = new Deportista("Luis", "Gonzalez", 30, "luis@example.com", "111111111", "Tenis", "Individual");
        club.registrarDeportista(deportista1);
        club.registrarDeportista(deportista2);
        club.registrarDeportista(deportista3);

        // Registrar entrenadores
        Entrenador entrenador1 = new Entrenador("Carlos", "Ruiz", 35, "carlos@example.com", "555555555", "10 años de experiencia", "Fútbol");
        Entrenador entrenador2 = new Entrenador("Ana", "Lopez", 40, "ana@example.com", "666666666", "15 años de experiencia", "Baloncesto");
        Entrenador entrenador3 = new Entrenador("Eduardo", "Martinez", 50, "eduardo@example.com", "777777777", "5 años de experiencia", "Tenis");
        club.registrarEntrenador(entrenador1);
        club.registrarEntrenador(entrenador2);
        club.registrarEntrenador(entrenador3);

        // Crear equipos
        club.crearEquipo("Equipo de Fútbol A", entrenador1);
        club.crearEquipo("Equipo de Baloncesto B", entrenador2);
        club.crearEquipo("Equipo de Tenis C", entrenador3);

        // Registrar partidos de fútbol
        Equipo equipoLocalFutbol = club.getEquipos().get(0); // Obtener el primer equipo
        Equipo equipoVisitanteFutbol = club.getEquipos().get(1); // Obtener el segundo equipo
        Date fechaPartidoFutbol = new Date(); // Fecha actual

        Futbol partidoFutbol = new Futbol(equipoLocalFutbol, equipoVisitanteFutbol, 2, 1, fechaPartidoFutbol, "Natural", true, true);
        club.registrarPartido(partidoFutbol);

        Equipo equipoLocalBaloncesto = club.getEquipos().get(1); // Obtener el segundo equipo
        Equipo equipoVisitanteBaloncesto = club.getEquipos().get(2); // Obtener el tercer equipo
        Date fechaPartidoBaloncesto = new Date(); // Fecha actual

        Baloncesto partidoBaloncesto = new Baloncesto(equipoLocalBaloncesto, equipoVisitanteBaloncesto, 80, 75, fechaPartidoBaloncesto, "Interior", 4);
        club.registrarPartido(partidoBaloncesto);

// Registrar partidos de tenis
        Equipo equipoLocalTenis = club.getEquipos().get(2); // Obtener el tercer equipo
        Equipo equipoVisitanteTenis = club.getEquipos().get(0); // Obtener el primer equipo
        Date fechaPartidoTenis = new Date(); // Fecha actual

        Tenis partidoTenis = new Tenis(equipoLocalTenis, equipoVisitanteTenis, "Césped", true, false, fechaPartidoTenis);
        club.registrarPartido(partidoTenis);


        // Consultar estadísticas de un deportista y equipo en cada deporte
        club.consultarEstadisticasDeportista(deportista1);
        club.consultarEstadisticasEquipo(equipoLocalFutbol);
        club.consultarEstadisticasDeportista(deportista2);
        club.consultarEstadisticasEquipo(equipoLocalBaloncesto);
        club.consultarEstadisticasDeportista(deportista3);
        club.consultarEstadisticasEquipo(equipoLocalTenis);
    }
}