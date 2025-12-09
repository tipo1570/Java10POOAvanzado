package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {

        // 1. Crear el sistema
        SistemaReservas sistema = new SistemaReservas();

        // 2. Crear dos reservas usando el constructor
        Reserva r1 = new Reserva(1, "Carlos López", "2025-12-21", 3);
        Reserva r2 = new Reserva(2, "María Pérez", "2025-12-22", 2);


    }
}
