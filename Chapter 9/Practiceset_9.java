

class Cylinder {
    private int radius;
    private int height;

    // Problem 3: Constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Problem 1: Getters and Setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Problem 2: Surface Area and Volume calculations
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    // Problem 4: Overloaded Constructors
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere {
    private int radius;

    // Problem 5: Sphere implementation
    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Practiceset_9 {
    public static void main(String[] args) {
        /*
        // Problem 1:
        Cylinder myCylinder = new Cylinder(9, 12);
        // myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        // myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Problem 2:
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
        */

        // Problem 4:
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}