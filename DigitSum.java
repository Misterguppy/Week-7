/***Emet park */
/** Emet Park */
import java.util.*;
public class DigitSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int pos = input.nextInt();
        input.close();
        int mods = 10;
        int tot = 0;
        if(pos > mods)
            pos = pos % mods;
            tot = tot + pos;
            mods = mods* 10;
        

        System.out.println("The sum of the digits is: "+tot);
    }

}
