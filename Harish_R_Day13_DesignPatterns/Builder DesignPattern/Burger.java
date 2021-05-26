
public abstract class Burger implements Item{
	
	public Packing packing() {
		Packing p=new Wrapper();
		return p;
	}
}
