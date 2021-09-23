package modelo;

import java.util.Date;

public class Vuelo {

    private Date fechaSalida;
    private Date fechaRegreso;
    private String origen;
    private String destino;
    private String aerolinea;

    public Vuelo(Date fechaSalida, Date fechaRegreso, String origen, String destino, String aerolinea) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
    }


    public Date getFechaSalida() {
        return fechaSalida;
    }


    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "este vuelo tiene fecha de salida: " + fechaSalida +
                ", fecha de regreso: " + fechaRegreso +
                ", sale de: " + origen + '\'' +
                ", con destino a: " + destino + '\'' +
                "y es de la aerolinea: " + aerolinea + '\'';
    }
}
