
public class GreenShapeDecorator extends ShapeDecorator{

	GreenShapeDecorator(Shape shape) {
		super(shape);
		
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Border Color:Green");
		
		
	}

}
