package designpattern;

public class Tiger implements Animal{

	@Override
	public void says() {
		System.out.println("Tiger says ROAR ROAR");
	}

	@Override
	public void eats() {
		System.out.println("Tiger says Meat");
	}

}
