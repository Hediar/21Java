package ch01_6;
import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        int x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter number to calculate: ");
        x=scanner.nextInt();
        System.out.println("The square root of " + x + " is " + Math.sqrt(x));
        System.out.print("by 이세령_2021250005");
    }
}
