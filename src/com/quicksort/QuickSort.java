package com.quicksort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args){
        Random random = new Random();  //generator liczb pseudolosowych
        Scanner scanner = new Scanner(System.in); //scanner do pobierania wartości od usera

        int i = 0; //zmienna i do iterowania w pętli while przydzielającej wartości do zmiennych w tablicy


        System.out.println("Podaj ilość liczb w tablicy");
        int hm = scanner.nextInt();
        int[] arr = new int[hm]; //tworzę tablicę zawierającą określoną przez użytkownika liczbę elementów

        System.out.println("Podaj górną granicę zakresu generowania liczb do tablicy");
        int range = scanner.nextInt(); //ustawiam górną granicę zakresu z którego będą generowane liczby (0-range)


        while (i < arr.length) {
            arr[i] = random.nextInt(range);
            //System.out.println(arr[i]);
            i++;
        } //pętla przydzielająca wartości do zmiennych w tablicy

        long t = System.currentTimeMillis();

        Algorithm.QSAlgorithm(arr, 0, arr.length-1);


        System.out.println("sorted");
        Algorithm.print(arr);
        System.out.println("Czas wykonania algorytmu: " + (System.currentTimeMillis() - t) + " ms");
    }
}