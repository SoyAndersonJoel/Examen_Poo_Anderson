package SistemaTransporte;



public class Normal extends Servicio {
    private String tipoAsiento;
    private boolean maletaAdicional;

    public Normal(String detalles, String tipoAsiento) {
        super(detalles);
        this.tipoAsiento = tipoAsiento;
        this.maletaAdicional = false;
    }

    public void elegirAsiento(String tipo) {
        this.tipoAsiento = tipo;
    }

    public void agregarMaletaAdicional() {
        this.maletaAdicional = true;
    }

    @Override
    public String toString() {
        return "Servicio Normal{" +
                "tipoAsiento='" + tipoAsiento + '\'' +
                ", maletaAdicional=" + maletaAdicional +
                ", detalles='" + getDetalles() + '\'' +
                '}';
    }
}
