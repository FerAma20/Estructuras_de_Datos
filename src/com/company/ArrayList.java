package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<T>{
    //T[] array;
    //Class<T> clazz;
    Object[] array ={};

    public ArrayList(){ //Class<T> clazz
       // this.clazz=clazz;
       // array = (T[]) Array.newInstance(clazz, 0);
    }

    public void add(T val){
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1]=val;
    }

    public void addId(int id, T val){
        array = Arrays.copyOf(array, array.length+1);
        for(int i = array.length-1;i>=id;i--){
            if(i==id){
                array[i]= val;
                break;
            }else{
                array[i]= array[i-1];
            }
        }
    }

    public void remove(){
        array = Arrays.copyOfRange(array, 0, array.length-1);

    }

    public void removeId(int id){
        for(int i = id; i<= array.length-2;i++){
            array[i]=array[i+1];
        }
        remove();
    }

    public void clear(){
        //array = (T[]) Array.newInstance(this.clazz, 0);
        array = new Object[]{};
    }

    public int size(){
        return array.length;
    }

    public Object[] get(){
        return array;
    }
}
