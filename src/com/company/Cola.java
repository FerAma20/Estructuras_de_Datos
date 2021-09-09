package com.company;

public class Cola {
    Nodo first;
    Nodo last;

    public Cola (){

    }

    public void push(String valor){
        Nodo newNodo = new Nodo(valor);

        if(first == null){
            first = newNodo;
            last  = newNodo;
        }else{
            last.next = newNodo;
            last = newNodo;
        }
    }

    public void pop(){
        System.out.println("Pop: " + first.value);
        first= first.next;
    }

    public void get(){
        Nodo current = first;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
