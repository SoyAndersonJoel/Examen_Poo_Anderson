package SistemaTransporte;



public class VIP extends Servicio {
    private boolean tieneTVInternet;

    public VIP(String detalles) {
        super(detalles);
        this.tieneTVInternet = true; // Por defecto, VIP incluye TV e Internet
    }

    public boolean isTieneTVInternet() {
        return tieneTVInternet;
    }

    public void setTieneTVInternet(boolean tieneTVInternet) {
        this.tieneTVInternet = tieneTVInternet;
    }

    @Override
    public String toString() {
        return "Servicio VIP{" +
                "tieneTVInternet=" + tieneTVInternet +
                ", detalles='" + getDetalles() + '\'' +
                '}';
    }
}
