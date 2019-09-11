package course.Inputs;

public class formatInputs {
    public static void main(String[] args) {
        example1();
        System.out.println();
        example2();
        System.out.println();
        example3();
        System.out.println();
        example4();
    }

    public static void example1(){
        System.out.format("I have %d cats, %d dogs and 1 %s", 7, 2, "panther");
    }

    public static void example2(){
        System.out.format("I have %f cats, %d dogs and 1 %s", 7.9, 2, "panther");
    }

    public static void example3(){
        System.out.format("I have %.1f cats, %d dogs and 1 %s", 7.9, 2, "panther");
    }

    public static void example4(){
        System.out.println(4.5 - 2.7);
        System.out.format("When formatted: %.1f ", 4.5 - 2.7);
    }
}
