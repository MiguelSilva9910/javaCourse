package course.Variables;

public class VariablesIntExample {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
    }

    public static void example1(){
        int x = 10;
        System.out.println(x); //Output: 10
    }

    public static void example2(){
        int num = 20;
        System.out.println(num); //Output: 20
    }

    public static void example3(){
        int num = 20;
        System.out.println(num + 6); //Output: 26
    }

    public static void example4(){
        int num = 20/4;
        System.out.println(num + 6); //Output: 11
    }

    public static void example5(){
        int num = 20/(4-2);
        System.out.println(num+6); //Output: 16
    }
}
