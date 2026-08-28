import java.util.*;
public class recu {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter number whose factorial you want: ");
        int a=  sc.nextInt();
        System.out.println("Factorial of "+a+" is: "+factorial(a));
    }
    
}
