import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner vit= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = vit.nextInt();
        System.out.println("Enter the second number");
        int b=vit.nextInt();

        int sum= a+b;
        int sub = a-b;
        int mult=a*b;
        int div=a/b;

        System.out.println("which operation needed?");
        System.out.println("if you want sum click 1");
        System.out.println("if you want substraction click 2");
        System.out.println("if you want multiplication click 3");
        System.out.println("if you want division click 4");

        Scanner sc= new Scanner(System.in);
        int akula=sc.nextInt();

        if(akula == 1){
            System.out.println(sum);
        }
        if(akula==2){
            System.out.println(sub);
        }
        if(akula==3){
            System.out.println(mult);
        }
        if(akula==4){
            System.out.println(div);
        }
    }
}
