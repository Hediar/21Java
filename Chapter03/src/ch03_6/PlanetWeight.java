package ch03_6;

import java.util.Scanner;

public class PlanetWeight {
    public static void main(String [] args) {
        String[] name = new String[12];
        Float[] weight = new Float[12];
        Scanner scan = new Scanner(System.in);
        char con;
        int x=0;
        while(x<12) {
            System.out.print("Please enter any planet name: ");
            name[x] = scan.next();
            System.out.print("Please enter its weight: ");
            weight[x] = scan.nextFloat();
            System.out.println("Your weight on "+ name[x]+" is "+weight[x]);
            System.out.print("Continue (Y/N)?: ");
            con = scan.next().charAt(0);
            if(con=='y'){
            }
            else if(con=='n'){
                System.out.print("Thank you for working!");
                x=x+12;
            }
            else{
                System.out.print("Thank you for working!");
                x=x+12;
            }
            x= x+1;
        }
    }
}
