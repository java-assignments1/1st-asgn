package All.Programs.List;

public class Multiple_Call {
         int a, b, total1, total2, total3, total4;
         void Kaushik()
         {
         total1 = a + b;
         total2 = a - b;
         total3 = a * b;
         total4 = a/b;
}

	public static void main(String[] args) {
		Multiple_Call obj = new Multiple_Call();
		obj.a = 10;
		obj.b = 20;
	    obj.Kaushik();
	    System.out.println("Addition = "+ obj.total1);
	    System.out.println("Subtraction = "+ obj.total2);
	    System.out.println("Multiplication = " + obj.total3);
	    System.out.println("Division = " + obj.total4);
	    

		

	}

}
