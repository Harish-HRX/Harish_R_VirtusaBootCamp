
public class TollyWoodActionMovie implements ITollyWoodMovie{

	String name;
	
	TollyWoodActionMovie(String movie)
	{
		this.name=movie;
	}
	
	public void getMovieName(){
		System.out.println(name+" is a TollyWood Action Movie");
	}
}
