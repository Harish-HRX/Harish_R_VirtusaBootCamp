
public class BridgePatternDemo {

	public static void main(String[] args) {
		System.out.println("Coloring Triangle :");
		Shape triangle = new Triangle(new RedCircle());
		triangle.drawShape();
		triangle.modifyBorder(3);
		triangle.drawShape();
		
		System.out.println("\nColoring Rectangle :");
		Shape rectangle = new Rectangle(new GreenCircle());
		rectangle.drawShape();
		rectangle.modifyBorder(2);
		rectangle.drawShape();
	}

}
