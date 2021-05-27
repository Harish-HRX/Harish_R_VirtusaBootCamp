
public abstract class Shape {
	
	protected IColor color;
	
	public Shape(IColor color) {
		this.color=color;
	} 
	
	abstract void drawShape();
	abstract void modifyBorder(int times);
}
