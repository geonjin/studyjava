package controller;
import java.util.Scanner;
import model.Arithmetic;


class Qmsg{
	public void qmsg() {
		
	System.out.println("계산을 계속하시려면 1번, 계산기를 종료하시고 싶으시면 2번을 눌러 주세요");
	
	 
	 }
	}



public class Userinput {
	public void userinput() {
	Scanner sc = new Scanner(System.in);
	Arithmetic oper =  new Arithmetic();{
		Qmsg msg = new Qmsg();
		int choice = 0;
	for(int i = 0; i<100; i++) { 

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
		msg.qmsg();
		choice = sc.nextInt();
			if(choice == 1)
			continue;
			
		    else if (choice == 2) {
		
			System.out.println("계산기를 종료합니다");
			break;
		    }
			else if(choice != 1 && choice != 2 ) {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
				msg.qmsg();
			}
	// 위에 if문을 switch 문으로 바꾸고 default: 연산자가 아닌거 나왔을때 예외처리 하기
			}
		}
	}
}

