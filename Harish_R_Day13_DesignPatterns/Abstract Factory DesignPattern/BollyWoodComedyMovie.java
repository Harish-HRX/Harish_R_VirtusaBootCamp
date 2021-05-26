
public class BollyWoodComedyMovie implements IBollyWoodMovie{
	
	String name;
	
	BollyWoodComedyMovie(String movie)
	{
		this.name=movie;
	}
	
	public void getMovieName(){
		System.out.println(name+" is a BollyWood Comedy Movie");
	}
}
