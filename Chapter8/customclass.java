class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("Id of employee is: "+ id);
        System.out.println("Name of employee is: "+ name);

    }
}


public class customclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Aman = new Employee();
        Aman.id = 33;
        Aman.name="Prois";
        // System.out.println(Aman.id);
        // System.out.println(Aman.name);
        Aman.printdetails();
    }
}
