import java.util.Scanner;
public class Subject
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter student year ");
int year=sc.nextInt();
System.out.println("Enter student branch ");
char ch=sc.next().charAt(0);
switch(year){
			case 1 :
							System.out.println("1 st year");
switch(ch){
									case 'c':
											System.out.println("Subjects Math phyiscs computer");
											//break;
									case 'm':
											System.out.println("Subjects Math phyiscs mechanical");
										 //break;
									case 'e':
											System.out.println("Subjects Math phyiscs elctonics");
											break;
							}
							break;
					case 2 :
							System.out.println("2nd year");
							switch(ch){
									case 'c':
											System.out.println("Subjects java mysql computer");
											break;
									case 'm':
											System.out.println("Subjects thermodynmic automobile mechanical");
											break;
									case 'e':
											System.out.println("Subjects network devices elctonics");
											break;
							}
							break;
					default : 
							 System.out.println("Invalid input");
							 break;
			}
	}
}