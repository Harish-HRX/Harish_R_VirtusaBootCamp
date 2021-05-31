
public class Professor implements Faculty{
	String name;
	String position;
	String officeNumber;
	
	Professor(){
		
	}
	
	Professor(String name,String position,String officeNumber){
		this.name=name;
		this.position=position;
		this.officeNumber=officeNumber;
	}
	
	@Override
	public String getDetails() {
		
		return position+" "+name+" is the "+officeNumber;
	}
}
