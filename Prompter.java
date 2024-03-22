/** Emet Park */
import java.util.*;
public class Prompter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int min = input.nextInt();
        System.out.println("Enter a second number higher than the one before: ");
        int max = input.nextInt();
        System.out.println("Enter a number between "+min+" and "+max);
        int mid = input.nextInt();
        while(min>= mid || max <= mid){
            System.out.println("Enter a number between "+min+" and "+max);
            mid = input.nextInt();
        }

        
            
        input.close();
     }
}
