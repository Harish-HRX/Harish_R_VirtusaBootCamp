
abstract public class BasicCar implements Cloneable{
	
	protected int price=100000;
	private String modelName;
	
	abstract String Clone();
	
	public int getPrice() {
		return price;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	public Object clone() {
		Object clone=null;

		try{
			clone=super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	
	
}
