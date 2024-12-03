package MiniProject;

       class Vehicle{
    	   void startEngine() {
    		   System.out.println("Engine is started");
    	   }
       }
       class Car extends Vehicle{
    	   void drive() {
    		   System.out.println("Car is Driving");
    	   }
       }
       class Bike extends Vehicle{
    	   void ride() {
    		   System.out.println("Bike is Ridding");
    	   }
       }
public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		// Car object
        Car car = new Car();
        car.startEngine();
        car.drive();

        // Bike object
        Bike bike = new Bike();
        bike.startEngine();
        bike.ride();
	}

}
