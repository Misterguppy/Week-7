/**Emet Park'
 * 3/19/24
 */

 import java.util.*;
 public class Grades {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade number");
        int grade = input.nextInt();
        input.close();
        if(grade>= 90){
            System.out.println("Your grade is an A");

        }

        else if(grade >=80){
            System.out.println("Your grade is a B");
        }
        else if(grade >=70){
            System.out.println("Your grade is a C");
        }
        else if(grade >=60){
            System.out.println("Your grade is a D");
        }
        else{
            System.out.println("Your grade is a F");
        }
     }
 }