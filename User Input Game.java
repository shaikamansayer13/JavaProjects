import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    
    int mynum = (int)(Math.random()*100);
    int usernum=0;
    do
      {
         System.out.println("Please choose a number in range of 1 -100 :");
         usernum = sc.nextInt ();
	if (usernum == mynum)
	  {
	    System.out.println ("yup its correct :");
	    break;
	  }
	else if (usernum > mynum)
	  {
	    System.out.println ("number is too large :");
	  }
	else
	
	  {
	    System.out.println ("number is too small :");
	  }
      } while(usernum >= 0);
      System.out.println("my number was");
      System.out.println(mynum);
  }
}
