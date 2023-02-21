package oopProject;

public class Task3 {
    /*Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount*/
    public static void main(String[] args) {
        Sedan sedan=new Sedan(15000,"Black",15);
        System.out.println( " Sedan Price "+sedan.calculateSalePrice());
        Truck truck=new Truck(20000,"Red",80);
        System.out.println("Truck Price : "+truck.calculateSalePrice());
    }
}

class Car {
    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }

    double carPrice;
    String carColor;

    double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car {
    double length;
    public Sedan(double carPrice, String carColor,double length) {
        super(carPrice, carColor);
        this.length=length;
    }

     double calculateSalePrice(){
         if( length >20)
         {
             return carPrice-(carPrice*.05);
         }  else {
             return carPrice-(carPrice*.10);
         }





     }
}

class Truck extends Car {
    double weight;

    public Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * 0.10);
        }else

            return carPrice-(carPrice*0.20);
    }
}
