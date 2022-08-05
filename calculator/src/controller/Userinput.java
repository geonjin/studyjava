package controller;

import java.util.Scanner;
import model.Arithmetic;
import utils.Constants;
import view.Ui;
public class Userinput {
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		Arithmetic oper = new Arithmetic();
		Ui ui = new Ui();
		{
			boolean isRepeat = true;

			while (isRepeat) {
				
				ui.firstnum( );
				int num1 = sc.nextInt();
				// 매게 변수로 넘긴다. 객체를 넘기든 할수 있어야함
				ui.secondnum();
				int num2 = sc.nextInt();
				
				ui.putoperate();
				String operator = sc.next();
				
				oper.move(num1, num2, operator, ui );
				isRepeat = isReCalculation();
			}
		}
	}
	// 회원가입 예외 처리 , DB 구현 , 회원가입시 로그인 정보를 DB로 옮기기(MY SQL사용을 해야함)
	// 영어 숫자 몇글자 이상 입력해주세요 이정도 ( ID정규식 해보기?, 정규식 쓰임 파악)
	private boolean isReCalculation() {
		boolean isReCalculate = true;
		boolean isChoiceCheck = false;

		while (!isChoiceCheck) {
			Scanner sc = new Scanner(System.in);
			int choice;
			System.out.println("계산을 게속 하시려면 1번, 계산기를 종료하고 싶으시면 2번을 눌러주세요");
			choice = sc.nextInt();

			switch (choice) {
			case Constants.CALCULATOR_REPEAT:
				System.out.println("계산기를 게속합니다");
				isReCalculate = true;
				isChoiceCheck = true;
				break;
			case Constants.CALCULATOR_STOP:
				System.out.println("계산기를 종료합니다");
				isReCalculate = false;
				isChoiceCheck = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요.");
				isChoiceCheck = false;
				break;
			}
		}
		return isReCalculate;
	}
}
