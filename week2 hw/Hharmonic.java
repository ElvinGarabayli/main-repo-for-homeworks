import java.util.*;
public class Hharmonic {
    public static void main(String [] args){
        Scanner vit= new Scanner(System.in);
        int n= vit.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println(sum);
    }
}
