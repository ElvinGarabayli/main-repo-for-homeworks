import java.util.*;
public class Ddigits {
    public static void main(String[] args){
        Scanner vit= new Scanner(System.in);
        int a=vit.nextInt();
        int b=a;
        int sum=0;
        int product=1;
        double average=0.0;
        int count=0;
        int digit=0;
        if(b<0){
            b=b*(-1);
        }else if (b==0){
            System.out.println("Sum, Product, and Average is 0");
        }
        else{
            while(b>0){
                count++;
                digit=b%10;
                b=b/10;

                sum=sum+digit;
                product= product*digit;
            }
            average=(double)sum/count;
            System.out.println(sum);
            System.out.println(product);
            System.out.println(average);
        }

    }
}
