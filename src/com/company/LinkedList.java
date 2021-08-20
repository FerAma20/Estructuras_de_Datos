package com.company;

public class LinkedList {

    Nodo first;
    Nodo last;

    public LinkedList() {

    }

    public void agregar(String mensaje){

        Nodo newNodo = new Nodo(mensaje);
        if(first == null){
            first = newNodo;
            last = newNodo;

        }else{


            last.next=newNodo;
            last = newNodo;


        }
    }


    public void agregarInicio(String mensaje){
        Nodo newNodo = new Nodo(mensaje);
        if(first == null){
            first = newNodo;
            last = newNodo;
        }else{
            newNodo.next = first;
            first = newNodo;
        }

    }

    public void addEnPosicion(int posicion, String mensaje){
        Nodo current = first;
        int i =1;

        if(posicion == 0 ){
            agregarInicio(mensaje);
        } else{

            while(i<=posicion){

                if(current.next !=null){
                    if(i == posicion){
                        Nodo newNodo = new Nodo(mensaje);
                        newNodo.next = current.next;
                        newNodo.prev=current;

                        current.next = newNodo;
                    }

                }else{

                    agregar(mensaje);
                    break;
                }
                current = current.next;
                i++;
            } }
    }

    public void deleteFirst(){
        first = first.next;
    }

    public void deleteLast(){
        Nodo current = first;
        while(current !=null){
            if(current.next.next == null){
                current.next=null;
            }
            current = current.next;
        }
    }

    public void deleteEnPosicion(int posicion){
        Nodo current = first;
        int i=0;
        if(posicion == 0 ){
            deleteFirst();
        }else {
            while (i <= posicion) {
                if(current.next !=null){
                    if(i+1 == posicion){
                        current.next = current.next.next;
                    }


                }else{

                    deleteLast();
                    break;

                }
                current= current.next;
                i++;
            }
        }


    }

    public void getIndex(int posicion){
        int i = 0;
        Nodo current = first;

        while(current != null){
            if(i == posicion){
                System.out.println(current.value);
                break;
            }else if(i>posicion){
                System.out.println("No se encuentra el index indicado");
                break;
            }
            i++;
            current = current.next;

        }
    }

    public void getTodo(){
        Nodo current= first;
        while(current!=null){
            System.out.println(current.value);
            current= current.next;
        }
    }

    public void getNombre(String valor){
        Nodo current = first;
        while(current!=null){
            if(current.value ==valor){
                System.out.println(current.value);
            }
            current = current.next;
        }
    }

    public void size(){
        Nodo current = first;
        int i=0;

        while(current!=null){

            i++;
            current = current.next;
        }
        System.out.println(i);

    }
}
