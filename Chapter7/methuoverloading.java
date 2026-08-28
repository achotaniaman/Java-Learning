public class methuoverloading {

    static void change(int a){
        a= 69;
    }

      static void change2(int [] a){
        a[0]= 69;
    }
    static void hello() {
        System.out.println("Hello World");
    }
     static void hello(String a) {
        System.out.println("Hello "+a);
    }

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z; // Added return statement
    }

    public static void main(String[] args) {
        int [] marks = {23,45,65,1,7};
        change2(marks);
        System.out.println(marks[0]);
        String a=  "Aman";
        hello(a);


        hello();
        int x=  45;
        change(x);
        System.out.println(x);

    }
}
