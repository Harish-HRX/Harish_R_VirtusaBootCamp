
public class RedShapeDecorator extends ShapeDecorator{

	RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Border Color:Red");
		
	}

}
