import java.util.Scanner;

public class Cap {

	public static void main(String[] args) {
			Scanner S = new Scanner(System.in);
			String str = S.nextLine();
			String First=str.substring(0,1);
			String Rem=str.substring(1,str.length());
		
			First=First.toUpperCase();
			str=First+Rem;
			System.out.println("Name--->"+str);

	}

}