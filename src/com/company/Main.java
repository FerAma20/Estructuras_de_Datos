package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList personas = new LinkedList();

        personas.agregar("Fernando");
        personas.addEnPosicion(0, "Texto 2");
        personas.agregar("Escobar");
        //personas.deleteLast();
        personas.size();
        personas.getTodo();

    }
}
