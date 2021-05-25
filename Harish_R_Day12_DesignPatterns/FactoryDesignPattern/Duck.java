package designpattern;

public class Duck implements Animal{

	@Override
	public void says() {
		System.out.println("Duck says BUCK BUCK");
	}

	@Override
	public void eats() {
		System.out.println("Duck eats fish");
	}

}
