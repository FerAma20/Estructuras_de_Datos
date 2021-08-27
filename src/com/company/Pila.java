package com.company;

public class Pila {
    Nodo first;
    Nodo last;

    public Pila(){

    }

    public void push(String value){
        Nodo newNodo = new Nodo(value);
        if(first == null){
            first = newNodo;
            last = newNodo;
        }else{
            last.next=newNodo;
            last = newNodo;
        }
    }

    public void get(){
        Nodo current = first;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void pop(){
        Nodo current = first;
        while(current != null){
            if(current.next.next == null){
                System.out.println("Pop: " + current.next.value);
                current.next= null;
            }
            current = current.next;
        }
    }
}
