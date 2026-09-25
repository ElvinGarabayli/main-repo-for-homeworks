
import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner vit= new Scanner(System.in);
        int number = vit.nextInt();
        int a = number;
        int muveqqeti=number;
        int digits=0;
        while(muveqqeti!=0){
            digits++;
            muveqqeti=muveqqeti/10;
        }
        int sum =0;
        muveqqeti = 371;
        while(muveqqeti!=0){
            int digit=muveqqeti%10;
            sum+=Math.pow(digit,digits);
            muveqqeti=muveqqeti/10;
        }
        if(sum==a){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }



    }
}
