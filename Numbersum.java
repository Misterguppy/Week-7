/**Emet Park
 * 3/21/24
 * numbersum
 */

import java.util.*;
public class Numbersum {
    public static void main(String[] args){
        int count = 1;
        int tot = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = input.nextInt();
        input.close();
        boolean counted = false;
        System.out.println('1');
        while(!counted){
            
            tot+= count;
           
            count += 1;
            
            System.out.println(count);
            if(count == num){
                counted = true;
                System.out.println(tot);
            }


        
       
       }
    }
}