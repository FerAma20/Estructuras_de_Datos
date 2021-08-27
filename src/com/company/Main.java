package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList personas = new LinkedList();
        Pila pl = new Pila();
        Cola cl = new Cola();

        // Ejemplos de LinkedList

        personas.agregar("Fernando");
        personas.addEnPosicion(0, "Texto 2");
        personas.agregar("Escobar");
        //personas.deleteLast();
        personas.size();
        personas.getTodo();

        System.out.println("\n");

        // Ejemplos de Pila

        pl.push("Mensaje 1");
        pl.push("Mensaje 2");
        pl.push("Mensaje 3");
        pl.get();

        System.out.println("\n");
        pl.pop();
        pl.pop();
        pl.get();
        System.out.println("\n");

        cl.push("Primer Valor");
        cl.push("Segundo Valor");
        cl.get();
        cl.pop();
        cl.get();
        cl.push("Tercer Valor");
        cl.get();



    }
}
