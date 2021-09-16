package com.company;

public class ArrayList<T>{
    static Object[] defoultCapacity = {};
    Object[] array;

    public ArrayList(int capacity){
        if(capacity>0){
            array = new Object[capacity];
        }else{
            array = defoultCapacity;
        }
    }
    public ArrayList(){
        array = defoultCapacity;
    }

    public void add(T val){
        add(array.length, val);
    }

    public void add(int position, T val){
        Object[] array2 = new Object[array.length+1];
        if(array.length==0){
            array2[0]=val;
            array=array2;
            return;
        }
        for(int i = 0;i<array2.length;i++){
            if(i<position){
                array2[i]= array[i];
            }else if(i == position){
                array2[i]= val;
            }else{
                array2[i]=array[i-1];
            }
        }
        array = array2;
    }

    public void remove(){
        Object[] array2 = new Object[array.length-1];
        for(int i =0; i<array2.length;i++){
            array2[i]=array[i];
        }
        array=array2;
    }

    public void remove(int id){
        if(id >= 0 && id< array.length){
            for(int i = id; i<= array.length-2;i++){
                array[i]=array[i+1];
            }
            remove();
        }else{
            System.out.println("Id ingresado no valido");
        }

    }

    public void clear(){
        array = new Object[]{};
    }

    public int size(){
        return array.length;
    }

    public Object[] get(){
        return array;
    }

    @Override
    public String toString() {
        String output = "";
        for(int i=0; i<array.length;i++){
            output +=array[i] + " ";
        }
        return output;
    }
}
