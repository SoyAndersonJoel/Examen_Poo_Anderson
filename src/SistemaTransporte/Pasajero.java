package SistemaTransporte;


public class Pasajero {
    private String nombre;
    private String cedula;

    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public Pasajero(){}

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void imprimir() {
        System.out.println( "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                '}');
    }
}

