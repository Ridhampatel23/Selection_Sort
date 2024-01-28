package org.example;

public class Main {
    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // selection sort

        int arr[] = {1, 89, 90, 55, 34, 100 , 56, 3};

        for (int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for (int j =i + 1; j < arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }

            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;


        }
        printarr(arr);
    }
}