
public class Rectangle extends Shape{
	
	private int inch=50;
	
	public Rectangle(IColor color) {
		super(color);
		
	}

	@Override
	public void drawShape() {
		System.out.print("This Rectangle colored with:");
		color.fillWithColor(inch);
	}

	@Override
	public void modifyBorder(int times) {
		System.out.println("Now we are changing the border length "+(times)+" times");
		inch=inch*times;
	}

}
