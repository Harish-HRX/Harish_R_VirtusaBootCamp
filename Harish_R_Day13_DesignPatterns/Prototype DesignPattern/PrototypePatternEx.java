
public class PrototypePatternEx {

	public static void main(String[] args) {
		
		BasicCarCache.loadCache();
		
		BasicCar car1=(BasicCar)BasicCarCache.getCar("nano");
		System.out.println("Car is "+car1.Clone()+
				" and It's Price is Rs."+car1.getPrice());
		BasicCar car2=(BasicCar)BasicCarCache.getCar("ford");
		System.out.println("Car is "+car2.Clone()+
				" and It's Price is Rs."+car2.getPrice());

	}

}
