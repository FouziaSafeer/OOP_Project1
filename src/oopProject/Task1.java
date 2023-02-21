package oopProject;

public class Task1 {
    /*1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
*/
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.calculateArea();
        circle.calculateParameter();
        Square square=new Square(5);
        square.calculateArea();
        square.calculateParameter();
    }
}
interface Shape{
   void calculateArea();
   void calculateParameter();


}
class Circle implements Shape{
    public Circle(int radius) {
        this.radius = radius;
    }

    int radius;
  public    void calculateArea(){
      System.out.println("Circle Area: "+3.14 *(radius*radius));
  }
     public void calculateParameter(){
         System.out.println("Circle parameter: "+2*3.14*radius);
     }

}
class Square implements Shape{
    public Square(double length) {
        this.length = length;
    }

    double length;
    public void calculateArea(){
        System.out.println("Area of Square: "+length*length);
    }
   public void calculateParameter(){
       System.out.println("Paramater of Square: "+length*4);
   }
}