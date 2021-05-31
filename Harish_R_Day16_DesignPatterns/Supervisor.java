import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty{

	String name,department;
	List<Faculty> faculties=new ArrayList<Faculty>();
	
	Supervisor(){
		
	}
	
	Supervisor(String name,String department){
		this.department=department;
		this.name=name;
	}
	
	public void addFaculty(Faculty f) {
		faculties.add(f);
	}
	
	public void removeFaculty(Faculty f) {
		faculties.remove(f);
	}
	
	@Override
	public String getDetails() {
		
		for(Faculty faculty :faculties) {
			System.out.println(faculty.getDetails());
		}
		
		return name+" "+department;
	}
	
}
