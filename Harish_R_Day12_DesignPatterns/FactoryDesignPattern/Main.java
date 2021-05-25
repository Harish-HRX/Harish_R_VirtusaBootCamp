package designpattern;

public class Main {
	
	public static void main(String []args) {
		
		AnimalFactory animalfactory=new AnimalFactory();
		
		animalfactory.getAnimalType(AnimalType.DOG).says();
		animalfactory.getAnimalType(AnimalType.DUCK).says();
		animalfactory.getAnimalType(AnimalType.TIGER).says();
		
	}
	
}
