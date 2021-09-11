package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList personas = new LinkedList();
        Pila pl = new Pila();
        Cola cl = new Cola();
        List ls = new List();
        ArrayList al = new ArrayList();

        System.out.println("\n=============== LinkedList ===============\n");

        // Ejemplos de LinkedList

        personas.agregar("Fernando");
        personas.addEnPosicion(0, "Texto 2");
        personas.agregar("Escobar");
        //personas.deleteLast();
        personas.size();
        personas.getTodo();


        System.out.println("\n=============== Pila ===============\n");

        // Ejemplos de Pila

        pl.push("Mensaje 1");
        pl.push("Mensaje 2");
        pl.push("Mensaje 3");
        pl.get();

        System.out.println("\n");
        pl.pop();
        pl.pop();
        pl.get();
        System.out.println("\n\n\n\n");


        System.out.println("\n=============== Cola ===============\n");


        // Ejemplos cola
        cl.push("Primer Valor");
        cl.push("Segundo Valor");
        cl.get();
        cl.pop();
        cl.get();
        cl.push("Tercer Valor");
        cl.get();

        System.out.println("\n=============== List ===============\n");

        //Ejemplos List
        ls.add("Primer dato");
        ls.add("Segundo dato");
        ls.add("Tercer Dato");
        ls.getAll();
        ls.get("Primer dato");
        ls.delete();
        ls.getAll();
        ls.delete();
        ls.getAll();


        System.out.println("\n=============== ArrayList ===============\n");

        al.add(3);
        al.add(5);
        al.add(6);
        Integer[] inn= al.get();
        for(int i = 0; i< al.size();i++){
            System.out.println(inn[i] + ", ");
        }
        System.out.println("La longitud del ArrayList es de: " + al.size());

        System.out.println("La longitud del ArrayList es de: " + al.size());

    }
}
