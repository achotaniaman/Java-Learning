class Circle {
    private int radius;
    private float area;
    private float perimeter;

    public void setradius(int r){
        radius = r;
    }
    public void checkarea(float a){  
         area=3.14f*radius*radius;
         if(area==a)
        {
            System.out.println("Correct Area.");
        }
        else{
            System.out.println("Incorrect Area.");
        }
    }
    public void checkperimeter(float p){
        perimeter = 2*3.14f*radius;
        if(perimeter==p)
        {
            System.out.println("Correct Perimeter.");
        }
        else{
            System.out.println("Incorrect Perimeter.");
        }
    }
}
public class accessmodifier{
    public static void main(String[] args){
        Circle c= new Circle();
        c.setradius(3);
        c.checkarea(28.26f);
        c.checkperimeter(18.84f);
    }
}