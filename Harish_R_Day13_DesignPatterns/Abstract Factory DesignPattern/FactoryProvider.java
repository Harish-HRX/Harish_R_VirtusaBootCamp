
public class FactoryProvider {
	
	
	public static IMovieFactory getGenre(String genre) {
		 if ("Action".equalsIgnoreCase(genre)) {
			 return new ActionMovieFactory();
		 }
	     else if("Comedy".equalsIgnoreCase(genre)) {
	    	 return new ComedyMovieFactory();
	     }
		 return null;
	}
}
