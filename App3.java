import java.util.Scanner;
public class App3 {

	public static void main(String[] args) {
		//Code to display even digits from given number
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=sc.nextInt();
		System.out.print("The Even numbers are:");
		while(num!=0) 
		{
			int r = num%10;
			if (r%2==0) {
				System.out.print(r+",");
			}
			num=num/10;
			
			
		}

	}

}
