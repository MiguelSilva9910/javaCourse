package course.Variables;

public class ManipulationIntVariables {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }

    public static void example1(){
        System.out.println("\t\tExample1");
        int x = 15;
        System.out.println("\t" + x); //Output: 15
        x = 1000;
        System.out.println("\t" + x); //Output: 1000
        x=-20000;
        System.out.println("\t" + x); //Output: -20000
        System.out.println("/--------------------");
    }

    public static void example2(){
        System.out.println("\t\tExample2");
        int x = 3;
        int y = 2;
        x = y + x + y;
        System.out.println("\t" + x); //Output: 7
        System.out.println("/--------------------");
    }

    public static void example3(){
        System.out.println("\t\tExample3");
        int x = 17;
        int y = 5;
        System.out.println("\t" + x / y); //Output: 3
        System.out.println("/--------------------");
    }

    public static void example4(){
        System.out.println("\t\tExample4");
        double x = 17;
        int y = 5;
        System.out.println("\t" + x / y); //Output: 3.4
        System.out.println("/--------------------");
    }

}
