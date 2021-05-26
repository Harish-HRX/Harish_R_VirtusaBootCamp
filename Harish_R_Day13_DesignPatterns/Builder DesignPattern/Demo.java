
public class Demo {

	public static void main(String[] args) {
		Director dir=new Director();
		dir.construct(new VegMealBuilder());
		dir.construct(new NonVegMealBuilder());
	}

}
