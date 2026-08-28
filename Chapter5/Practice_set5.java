
import java.util.*;

class Practice_set5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Problem 1
        // int n= 4;
        // for(int i=n;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // Problem 2
        // int sum=0;
        // System.out.println("Enter number upto u want its even sum: ");
        // int n = sc.nextInt();
        // for(int i=0;i<=n;i++){
        //     sum= sum+(2*i);
        // }
        // System.out.println("Sum of even nos is: "+sum);
        // int n = 6;
        // Problem 3
        // for (int i = 1; i <= 10; i++) {
        //     System.out.printf("%d X %d= %d \n", n, i, n * i);

        // }

        //  for (int i = 10; i>=1; i--) {
        //     System.out.printf("%d X %d= %d \n", n, i, n * i);

        // }

        // int i=1;
        // int fact=1;
        // while (i<=n) {
        //     fact *=i;
        //     i++;
            
            
        // }
        // System.out.println(fact);

 int n = 8;
 int sum =0;
        // Problem 9
        for (int i = 1; i <= 10; i++) {
            sum += i*n;
            // System.out.printf("%d X %d= %d \n", n, i, n * i);

        }
        System.out.println(sum);
    }
}
