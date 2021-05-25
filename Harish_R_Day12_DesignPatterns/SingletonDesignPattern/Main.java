package designpattern;

public class Main {
	
	public static void main(String []args) {
		
		System.out.println("Trying to make a capain for our Team");
	    Team captain1=Team.getTeamCaptain();
		
	    System.out.println("Capain for our Team is selected "+captain1);
		System.out.println("Trying to make another capain for our Team");
		Team captain2=Team.getTeamCaptain();
		
		if(captain1!=null)
			System.out.println("You already have a capain for your team "
					+captain1+", Send him for the toss");
		
		if(captain1==captain2)
			System.out.println("captain1 and captain2 are the same"
					+ " instance "+captain1+" "+captain2);
	}
	
}
