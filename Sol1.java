/*
1. Write a program to print a series with a 'while' loop.
0,1,1,2,3,5,8,13,21,..................
*/
import java.util.Scanner;

public class FibonacciCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get Fibonacci number: ");
        int n = sc.nextInt();
        int first = 0, second = 1, next;
        int i = 0;
        while(i<=n){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
            i++;
        }

    }
}