package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuscadorFacade {
    private List<Vuelo> vuelos;
    private List<Hotel> hoteles;
    private HotelService hotel1;
    private VueloService vuelo2;

    public BuscadorFacade() {
        hotel1 = new HotelService();
        vuelo2 = new VueloService();
    }

    public void busqueda(String ciudad, Date fecha){

        vuelos = vuelo2.busquedaVuelo(ciudad,fecha);
        hoteles =  hotel1.busquedaHotel(ciudad,fecha);
        System.out.println("estos son los hoteles disponibles:");
        hoteles.forEach(hotel -> System.out.println("-" + hotel.toString()));
        System.out.println("estos son los vuelos disponibles:");
        vuelos.forEach(vuelos-> System.out.println("-" + vuelos.toString()));
    }

}
