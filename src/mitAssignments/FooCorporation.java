package mitAssignments;

import java.util.Scanner;
public class FooCorporation {
 
public static void main(String[] args) {
	double basepay;
	 int workinghours;
	System.out.println("Enter the number of working hours");
	Scanner scan = new Scanner(System.in);
	workinghours = scan.nextInt();
	System.out.println("Enter the basepay");
	basepay = scan.nextDouble();
    totalpay(workinghours,basepay);
    scan.close();
}
static void totalpay(int x, double y){
	 double total=1.0;
	if(y<8.0 ||x>=60){
		System.out.println("Error");
		
		return ;
	}
	else if(y<=40){
		
		   total = y*x;
		 System.out.println(total);
		
	}
	else{
		
		total = 40*x+((y-40)*1.5*x);
	}
	System.out.println("Total pay is $"+total);
}


}
