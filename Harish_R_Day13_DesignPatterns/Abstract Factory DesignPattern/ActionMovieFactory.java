
public class ActionMovieFactory implements IMovieFactory{

	@Override
	public ITollyWoodMovie getTollyWoodMovie(String imovie) {
		 if ("Kranti".equalsIgnoreCase(imovie)) {
			 return new TollyWoodActionMovie("Kranti");
		 }
	     else
	    	 return null;
	}

	@Override
	public IBollyWoodMovie getBollyWoodMovie(String imovie) {
		 if ("Bang Bang".equalsIgnoreCase(imovie)) {
            return new BollyWoodActionMovie("Bang Bang");
        }
		 else 
			 return null;
		
	}

}
