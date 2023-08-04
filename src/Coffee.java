

import java.util.Scanner;
//getting input from a user using scanner

public class Coffee {
   public static void main(String arg[]) {
	   System.out.println("Enter the Adjacent:");
	   Scanner scanner= new Scanner(System.in);
	   String word= scanner.nextLine();
	   
	   System.out.println("Enter the Season of the year:");
	 /*
	  * 
	  */
	    String season=scanner.nextLine();
	  
	   
	   System.out.println("Enter the number of coffee:");
	   int no=scanner.nextInt();
	   scanner.close();
	   
	   System.out.println("On a "+ word +" "+ season +" day,I drink a minimum of "+ no +"cups of coffee.");
   }
}
