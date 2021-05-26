
public class ComedyMovieFactory implements IMovieFactory{

	@Override
	public ITollyWoodMovie getTollyWoodMovie(String imovie) {
		
		 if("Basantabilap".equalsIgnoreCase(imovie)) {
	        	return new TollyWoodComedyMovie("Basantabilap");
	      }
		 return null;
	}

	@Override
	public IBollyWoodMovie getBollyWoodMovie(String imovie) {
		 if ("Munna Bhai MBBS".equalsIgnoreCase(imovie)) {
	            return new BollyWoodComedyMovie("Munna Bhai MBBS");
	     } 
	        return null;
		
	}

}
