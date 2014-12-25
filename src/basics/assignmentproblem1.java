package basics;
import java.util.Scanner;
public class assignmentproblem1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count = 0;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter  two Strings");
	     String a = scan.nextLine();
         String b = scan.nextLine();		
		for(int i=0,j=0;(i<=a.length()-2&&j<=b.length()-2);i++,j++)
		{
			String str1 = a.substring(i,i+2);
			String str2 = b.substring(i,i+2);
			System.out.println(str1);
			System.out.println(str2);
			if((str1.equals(str2))==true)
			count++;
		}
		System.out.println("if a = "+a+" and  b = "+b+" The answer is "+count);
		scan.close();
	}
}
