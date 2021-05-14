
public abstract class Shape {
	
	String color;
    
    abstract public void calculateArea();
    
    public void setcolor(String color){
        this.color=color;
        System.out.println(this.color);
    }
    
}
