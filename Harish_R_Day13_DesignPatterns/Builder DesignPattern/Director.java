
public class Director {
	
	MealBuilder IMealBuilder;
	
	public void construct(MealBuilder builder) {
		IMealBuilder=builder;
		IMealBuilder.buildBurger();
		IMealBuilder.buildDrink();
		IMealBuilder.getMeal();
	}
}
