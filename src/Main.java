
import SistemaTransporte.Ruta;
import SistemaTransporte.Servicio;
import SistemaTransporte.Pasajero;
import SistemaTransporte.VIP;
import SistemaTransporte.Normal;
import SistemaTransporte.Ticket;;

public class Main {
    public static void main(String[] args) {
        // Crear objetos con valores nulos y setear atributos
        Ticket ticket1 = new Ticket();
        ticket1.setPrecio(25.0);
        ticket1.setRuta(new Ruta("Quito-Riobamba", 17.5));
        ticket1.setServicio(new Normal("Asiento en ventana", "ventana"));
        Ticket ticket2 = new Ticket();
        ticket2.setPrecio(30.0);
        ticket2.setRuta(new Ruta("Quito-Puyo", 15.0));
        ticket2.setServicio(new VIP("Televisión, internet"));
        Pasajero pasajero1 = new Pasajero();
        pasajero1.setNombre("María González");
        pasajero1.setCedula("9876543210");
        Pasajero pasajero2 = new Pasajero();
        pasajero2.setNombre("Pedro Pérez");
        pasajero2.setCedula("4567890123");


        // Crear objetos con valores iniciales
        Ruta quitoGuayaquil = new Ruta("Quito-Guayaquil", 20.0);
        Ruta quitoTulcan = new Ruta("Quito-Tulcán", 17.5);

        Servicio normalQuitoGuayaquil = new Normal("Selección de asiento: ventana, pasillo, al final, adelante.", "ventana");
        Servicio vipQuitoTulcan = new VIP("Televisión, internet y otros dos servicios adicionales a su consideración.");

        Ticket ticket3 = new Ticket(20.0, quitoGuayaquil, normalQuitoGuayaquil);
        Ticket ticket4 = new Ticket(17.5, quitoTulcan, vipQuitoTulcan);

        Pasajero pasajero3 = new Pasajero("Luisa Martínez", "6543210987");
        Pasajero pasajero4 = new Pasajero("Ana López", "7890123456");
        ticket3.imprimirTicket();
        ticket2.imprimirTicket();
        ticket1.imprimirTicket();


    }
}
