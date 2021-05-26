
public class BollyWoodActionMovie implements IBollyWoodMovie{
	String name;
	
	BollyWoodActionMovie(String movie)
	{
		this.name=movie;
	}
	
	public void getMovieName(){
		System.out.println(name+" is a BollyWood Action Movie");
	}
}
