package model;

public class Reserva {

    String barra = "====================================";
    String barrita = "------------------------------------";
    private int reservaID;
    public String cliente;
    public String fecha;
    public int duracionHoras;

    public Reserva() {

    }

    public Reserva(int reservaID, String cliente, String fecha, int duracionHoras) {
        this.reservaID = reservaID;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInfo(){
        System.out.println(barra);
        System.out.println("ID de la reserva: " + reservaID);
        System.out.println(barrita);
        System.out.println("La reserva esta a nombre de: \n" + cliente);
        System.out.println(barrita);
        System.out.println("Fecha de la reserva: \n" + fecha);
        System.out.println(barrita);
        System.out.println("Tiempo de estadia: \n" + duracionHoras);
        System.out.println(barra);
    }

    // MACHETAZOOOOO

}
