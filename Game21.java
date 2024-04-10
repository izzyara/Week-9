import java.util.*;
public class Game21

/*
Izzy arabe
4/10/2024
*/

{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);

        int num1 = (int)(11*Math.random())+1;
        int num2 = (int)(11*Math.random())+1;
        int sum1 = num1 + num2;
        System.out.println("You have a " + num1 + "and a " + num2 + " for a total of " + sum1);
        System.out.println("Enter a 1 if you want another card or any other number for no card ");
        int ans = input.nextInt();

        if (ans == 1){
            int num3 = (int)(11*Math.random())+1;
            sum1 = sum1 + num3;
            System.out.println("You got a " + num3 + "for a total of " + sum1);
        }
        
        int dnum1 = (int)(11*Math.random())+1;
        int dnum2 = (int)(11*Math.random())+1;
        int dsum1 = dnum1 + dnum2;
        System.out.println("\nThe dealer has a " + dnum1 + "and a " + dnum2 + " for a total of " + dsum1);

        if (sum1>21){
            System.out.println("you lose");
        }else if(dsum1>21){
            System.out.println("you win");
        }else if(sum1>21 && sum>21){}



    }


}