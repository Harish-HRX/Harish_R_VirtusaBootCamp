
public class NonVegMealBuilder implements MealBuilder{

	private Meal meal=new Meal();
	@Override
	public void buildBurger() {
		
		Item cb=new ChickenBurger();
		meal.additem(cb);
	}

	@Override
	public void buildDrink() {
		
		Item pepsi=new Pepsi();
		meal.additem(pepsi);
	}

	@Override
	public Meal getMeal() {
		System.out.println("Non-Veg Meal");
		meal.showItem();
		System.out.println("Total Cost:"+meal.getCost()+"\n");
		return meal;
	}

}
