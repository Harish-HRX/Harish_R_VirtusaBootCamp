
public class Demo {

	public static void main(String[] args) {
			
		System.out.println("***Abstract Factory Pattern Demo***\n");
		System.out.println("Action movies are:");
		IMovieFactory genre1= FactoryProvider.getGenre("Action");
		ITollyWoodMovie movie1=genre1.getTollyWoodMovie("Kranti");
		movie1.getMovieName();
		
		IMovieFactory genre2= FactoryProvider.getGenre("Action");
		IBollyWoodMovie movie2=genre2.getBollyWoodMovie("Bang Bang");
		movie2.getMovieName();
		
		System.out.println("\nComedy movies are:");
		IMovieFactory genre3= FactoryProvider.getGenre("Comedy");
		ITollyWoodMovie movie3=genre3.getTollyWoodMovie("BasantaBilap");
		movie3.getMovieName();
		
		IMovieFactory genre4= FactoryProvider.getGenre("Comedy");
		IBollyWoodMovie movie4=genre4.getBollyWoodMovie("Munna Bhai MBBS");
		movie4.getMovieName();
		
	}

}
