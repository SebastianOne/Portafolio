package modelo;

import java.util.Date;

public class Hotel {

    private Date fechaEntrada;
    private Date fechaSalida;
    private String ciudad;
    private String nombreHotel;

    public Hotel(Date fechaEntrada, Date fechaSalida, String ciudad, String nombreHotel) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.ciudad = ciudad;
        this.nombreHotel = nombreHotel;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }



    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return " la fecha de entrada es: " + fechaEntrada +
                ", la fecha de salida es: " + fechaSalida +
                ", la ciudad es: " + ciudad + '\'' +
                " y el nombre del hotel es: '" + nombreHotel + '\'';
    }
}
