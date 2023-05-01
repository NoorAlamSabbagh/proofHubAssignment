//3. Write a command to find if a given number is even/odd without a conditional statement?
import java.util.*;
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = sc.nextInt();
        String result = (num & 1) == 0 ? "even" : "odd";
        System.out.println(num + " is " + result);
    }
}
