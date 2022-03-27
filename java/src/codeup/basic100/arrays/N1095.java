package codeup.basic100.arrays;

import java.util.Scanner;

public class N1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
