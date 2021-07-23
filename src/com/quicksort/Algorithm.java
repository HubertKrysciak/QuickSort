package com.quicksort;

import java.util.Arrays;
import java.util.Random;

public class Algorithm {
    public static void QSAlgorithm(int[] arr, int lewy/*index początku tablicy*/, int prawy/*index końca tablicy*/){

        if(lewy >= prawy) return; //warunek wyjścia z algorytmu

        int l = lewy - 1, r = prawy + 1;

        int pivot = arr[(lewy+prawy)/2];

        while(true){

            while(pivot > arr[++l]);

            while(pivot < arr[--r]);

            if(l<=r){
                Swap.two_var(arr, l, r);
            }else {
                break;
            }
        }

        if(r>lewy) {
            QSAlgorithm(arr, lewy, r);
        }
        if(l<prawy){
            QSAlgorithm(arr, l, prawy);
        }

    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

