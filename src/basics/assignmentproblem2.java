package basics;
import java.util.Scanner;

public class assignmentproblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter exam key for four questions");
	        char[] examkey=scan.next().toCharArray();
	          System.out.println("enter Answer key for four questions");
	        char[] answers=scan.next().toCharArray();
	        System.out.println("Exam Key is : ");
	        for (int i=0;i<examkey.length;i++)
	            System.out.print(examkey[i]);
	        System.out.println();
	        System.out.println("Answers are : ");
	        for (int i=0;i<answers.length;i++)
	            System.out.print(answers[i]);
	        int marks =0;
	        for(int i = 0;i<=3;i++)
	        {
	        	if(examkey[i]==answers[i])
	        	marks+=4;
	        		else if(answers[i]=='?')
	        		marks+=0;
	        		else
	        	  marks+=-1;
	        }
	        System.out.println();
	        System.out.println("Scored Marks are:-");
	        System.out.println(marks);
	scan.close();
	}
}
