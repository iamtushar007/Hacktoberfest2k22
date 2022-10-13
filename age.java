
import java.util.*;
class age
{
   
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
      try
	  {
		System.out.println("enter the age");
		int a=sc.nextInt();
		if(a<18)
		{
			throw new ageException("the age should be greater than or equal to 18");
		}
		else
		{
			System.out.println("valid age");
		}
	  }
	catch(ageException exp)
	{
		System.out.println(exp) ;
	}
  }
}
