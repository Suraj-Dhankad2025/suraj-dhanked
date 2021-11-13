import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class sum{
    public static void main(String args[]){
        System.out.println("enter first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of two numbers is" + " " + sum);
    }
}