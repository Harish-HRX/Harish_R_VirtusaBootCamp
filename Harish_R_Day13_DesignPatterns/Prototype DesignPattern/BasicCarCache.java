import java.util.Hashtable;

public class BasicCarCache {

	private static Hashtable<String,BasicCar> carMap=new Hashtable<String,BasicCar>();
	
	public static BasicCar getCar(String modelName) {
		BasicCar car=carMap.get(modelName);
		return (BasicCar)car.clone();
	}
	
	public static void loadCache() {
		Nano nano=new Nano();
		nano.setModelName("nano");
		carMap.put(nano.getModelName(), nano);
		
		Ford ford=new Ford();
		ford.setModelName("ford");
		carMap.put(ford.getModelName(),ford);
	}
	
}
