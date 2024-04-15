/**Emet Park */

public class Investments {
    public static void main(String[] args){
        double start = 2500;
        boolean count = false;
        double multiplier = 1.075;
        int years = 0;
        while(!count){
            start *= multiplier;
            years +=1;
            if(start >= 5000){
                count = true;
            }
      
        }
        System.out.println("It has taken "+years+" for $2500 to reach over $5000 with 7.5% interest");
    }
}
