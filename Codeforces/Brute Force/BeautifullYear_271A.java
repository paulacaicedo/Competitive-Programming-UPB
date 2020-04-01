import java.util.Scanner;
import java.util.TreeSet;
public class BeautifullYear_271A {

 public static void main(String[] args) {
	 
	 
			
			Scanner x = new Scanner(System.in);
			
			int m= x.nextInt();
		 
	 
			TreeSet<Character> st=new TreeSet<>();
	 
			String line="";
			do {
				m++;
				line=String.valueOf(m);
				st.clear();
				for (int i = 0; i < line.length(); i++) {
					st.add(line.charAt(i));
				}
				
			}while(st.size()!=line.length()); 
			
			System.out.println(m);
		}

	}


