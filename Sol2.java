// 2. Write a program to get a sum of even and odd numbers between 1-100

public class SumEvenOddNumber {
    public static void main(String[] args) {
        int even_sum = 0;
        int odd_sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                even_sum += i;
            } else {
                odd_sum += i;
            }
        }
        
        System.out.println("Sum of even numbers: " + even_sum);
        System.out.println("Sum of odd numbers: " + odd_sum);
    }
}