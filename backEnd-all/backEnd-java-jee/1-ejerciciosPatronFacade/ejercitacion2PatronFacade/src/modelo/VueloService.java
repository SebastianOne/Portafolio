package modelo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class VueloService {

    public List<Vuelo> busquedaVuelo(String destino, Date fecha){
        Vuelo vuelo1 = new Vuelo(new Date(2021,7,10),new Date(2021,11,1),"bogota","Madrid", "avianca");
        Vuelo vuelo2 = new Vuelo(new Date(2021,7,10),new Date(2021,11,1),"medellin","Madrid", "avianca");
        Vuelo vuelo3 = new Vuelo(new Date(2021,8,10),new Date(2021,12,1),"bogota","Buenos Aires", "avianca");
        Vuelo vuelo4 = new Vuelo(new Date(2021,7,10),new Date(2021,12,1),"cali","Buenos Aires", "avianca");
        List<Vuelo> respuestaApi;
        respuestaApi = Arrays.asList(vuelo1, vuelo2, vuelo3, vuelo4);

        return respuestaApi.stream().filter(vuelo -> vuelo.getFechaSalida().compareTo(fecha)== 0).filter(vuelo ->vuelo.getDestino().equals(destino)).collect(Collectors.toList());
    }

}
