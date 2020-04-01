import java.util.Scanner;

public class DivisibilityProblem1328_A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 
		int t=sc.nextInt();
 
	 
		for (int i = 1; i <= t; i++) {
			  int a=sc.nextInt();
			  int b=sc.nextInt();
			  
			  
			  if(a%b==0) {
				  System.out.println(0);
			  }
			  else if (b>a) {
				  System.out.println(b-a);
			  }
			  else if(a%b!=0) {
				  int c=a%b;
				  System.out.println(b-c);
			  }
			 
	 
			
		}


	}

}
