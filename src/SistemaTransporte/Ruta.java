package SistemaTransporte;


public class Ruta {
    private String nombre;
    private double precioBase;

    public Ruta(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
