import java.awt.*;

public class Shape2D {
    public double area;
    public String name;

    public Shape2D(){
        name = "Square";
        area = 5*5;
        System.out.println("A Square has been created with length:  5");
    }
    public Shape2D(int a, int b){
        area = a * b;
        name = "Rectangle";
        System.out.println("A Rectangle has been created with length : " + a + " and breadth: " + b);
    }
    public Shape2D(int a, int b, String s){
        area = 0.5*a*b;
        name = s;
        System.out.println("A " + name + " has been created with height: " + a + " and base: " + b);
    }
    public Shape2D(int a, int b, int c){
        name = "Triangle";
        double s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a) * (s-b) * (s-c));
        System.out.println("A Triangle has been created with the following sides: " + a + ", " + b + ", " +c);
    }
    public void area(){
        System.out.printf("The area of the " + name + " is: " + "%.2f\n",area);
    }
}
