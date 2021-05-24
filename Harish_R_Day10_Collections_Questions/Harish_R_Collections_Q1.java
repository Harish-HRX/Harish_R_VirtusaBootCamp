import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Harish_R_Collections_Q1 {
	
	public boolean palindrome(int n){
		 int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
			  return true;
		  else    
		  return false;
	}
	
	public void rangePalindrome() {	
		Harish_R_Collections_Q1 m=new Harish_R_Collections_Q1();	
		List l=new ArrayList();
		int sum=0;
		Scanner in=new Scanner(System.in);
		int first=in.nextInt();
		int last=in.nextInt();
		for(int i=first;i<=last;i++) {
			if(m.palindrome(i)) {
				l.add(i);
				sum+=i;
			}
		}
		System.out.println(l);
		System.out.println("Sum="+sum);
	}
}
