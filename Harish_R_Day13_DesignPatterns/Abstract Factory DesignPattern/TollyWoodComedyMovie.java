
public class TollyWoodComedyMovie implements ITollyWoodMovie{
	
String name;
	
	TollyWoodComedyMovie(String movie)
	{
		this.name=movie;
	}
	
	public void getMovieName(){
		System.out.println(name+"is a TollyWood Comedy Movie");
	}
}
