import java.util.*;

class Library {

    int count = 0;

    public void addBook(int[] arr, int book) {
        if (count >= arr.length) {
        System.out.println("Library is full!");
        return;
    }

        arr[count]= book;
        count++;

       
    }

 public void issueBook(int[] arr, int book) {

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (arr[i] == book) {

            found = true;

            for (int j = i; j < count-1; j++) {
                arr[j]= arr[j+1];
                
            }

            count--;
            break;

        }
    }

    if (found!=true) {
    System.out.println("Book not found");
}
}

    public void returnBook(int[] arr, int book) {

    if (count >= arr.length) {
        System.out.println("Library is full");
        return;
    }

    arr[count] = book;
    count++;
}
    public void showAvailableBook(int[] arr) {

    for (int i = 0; i < count; i++) {
        System.out.println(arr[i]);
    }

}
}

public class Exercise4 {

 public static void main(String[] args) {

    Library myLibrary = new Library();
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[100];

    int choice;

    do {
        System.out.println("\n===== LIBRARY MENU =====");
        System.out.println("1. Add Book");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.println("4. Show Available Books");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter book number: ");
                int addBook = sc.nextInt();
                myLibrary.addBook(arr, addBook);
                break;

            case 2:
                System.out.print("Enter book number to issue: ");
                int issueBook = sc.nextInt();
                myLibrary.issueBook(arr, issueBook);
                break;

            case 3:
                System.out.print("Enter book number to return: ");
                int returnBook = sc.nextInt();
                myLibrary.returnBook(arr, returnBook);
                break;

            case 4:
                myLibrary.showAvailableBook(arr);
                break;

            case 5:
                System.out.println("Exiting library...");
                break;

            default:
                System.out.println("Invalid choice!");
        }

    } while (choice != 5);

    sc.close();
}
}