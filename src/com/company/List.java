package com.company;

public class List {
    Nodo first;
    Nodo last;

    public List(){

    }

    public void add( String val){
        Nodo newNodo = new Nodo(val);
        if(first == null){
            first = newNodo;
            last = newNodo;
        }else{
            last.next=newNodo;
            last = newNodo;

        }
    }

    public void getAll(){
        Nodo current = first;
        while(current!=null){
            System.out.println(current.value);
            current= current.next;
        }
    }
    public void get(String val){
        Nodo current = first;
        if(first==null){
            System.out.println("Lista Vacia");
        }
        while (current!=null){
            if(current.value ==val){
                System.out.println("El valor " + val + " fue encontrado");
                return;
            }
            current = current.next;
        }
        System.out.println("El valor " + val + " no fue encontrado");
        return;
    }

    public void delete(){
        Nodo current = first;
        if(first==last || first.value == last.value ){
            first = null;
            last = null;
        }else{
            while (current!=null){
                if (current.next==last){
                    last=current;
                    current.next=null;
                    break;
                }
                current=current.next;
            }
        }
    }
}
