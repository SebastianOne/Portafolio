package com.rueda.main.exceptions;

public class ResourceNotFoundException extends Exception{
    /**
     esta exception me saldra cuando intente elminar o modificar datos de un elemento que o existe
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
