import java.util.*;
public class Sumoftheodds {
    public static void main(String [] args){
        Scanner vit=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =vit.nextInt();
        System.out.println("Enter second number:");
        int b= vit.nextInt();
        int kicik=Math.min(a,b);
        int boyuk= Math.max(a,b);
        int sum=0;
        for( int i=a; i<=b;i++){
            if(i%2!=0 && i%3!=0 && i%4!=0 && i%5!=0 && i%6!=0 && i%7!=0 && i%8!=0 && i%9!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
