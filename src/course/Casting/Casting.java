package course.Casting;

public class Casting {
    public static void main(String[] args){
        double a;
        float b;
        int c, e , f, g;
        double d, result;
        String s = "33";
 // !-----> Example 1 <-----------------------!
        a = 5.0;
        b = (float)a; //convert double in float
 // !-----> Example 2 <-----------------------!
        d = 5.7;
        c = (int)d; //convert double in int
 // !-------> Example 3 <---------------------!
        e = 5;
        f = 2;
        result = (double) e/f;
 // !-------> Example 4 <---------------------!
        //convert String in int
        g = Integer.parseInt(s); //Convert String in int

        System.out.println(b);
        System.out.println(c);
        System.out.println(result);
        System.out.println(g);
    }
}
