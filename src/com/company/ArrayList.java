package com.company;

import java.awt.*;
import java.util.Arrays;

public class ArrayList {
     Integer array[]= {};


    public ArrayList(){

    }

    public void add(Integer val){
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1]=val;

    }

    public void remove(){
        Integer newArray[] = Arrays.copyOfRange(array, 0, array.length-1);
        array = Arrays.copyOf(newArray, newArray.length);
    }

    public void clear(){
        array= new Integer[]{};
    }

    public int size(){
        return array.length;
    }

    public Integer[] get(){
        return array;
    }
}
