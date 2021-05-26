
public abstract class ColdDrink implements Item{
	
	public Packing packing() {
		Packing p=new Bottle();
		return p;
	}
}
