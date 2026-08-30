
class Employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }

}

class celphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Call frnd...");
    }
}


class square{
    int side;
    public void initalizeside(int n){
        side = n;
    }

    public int area(){
        int area= side*side;
        return area;
    }
     public int peri(){
       int peri= side*4;
        return peri;
    }
}


class rect{
    int length;
    int breadth;
    public void initalizeside(int l,int b){
        length =l;
        breadth = b;
    }

    public int area(){
        int area= length*breadth;
        return area;
    }
     public int peri(){
       int peri= 2*(length+breadth);
        return peri;
    }
}

public class practiceset8 {
    public static void main(String[] args) {
        // Problem 1
    // Employee1 aman = new Employee1();
    // aman.setname("Aman Achotani") ;
    // System.out.println(aman.getname());
    // aman.salary = 10000;
    // System.out.println(aman.getsalary());

    // Problem 2
    // celphone apple = new celphone();
    // apple.ringing();
    // apple.vibrate();
    // apple.call();

    // Problem 3

    // square first= new square();
    // first.initalizeside(5);
    
    
    // System.out.println(first.area());
    // System.out.println(first.peri());

        rect first= new rect();
    first.initalizeside(5,3);
    
    
    System.out.println(first.area());
    System.out.println(first.peri());




    }

   
    
}
