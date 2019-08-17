package course.SaídaDeDados;
import java.util.*;

public class SaidaDeDados {
    public static void main(String[] args){
        char gender = 'M';
        int age = 20;
        double balance = 10.35784;
        String name="Miguel";

        System.out.print("Hello, good morning");
        System.out.println("Hello, good afternoon");
        System.out.println("Good night");
        System.out.println("<----------------->");
        System.out.printf("%.2f%n", balance);
        System.out.printf("%.4f%n", balance);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", balance);
        System.out.println("<----------------->");
        System.out.printf("%s is %d years old, gende %c, and got balance = %.2f bitcoin %n", name, age, gender, balance);

    }
}
