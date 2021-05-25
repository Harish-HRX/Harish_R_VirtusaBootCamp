package designpattern;

public class AnimalFactory {
	
	public static Animal getAnimalType(AnimalType animalType){
		Animal animal=null;
		
		switch(animalType) {
		  
		  case TIGER:animal=new Tiger();
		  break;
		  
		  case DUCK:animal=new Duck();
		  break;
		  
		  case DOG:animal=new Dog();
		  break;
		}

		return animal;
	}
}
