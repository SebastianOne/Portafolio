package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuVegetariano extends Menu
{
    private List<String> condimentos;
    private Double valorEnvase;

    public MenuVegetariano(List<String> condimentos, Double valorEnvase) {
        super(5000.0, new ArrayList<>(Arrays.asList("jamon","queso","pan","arroz","carbe","frijol")));
        this.condimentos = condimentos;
        this.valorEnvase = valorEnvase;
    }

    @Override
    public Double calcularCosto() {
        return getPrecioBase() + valorEnvase + (getPrecioBase()*0.01* condimentos.size());
    }

    @Override
    public void informarAdicional() {
        System.out.println("estos son los adicionales del menu vegetariano");
        condimentos.forEach(System.out::println);
    }
}
