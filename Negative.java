
public class Negative

/*
Izzy arabe
4/10/2024
*/

{
    public static void main (String[]args)
    {
        int num1 = (int)(7*Math.random())-3;
        int num2 = (int)(7*Math.random())-3;
        int num3 = (int)(7*Math.random())-3;
        int num4 = (int)(7*Math.random())-3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = ");

        int sum;
        sum = num1 + num2 + num3 + num4;


        if(sum<0){
            System.out.println("Negative");
        }else{
            System.out.println("Not Negative");
        }


    }


}