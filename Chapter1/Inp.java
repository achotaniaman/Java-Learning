import java.util.*;

public class Inp {
    public static void main(String[] args) {
        System.out.println("Employee Details ");
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = n.nextLine();
        System.out.println("Enter ID of Employee: ");
        String id = n.nextLine();
        System.out.println("Enter salary of Employee:");
        String Salary = n.nextLine();
        System.out.println("Enter Branch of Employee:");
        String branch = n.nextLine();

        System.out.println("Details of Employee are: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + Salary);
        System.out.println("Branch: " + branch);
        n.close();

    }

}
