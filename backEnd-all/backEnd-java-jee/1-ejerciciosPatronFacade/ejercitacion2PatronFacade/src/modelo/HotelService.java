package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class HotelService {

    public List<Hotel> busquedaHotel(String destino, Date fecha){
        Hotel hotel1 = new Hotel(new Date(2021,7,10), new Date(2021,12,1),"Maracaibo", "Buenos Dias");
        Hotel hotel2 = new Hotel(new Date(2021,8,10), new Date(2021,11,1),"Maracaibo", "Buenos Dias");
        Hotel hotel3 = new Hotel(new Date(2021,8,10), new Date(2021,12,1),"Bogota", "Buenos Dias");
        Hotel hotel4 = new Hotel(new Date(2021,7,10), new Date(2021,10,1),"Madrid", "Buenos Dias");
        List<Hotel> respuestaApi;
        respuestaApi = Arrays.asList(hotel1, hotel2, hotel3, hotel4);

        return respuestaApi.stream().filter(hotel -> hotel.getFechaEntrada().compareTo(fecha)== 0).filter(hotel -> hotel.getCiudad().equals(destino)).collect(Collectors.toList());

    }
}
