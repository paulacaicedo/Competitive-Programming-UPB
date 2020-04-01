import java.util.Scanner;
import java.util.Vector;

public class Pangram_520A {

	public static void main(String[] args) {
		String s="";
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		s=sc.next().toLowerCase();
	 
		Vector st =new Vector();
		for (int i = 0; i < s.length(); i++) {
			if(!st.contains(s.charAt(i))) {
				st.add(s.charAt(i));
			}
			
		}
		if(st.size()==26) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		

	}

}
