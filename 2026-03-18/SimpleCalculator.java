import java.util.Scanner;

public class SimpleCalculator{
	public static void main(String args[]){
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter the first number ; ");
		num1=sc.nextDouble();
		System.out.print("Enter the second number : ");
		num2=sc.nextDouble();
		
		System.out.println("Choose Operation : ");
		System.out.println("1.Addition(+)");
		System.out.println("2.Subtracion(-)");
		System.out.println("3.Multiplication(*)");
		System.out.println("4.Division(/)");
		int operator=sc.nextInt();
		
		double result;
        switch (operator) {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator.");
                return;
        }
		System.out.println("The final result is :" );
		System.out.println("Result");
		
		
		
		
		
	}
}
	

		
		

		
		
		