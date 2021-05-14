
public class Main {

	public static void main(String[] args) {
	      Circle cr=new Circle();
	       cr.calculateArea();
	       Square sq=new Square();
	       sq.calculateArea();
		//Task 2
		IVehicle iv=new Car();
		iv.drive();
		iv.turnLeft();
		iv.brake();
		IPublicTransport ip= new Train();
		ip.getNumberOfPeople();
	}

}
