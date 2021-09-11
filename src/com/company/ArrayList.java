package com.company;

import java.awt.*;
import java.util.Arrays;

public class ArrayList {
     Integer array[]= {};


    public ArrayList(){

    }

    public void add(Integer val){
        Integer newArray[] = Arrays.copyOf(array, array.length+1);
        newArray[newArray.length-1]=val;
        array = Arrays.copyOf(newArray,newArray.length);
    }

    public void remove(){
        Integer newArray[] = Arrays.copyOfRange(array, 0, array.length-1);
        array = Arrays.copyOf(newArray, newArray.length);
    }

    public void clear(){
        array= new Integer[]{};
    }

    public void size(){
        System.out.println("Longitud del arrayList es: " + array.length);
    }

    public void getAll(){
        if(array.length==0){
            System.out.println("El arrayList esta vacio");
        }else{
            for(int i=0; i<array.length;i++){

                System.out.print(array[i]+ ", ");
            }
            System.out.println();
        }
    }
}
