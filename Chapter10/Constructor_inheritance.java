
class parent{
    public int x;

    public parent() {
        System.out.println("I am a parent");
    }

    public parent(int x) {
        System.out.println("I am overloaded parent with val of x: "+x);
    }
    
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class child extends  parent{
    public int y;

    public child() {
        // super(0);
        System.out.println("I am child");
    }

    public child(int x,int y) {
    super(x);
      System.out.println("I am overloading child with val of y: "+y);
    }
    
    

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class grandchild extends child{
    public int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public grandchild() {
        System.out.println("I am grandchild");
    }

    public grandchild(int z, int x, int y) {
        super(x, y);
        System.out.println("I am overloaded constructor in grandchild class and z is: "+z);
    }
    

    
}

public class Constructor_inheritance {
    public static void main(String[] args) {
        // parent p = new parent();
        // child c= new child(13,12);
        grandchild g= new grandchild(1,2,3);


    }
}
