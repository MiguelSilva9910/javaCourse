package course.Inputs;
import java.util.*;

public class ReadInputsWithScanner {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    public static void example1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name ?");
        String name = sc.next();
        System.out.println("Your name is: "+ name);
    }

    public static void example2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you ?");
        int year = sc.nextInt();
        System.out.println(year + "  old");
    }

    public static void example3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How tall are you ?");
        double height = sc.nextDouble();
        System.out.println("I have "+ height + " metres");
        double averageMaleHeightDifference = height - 1.75;
        double averageFemaleHeightDifference = height - 1.62;
        System.out.println("\n The differente between your height and the difference is: ");
        System.out.format("%.2f meters if you are male ", averageMaleHeightDifference);
        System.out.format("\n %.2f meters if you are female ", averageFemaleHeightDifference);
    }
}
