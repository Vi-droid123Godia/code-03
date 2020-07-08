package Challenges;

import java.util.Scanner;

public class ArrysSortingChallenge1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of elements in array= \r");
        int n=sc.nextInt();
        int q[]=getIntegers(n);
        sortIntegers(q);
        printIntegers(q);
    }
    public static int[] getIntegers(int n){
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the " + (i+1) + " element ");
            a[i]=sc.nextInt();
        }
        return a;
    }
    public  static int[] sortIntegers(int[] a) {

        for(int i=0;i<a.length-1;i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        return a;
    }
    public static  void printIntegers(int[] a){
        for (int i=0;i<a.length;i++){
        System.out.print(a[i] + " \t");
         }
    }
}
