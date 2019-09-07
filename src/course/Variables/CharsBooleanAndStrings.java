package course.Variables;

public class CharsBooleanAndStrings {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }

    public static void example1(){
        System.out.println("\t\tExample1");
        boolean x = false;
        boolean y = true;
        System.out.println("x is "+ x); //Output: x is false
        System.out.println("y is "+ y); //Output: y is true
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
        String string1 = "arroz";
        String string2 = "frango";
        System.out.println(string1 + " com "+ string2);
    }
}
