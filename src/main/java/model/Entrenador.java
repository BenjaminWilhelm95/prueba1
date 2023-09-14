package model;
public class Entrenador {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String numero;
    private String experiencia;
    private String especialidadDeportiva;

    public Entrenador(String nombre, String apellido, int edad, String correo, String numero, String experiencia, String especialidadDeportiva) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.numero = numero;
        this.experiencia = experiencia;
        this.especialidadDeportiva = especialidadDeportiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getEspecialidadDeportiva() {
        return especialidadDeportiva;
    }

    public void setEspecialidadDeportiva(String especialidadDeportiva) {
        this.especialidadDeportiva = especialidadDeportiva;
    }
}
