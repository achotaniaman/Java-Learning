class one{
    public void  greet(){
        System.out.println("Good morning");
    }
    public void name(){
        System.out.println("My name is java");
    }
}

class two extends  one{ 
    @Override 
    public void name(){
        System.out.println("My name is java in class two");
    }

    public void swagat(){
        System.out.println("Aapka swagat hai");
    }
}
public class Dynamic_dispatch {
    public static void main(String[] args) {
        // one obj= new one();
        // obj.greet();

        one obj = new two();
        obj.name();

    }
    
}
