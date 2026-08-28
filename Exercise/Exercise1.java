import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Cbsc percentage calculator ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you marks in Maths out of 100: ");
        float Maths = sc.nextFloat();
         System.out.println("Enter you marks in Physics out of 100: ");
        float Physics = sc.nextFloat();
         System.out.println("Enter you marks in Chemistry out of 100: ");
        float Chemistry = sc.nextFloat();
         System.out.println("Enter you marks in English out of 100: ");
        float English = sc.nextFloat();
         System.out.println("Enter you marks in Biology out of 100: ");
        float Biology = sc.nextFloat();

        float percentage = (Maths+Physics+Chemistry+English+Biology )/500*100;

        System.out.println("Your Percentage is: "+percentage);
        sc.close();

    }
    
}
