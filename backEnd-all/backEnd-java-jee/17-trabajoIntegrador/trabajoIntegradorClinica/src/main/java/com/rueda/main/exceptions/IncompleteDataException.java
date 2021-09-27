package com.rueda.main.exceptions;

public class IncompleteDataException extends Exception{
    /**
     esta exception me saldra cuando allan datos en el payload que esten vacios y que en la base de datos
     no pueden estar esos valores nulos
     */
    public IncompleteDataException(String message) {
        super(message);
    }
}
