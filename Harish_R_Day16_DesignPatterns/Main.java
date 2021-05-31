
public class Main {

	public static void main(String[] args) {
		
		Professor professor1=new Professor("Professor1","Math","Adjunct");
		Professor professor2=new Professor("Professor2","Math","Associate");
		Professor professor3=new Professor("Professor1","CSE","Adjunct");
		Professor professor4=new Professor("Professor2","CSE","Professor");
		Professor professor5=new Professor("Professor3","CSE","Professor");
		
		Supervisor Dean=new Supervisor("Dr.S.Som","is the Dean of Technology");
		Supervisor chair1=new Supervisor("Mrs.S.Das","is the Chair of Math Department");
		Supervisor chair2=new Supervisor("Mr.V.Sarcar","is the Chair of Computer Science Department");
		
		Dean.addFaculty(chair1);
		Dean.addFaculty(chair2);
		
		chair1.addFaculty(professor1);
		chair1.addFaculty(professor2);
		chair2.addFaculty(professor3);
		chair2.addFaculty(professor4);
		chair2.addFaculty(professor5);
		
		System.out.println(Dean.getDetails());
		System.out.println("");
		
		chair2.removeFaculty(professor4);
		chair2.getDetails();
	}

}
