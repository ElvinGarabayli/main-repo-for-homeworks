import java.util.*;
public class Ttime {
    public static void main(String args[]){
        System.out.println("Enter your value:");
        Scanner vit=new Scanner(System.in);
        int a=vit.nextInt();
        /* 1saat 60 deqiqe , 1 deqiqe 60 saniye, 1 saat 3600 saniye 3691 */
        int hours= a/3600;
        int b= a%3600;
        int minutes=b/60;
        int seconds= b%60;
        System.out.println(hours + " hours and " + minutes + " minutes and " + seconds + " seconds");


    }
}
