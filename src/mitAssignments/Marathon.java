package mitAssignments;

public class Marathon {
         static int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String [] names={"Elena","Thomas","Hamilton","Suzie","Phil","Matt","Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
          int [] times = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
       
          for(int i=0;i<names.length;i++)
          {
        		  System.out.println(names[i]+"      :  "+times[i]);
          }     
	      index = firstBestRunner(times);
	      System.out.print("The first Best Runner is :-");
	   System.out.print(names[index]+" : "+times[index]);
	  	   System.out.println();
	  	 secondBestRunner(names,times);
	   
	}   
	static int firstBestRunner(int [] values)
	{
		int min=values[0];
		
		int pos=0;
		for(int i=1;i<values.length;i++){
			if(min>values[i])
			{
				min = values[i];
				pos = i;
			}
			
		}
		return pos;
	}
	static void secondBestRunner(String [] names, int [] values){
		int [] values1=new int[values.length-1];
		String [] names1=new String[values.length-1];
		System.out.println(values[index]);
		int j=0;
		for(int i=0;i<values.length;i++)
		{
			if(values[i]!=values[index]){
				values1[j]=values[i];
				names1[j]=names[i];
				j++;
			}		
		}
		System.out.println();
		 for(int i=0;i<values1.length;i++)
         {
       		  System.out.println(values1[i]);
         }  
		index = firstBestRunner(values1);
		  System.out.print("The second Best Runner is :-");
		   System.out.print(names1[index]+" : "+values1[index]);
	}
}

