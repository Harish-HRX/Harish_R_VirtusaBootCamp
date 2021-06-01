
abstract public class ShapeDecorator implements Shape{
	
	protected Shape decoratedShape;
	
	ShapeDecorator(Shape shape){
		this.decoratedShape=shape;
	}
	
}
