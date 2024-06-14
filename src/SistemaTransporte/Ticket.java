package SistemaTransporte;



public class Ticket {
    private double precio;
    private Ruta ruta;
    private Servicio servicio;

    public Ticket(double precio, Ruta ruta, Servicio servicio) {
        this.precio = precio;
        this.ruta = ruta;
        this.servicio = servicio;
    }

    public double calcularPrecio() {
        double precioFinal = precio;

        if (servicio != null && servicio instanceof VIP) {
            precioFinal *= 1.3; // Aplicar recargo del 30% para servicio VIP
        }

        return precioFinal;
    }

    public void imprimirTicket() {
        System.out.println("----- Detalles del Ticket -----");
        System.out.println("Ruta: " + ruta.getNombre());
        System.out.println("Precio Base: $" + ruta.getPrecioBase());
        System.out.println("Tipo de Servicio: " + servicio.getClass().getSimpleName());
        System.out.println("Detalles del Servicio: " + servicio.getDetalles());
        System.out.println("Precio Total: $" + calcularPrecio());
        System.out.println("------------------------------");
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}


