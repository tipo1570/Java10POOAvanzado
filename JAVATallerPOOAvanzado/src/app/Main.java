package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {
        String barra = "====================================";
        String barrita = "------------------------------------";



        SistemaReservas sistema = new SistemaReservas();


        Reserva reserva1 = new Reserva(1, "Saul Chiquiza", "2025-12-21", 24);
        Reserva reserva2 = new Reserva(2, "Joseph Chiquiza", "2025-12-22", 42);

        sistema.agregarReserva(reserva1);
        sistema.agregarReserva(reserva2);

        reserva1.setDuracionHoras(72);
        System.out.println(barra + "\nSe realizo el cambio en la reserva\n" + barrita);

        sistema.listarReserva();


        System.out.println("\nTotal de reservas: " + sistema.contarReservas());


        try {
            sistema.eliminarReserva(1);  // eliminar la reserva con ID 1
        } catch (Exception e) {
            System.out.println("\nERROR: " + e.getMessage());
        }


        sistema.listarReserva();
        System.out.println("\nTotal final de reservas: " + sistema.contarReservas());



    }
}
