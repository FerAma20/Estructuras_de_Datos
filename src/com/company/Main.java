package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=============== LinkedList ===============\n");
        LinkedList personas = new LinkedList();
        // Ejemplos de LinkedList

        personas.agregar("Fernando");
        personas.addEnPosicion(0, "Texto 2");
        personas.agregar("Escobar");
        personas.size();
        personas.getTodo();


        System.out.println("\n=============== Pila ===============\n");
        Pila pl = new Pila();
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
        Cola cl = new Cola();
        // Ejemplos cola
        cl.push("Primer Valor");
        cl.push("Segundo Valor");
        cl.get();
        cl.pop();
        cl.get();
        cl.push("Tercer Valor");
        cl.get();

        System.out.println("\n=============== List ===============\n");
        List ls = new List();
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
        ArrayList<String> al = new ArrayList<>(0);
        al.add("23");
        al.add("Segundo texto");
        al.add("true");
        al.add("Cuarto texto");
        al.add("Quiento texto");
        System.out.println(al);
        al.remove();
        System.out.println(al);
        al.remove(2);
        System.out.println(al);

    }
}
