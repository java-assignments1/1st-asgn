! commented
package All.Programs.List;

public class Arguments {

	public static void main(String args[]) {
	    int z;
	    int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
        z=a+b;
	  System.out.println(z);
	 
	  double addition  = a+b;
	  double subtraction  = a-b;
	  double multiplication  = a*b;
	  double division  = a/b;

	  switch(args[2])
	  {
	      case "+" :
	      {
	          System.out.print("Total after Addition is : "+addition);
	          break;
	      }
	      case "-" :
	      {
	          System.out.print("Total after Subtraction is : " +subtraction);
	          break;
	      }
	      case "*" :
	      {
	          System.out.print("Total after Multiplication is : "+multiplication);
	          break;
	      }
	      case "/" :
	      {
	          System.out.print("Total after Division is : "+division);
	          break;
	      }
	      default :
	      {
	          System.out.print("Please select proper operator");
	          return;
	      }
	  }
	
	}

}
