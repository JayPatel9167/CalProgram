/**
 * 
 */
package Calculator;

import java.util.Scanner;

/**
 * @author Jay Patel
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double number1,number2; int n;
		char sign; boolean t= false;
		
		Scanner s1 = new Scanner(System.in);
		do {
			System.out.println("Enter your First Number");
			number1 = s1.nextDouble();
			System.out.println("Enter your Second Number");
			number2 = s1.nextDouble();
			CalOperation c1 = new CalOperation(number1,number2);
			System.out.println("Select which operation you want execute:+,-,*,/");
			sign = s1.next().charAt(0);
			switch(sign){
				case '+' : System.out.println(c1.addNum());
				break;
				case '-' : System.out.println(c1.subNum());
				break;
				case '*' : System.out.println(c1.multiNum());
				break;
				case '/' : System.out.println(c1.divNum()); 
					/*try{
						System.out.println(c1.divNum());
				}catch(ArithmeticException e) {
					System.out.print(e);
				}*/
				break;
				default: System.out.println("PLZ Enter correct operator From Options");
				continue;
				
			}
			System.out.println("if you want to exit press 1 or press any other number");
			n = s1.nextInt();
			if(n==1) {
				t=true;
			}
		}while(!t);
		

	}

}
