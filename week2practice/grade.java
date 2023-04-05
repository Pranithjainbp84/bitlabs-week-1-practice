import java.util.Scanner;
 
class grade {
 
  public static void main(String args[]) {
 
   Scanner s = new Scanner(System.in);
 
   int projectscore ,internalscore,externalscore ,total = 0;
    System.out.println("Enter projectscore ,internalscore ,externalscore values");
    projectscore = s.nextInt();
    internalscore = s.nextInt();
    externalscore = s.nextInt();
    if (projectscore >= 50 && externalscore >=50 && internalscore >= 50)  
    {
      total= (70* projectscore)/100 + (20*externalscore)/100 + (10*internalscore)/100;
      
                  if(total>=90)
    {
      System.out.println( "A grade");
    } 
    else if (total >= 70){
      System.out.println("B grade");
    }
    else {
      System.out.println("c grade");
    }
 }
     else {
      if(projectscore<50){
        System.out.println(projectscore +"failed in project");
      }
      if(externalscore<50){
        System.out.println(externalscore +"failed in external");
     }
      if(externalscore<50){
        System.out.println(internalscore +"failed in internal");
      }
      
   }
 }
}
