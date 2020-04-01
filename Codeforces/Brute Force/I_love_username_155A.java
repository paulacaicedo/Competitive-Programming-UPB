import java.util.Scanner;
public class I_love_username_155A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
	  int code=sc.nextInt();
	  int more=code;
	  int less=code;
		int cont=0;
	 
		for (int i = 1; i <n; i++) {
	 
	 int code1=sc.nextInt();
	 if(code1>more) {
	 more=code1;
	 cont++;
	 } 
	else if(code1<less) {
	less=code1;
	cont++;
	} 
	 
	 
			} 
	 
	System. out. println(cont) ;
			
	} 

}
