import java.util.*;
public class Aaverage {
    public static void main(String [] args){
        Scanner vit= new Scanner(System.in);
        int count=0;
        double sum=0;
        while(vit.hasNext()){
            double a= vit.nextDouble();
            sum+= a;
            count++;

        }
        if(count==0){
            System.out.println("No answer");
        }
        else{
            double average=sum/count;
            System.out.println(average);
        }
    }
}
