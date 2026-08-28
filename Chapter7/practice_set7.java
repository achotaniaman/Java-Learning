import java.util.*;

public class practice_set7 {

    static void multiplication(int n) {
        int i = 0;
        int tab = 0;
        while (i <= 10) {
            tab = i * n;
            System.out.printf("%d X %d = %d \n", n, i, tab);
            i++;

        }

        
        

    }

    static void pattern1(int n){
        for(int i = 0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
                // System.out.println("");
            }
            System.out.println();
        }
    }

    static int sum(int n){
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else
        {
            return n+sum(n-1);
        }
    }

     public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

       static void pattern2(int n){
        for(int i = n+1;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
                // System.out.println("");
            }
            System.out.println();
        }
    }

    static float avg(float ...arr){
          float result =0;
          
        for(float a:arr){
            result +=a;
            
        }
        return result/arr.length;
    }


     static void pattern1_rec(int n){
        if(n>0)
        {
            pattern1_rec(n-1);
        
            for (int j=0;j<n;j++){
                System.out.print("*");
                // System.out.println("");
            }
            System.out.println();
        }
    }

      static void pattern2_rec(int n){
        if(n>0)
        {
        
            for (int j=0;j<n;j++){
                System.out.print("*");
                // System.out.println("");
            }
            System.out.println();
            pattern2_rec(n-1);

        }
    }

 
    



    public static void main(String[] args) {
        // Scanner sc=  new Scanner(System.in);
        // System.out.println("Enter number whose table you want: ");
        //  int a = sc.nextInt();
        // multiplication(a);
        // pattern1(5);
        // int n = 5;
        // System.out.println(sum(n));
        // pattern2(5);
        // System.out.println(fibonacci(6));
        // System.out.println(avg(5,5,6,7));
        pattern2_rec(5);
    }
}
