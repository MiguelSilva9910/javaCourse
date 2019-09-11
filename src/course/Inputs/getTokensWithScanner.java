package course.Inputs;

import java.util.Scanner;

public class getTokensWithScanner {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name? ");
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("My name is " + firstName + " and my last name is "+ lastName);
    }

    public static void example2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name? ");
        String name = sc.nextLine();
        System.out.println("My name is "+ name);
    }
}
