package service;
import model.Reserva;
import java.util.ArrayList;

public class SistemaReservas {

    //var

    String barra = "====================================";
    String barrita = "------------------------------------";

    //lista

    private ArrayList<Reserva> numeros = new ArrayList<>();


    //metodos

    public void agregarReserva (Reserva reserva) {
        System.out.println( barra + "\nProcesando reserva para " + reserva.getCliente() + "...");
        numeros.add(reserva);
        System.out.println("\nReserva compleada para " + reserva.getCliente() + "\n" + barra);
    }

    public void eliminarReserva(int id) throws Exception {
        boolean encontrada = false;

        for (Reserva reserva : numeros) {
            if (reserva.getReservaID() == id) {
                numeros.remove(reserva);
                System.out.println(barra + "\nReserva con ID " + id + " fue eliminada correctamente\n" + barrita );
                encontrada = true;
                break;
                //machetazoooo
            }
        }

        if (!encontrada) {
            throw new Exception(barra + "\nNo existe una reserva con el ID: " + id + "\n" + barrita);
        }
    }

    public void listarReserva (Reserva reserva) {
        if (numeros.isEmpty()) {
            System.out.println("\nNo hay reservas registradas actualmente.");
        } else {
            System.out.println("\n--- LISTA DE RESERVAS ---");
            for (Reserva reserva1 : numeros) {
                reserva1.mostrarInfo();
            }
        }
    }


    public int contarReservas (Reserva reserva) {
        return numeros.size();
    }

}

//no estuvo papitas