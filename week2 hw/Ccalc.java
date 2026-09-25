import java.util.Scanner;

public class Ccalc {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a+b;
        int diff = a-b;
        int multiplication = a*b;
        int division = a/b;
        int remainder = a%b;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);

    }
}
