import java .lang.*;
import java.util.*;
abstract class Shapes 
{
    abstract void dimension();
 
    abstract int area();
 
    abstract int perimeter();

    abstract int volume();
}
 
class Circle extends Shapes 
{
    public int radius;
 
    public Circle(int r)
    {
        radius=r;
    }
    public void dimension() {
        System.out.println(" THE DIMENSION OF CIRCLE IS CIRCULAR IN SHAPE HAVING RADIUS 'r' :");
    }
 
    public int area() {
        return (int) (radius * radius);
    }
 
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }
    
    public int volume() 
    {
        return 0;
    }
}
 
class Rectangle extends Shapes 
{
    public int breadth;
    public int length;
 
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void dimension() {
        System.out.println(" THE DIMENSION OF RECTANGLE IS HAVING BREADTH 'b' AND LENGTH 'l' :");
    }
 
    public int area() {
        return length * breadth;
    }
 
    public int perimeter() {
        return 2 * (length + breadth);
    }
    int volume()
    {
        return 0;
    }
}
class Sphere extends Shapes
{
    public int radiusS;

    public Sphere(int ri)
    {
        radiusS =ri;
    }

    public void dimension()
    {
        System.out.println(" THE DIMENSION OF SPHERE IS DONT KNOW: ");
    }
    
    public int area()
    {
        return (int) ((int) 4*Math.PI*radiusS*radiusS);
    }

    public int perimeter()
    {
        return ((int) 6.28*radiusS);
    }

    public int volume()
    {
        return (int)((int)(4/3)*Math.PI*radiusS*radiusS);
    }
}
 
 class Abstractshapeclass 
{
    public static void main(String[] arg) 
    {
        Scanner sc = new Scanner(System.in);
 
        int l;
        int b;
        int rd;
        int ri;

        System.out.println(" ENTER THE LENGTH OF RECTANGLE ");
        l = sc.nextInt();
        System.out.println("ENTER THE BREADTH OF RECTANGLE ");
        b = sc.nextInt();
        System.out.println("ENTER THE RADIUS OF CIRCLE: ");
        rd = sc.nextInt();
        System.out.println(" ENTER THE RADIUS OF SPHERE:");
        ri =sc.nextInt();
 
        Shapes c = new Circle(rd);
        Shapes r = new Rectangle(l,b); 
        Shapes s = new Sphere(ri);
        System.out.println(" ");
 
        System.out.println("THE AREA OF CIRCLE: " + c.area());
        System.out.println(" THE PERIMETER OF CIRCLE: " + c.perimeter());
 
        System.out.println(" ");
 
        System.out.println("THE AREA OF RECTANGLE: " + r.area());
        System.out.println(" THE PERIMETER OF CIRCLE: " + r.perimeter());

        System.out.println(" ");
        System.out.println(" THE AREA OF SPHERE IS: "+s.area());
        System.out.println(" THE PERIMETER OF SPHERE IS: "+s.perimeter());
        System.out.println(" THE VOLUME OF SPHERE: "+s.volume());
    }
 }
