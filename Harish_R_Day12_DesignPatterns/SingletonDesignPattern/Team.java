package designpattern;

public class Team {
	
	 private Team(){
		 
	 }
	    
	 private static class TeamHelper{
		 private static final Team INSTANCE = new Team();
	 }
	    
	 public static Team getTeamCaptain(){
		 return TeamHelper.INSTANCE;
	 }
}
