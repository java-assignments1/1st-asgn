package All.Programs.List;

import java.util.Scanner;

public class Main {


			public static void main(String[] args) {

					int a = 0, b =0, total, choice;
					Scanner scan = new Scanner(System.in);
					System.out.println("For Add two No....1");
					choice  = scan.nextInt();

					if(choice) > 1
				    {
				    	System.out.println("Invalid Selection");		    	
				    }
				    else
				    {
				    System.out.println("Enter First Number.......");
				   	System.out.println("Enter second Number.......");
					a = scan.nextInt();
					b = scan.nextInt();
				    }
				    switch (choice) 
				    {
				    case  1:
			    	Math obj = new Math();
			    	int total = obj.total(a, b);
			    	System.out.println();
			    	System.out.println(a+ "+" + b"  = "+);
			    	break;
				 	}	

		}
		
	}


