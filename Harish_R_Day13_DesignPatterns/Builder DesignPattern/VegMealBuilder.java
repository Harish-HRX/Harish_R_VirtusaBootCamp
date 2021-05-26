
public class VegMealBuilder implements MealBuilder{
	
	private Meal meal=new Meal();
	@Override
	public void buildBurger() {
		
		Item vb=new VegBurger();
		meal.additem(vb);
	}

	@Override
	public void buildDrink() {
		
		Item vb=new Coke();
		meal.additem(vb);
	}

	@Override
	public Meal getMeal() {
		System.out.println("Veg Meal");
		meal.showItem();
		System.out.println("Total Cost:"+meal.getCost()+"\n");
		return meal;
	}

}
