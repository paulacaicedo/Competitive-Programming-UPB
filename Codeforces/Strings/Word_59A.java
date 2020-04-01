import java.util.Scanner;

public class Word_59A {

	public static void main(String[] args) {
		String s="";
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		int cont1=0,cont=0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				cont1++;
			}
			else {
				cont++;
			}
		}
		
	 
		if(cont1==cont) {
			System.out.println(s.toLowerCase());
		}
		else if(cont1>cont) {
			System.out.println(s.toUpperCase());
		}
		else {
			System.out.println(s.toLowerCase());
		}
	}

	}


