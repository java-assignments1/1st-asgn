package All.Programs.List;

public class Loops3 {

	public static void main(String[] args) {
	int i = 0, j= 2, k = 0;
	int array[] = {2,3,4,5,6,7,8,9,22,33,44,55};
	System.out.println(array.length);
	while (i < 12)
	{
		System.out.println("array value ....\n"+array[i]);
		i++;
		
	}
	System.out.println("The Loop is going to Finish");
	
  for ( j = 2; j < 20; j++) 
{
 System.out.println(j);
 
}
  do {
	  System.out.println("Value of k: "+array[k]);
	  k++;
  }
  while (k<10);

	 System.out.println("Loop is done");
	}
}