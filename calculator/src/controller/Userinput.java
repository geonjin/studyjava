package controller;
import java.util.Scanner;
import model.Arithmetic;


class output{
	
}
public class Userinput {
	public void userinput() {
		String[] a = {"+","-","*","/"};
	Scanner sc = new Scanner(System.in);
	Arithmetic oper =  new Arithmetic();{
	for(int i = 0; i<10; i++) { 
		System.out.println("- - - - - - - - -");
	System.out.println("첫번째 연산할 숫자를 입력하세요");
	int num1 = sc.nextInt();
	System.out.println("- - - - - - - - -");
	System.out.println(" 두번째 연산할 숫자를 입력하세요");
	int num2 = sc.nextInt();
	System.out.println("- - - - - - - - -");
	System.out.println(" 연산자를 입력해 주세요");
	System.out.println("- - - - - - - - -");
	String operator = sc.next();
	
	
	
	//if ((operator.equals("+")) || (operator.equals("-")) || (operator.equals("*")) || (operator.equals("/"))) 
		
	
		if(operator.equals("+")) {
			int result =oper.add(num1, num2);
			System.out.printf("%d %s %d = %d 입니다\n",num1,operator,num2,result);
			System.out.println("- - - - - - - - -");
		}else if(operator.equals("-")){
			int result =oper.substract(num1, num2);
			System.out.printf("%d %s %d = %d 입니다\n",num1,operator,num2,result);
			System.out.println("- - - - - - - - -");
		}else if(operator.equals("*")) {
			int result = oper.multiply(num1, num2);
			System.out.printf("%d %s %d = %d 입니다\n",num1,operator,num2,result);
			System.out.println("- - - - - - - - -");	
		}else if(operator.equals("/")){
			double result = oper.divide(num1, num2);
			System.out.printf("%d %s %d = %f 입니다\n",num1,operator,num2,result);
			System.out.println("- - - - - - - - -");
			
			
			
			}
		}
	
	
	// 위에 if문을 switch 문으로 바꾸고 default: 연산자가 아닌거 나왔을때 예외처리 하기
	}
	
	}
}

