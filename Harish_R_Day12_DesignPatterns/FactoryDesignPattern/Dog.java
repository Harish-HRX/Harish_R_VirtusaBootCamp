package designpattern;

public class Dog implements Animal{

	@Override
	public void says() {
		System.out.println("Dog says BOW BOW");
	}

	@Override
	public void eats() {
		System.out.println("Dog eats Pedigree");
	}
	
}
