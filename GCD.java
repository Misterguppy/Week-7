/** Emet Park */
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = input.nextInt();
        input.close();
        while(num2 > 0 ){
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }System.out.println("The GCD is "+ num1);
            
        
     }
}
