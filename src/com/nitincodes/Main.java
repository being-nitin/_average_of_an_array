package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java program to print the average of all the elements of an array:
        Scanner sc = new Scanner(System.in);
        System.out.println("The length of the array is:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int z = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            z = z+arr[i];
        }
        System.out.println("The average of all the elements of an array is " +z/n);
    }
}
