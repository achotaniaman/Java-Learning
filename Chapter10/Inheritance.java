
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printhello(){
        System.out.println("Hello");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

 public class  Inheritance{
    public static void main(String[] args) {
        Derived b = new Derived();
        b.setX(11);
        System.out.println(b.getX());
        
    }
}