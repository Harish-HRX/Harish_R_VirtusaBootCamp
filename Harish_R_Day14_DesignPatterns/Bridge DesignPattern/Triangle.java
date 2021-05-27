
public class Triangle extends Shape{

	private int inches=20;
	
	public Triangle(IColor color) {
		super(color);
		
	}

	@Override
	public void drawShape() {
		System.out.print("This Triangle colored with: ");
		color.fillWithColor(inches);
	}

	@Override
	public void modifyBorder(int times) {
		System.out.println("Now we are changing the border length "+(times)+" times");
		inches*=times;
	}

}
