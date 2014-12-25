package basics;

import java.util.Scanner;

public class assignmentproblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter first character array");
	        char[] a =scan.next().toCharArray();
	          System.out.println("enter second character array");
	        char[] b =scan.next().toCharArray();
	        int n = a.length+b.length;
	        char[] c = new char[n];
	        c[0] = a[0];
	        int count = 0;
	        
	        for(int i=1;i<=a.length-1;i++)
	         {int flag =0;
	        	for(int j =0;j<=count;j++)
	        	{
	        		if(a[i]==c[j])
	        		{
	        			flag = 1;
	        			break;
	        		}
	        	}
	        	if(flag!=1)
	        	{
	        		count++;
	        		c[count]=a[i];
	        		
	        	}
	        }
	        for(int i=1;i<=b.length-1;i++)
	         {int flag =0;
	        	for(int j =0;j<=count;j++)
	        	{
	        		if(b[i]==c[j])
	        		{
	        			flag = 1;
	        			break;
	        		}
	        	}
	        	if(flag!=1)
	        	{
	        		count++;
	        		c[count]=b[i];
	        		
	        	}
	        }
	        for(int p=0;p<=count;p++)
	        	System.out.print(c[p]);
	        scan.close();
	}

}
