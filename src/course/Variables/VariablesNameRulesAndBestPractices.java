package course.Variables;

public class VariablesNameRulesAndBestPractices {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
    }

    public static void example1(){
        System.out.println("\t\tExample1");
        boolean hasDriversLicense = false;
        boolean isActivated = true;
        System.out.println("I has drivers license"+ hasDriversLicense); //Output: I has drivers license false
        System.out.println("The user is Activated "+ isActivated); //Output: The user is Activated true
    }

    public static void example2(){
        System.out.println("\t\tExample2");
        char x = 'x';
        char y = 'y';
        System.out.println("x is "+ x); //Output: x is x
        System.out.println("y is "+ y); //Output: y is y
    }

    public static void example3(){
        System.out.println("\t\tExample3");
        String arroz = "arroz";
        String frango = "frango";
        System.out.println(arroz + " com "+ frango);
    }

    public static void example4(){
        System.out.println("\t\tExample4");
        int age = 27;
        System.out.println(age); // Output: 27
    }

    public static void example5(){
        System.out.println("\t\tExample5");
        double statusHeightMetros = 14.27;
        System.out.println(statusHeightMetros); //Output: 14.27
    }

    public static void example6(){
        System.out.println("\t\tExample6");
        char copyrightSymbol = '\u00a9';
        System.out.println(copyrightSymbol);
    }
}
