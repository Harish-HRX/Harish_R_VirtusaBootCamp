
public class Main {

	public static void main(String[] args) {

		Shape circle=new Circle();
		Shape rectangle=new Rectangle();
		
		System.out.println("Circle with normal border");
		circle.draw();
		System.out.println();
		
		System.out.println("Circle with red border");
		Shape circle1=new RedShapeDecorator(new Circle());
		circle1.draw();
		System.out.println();
		
		System.out.println("Rectangle with red border");
		Shape rectangle1=new RedShapeDecorator(new Rectangle());
		rectangle1.draw();
	}

}
