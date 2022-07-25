package view;
import java.util.Scanner;
import model.Arithmetic;

public class Ui {
  public void startProgram() {
	  
		System.out.println("계산기를 시작합니다");
		System.out.println("======================");
		System.out.println("이계산기는 기본적인 사칙연산이 가능합니다");
		System.out.println("======================");
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		Arithmetic oper =  new Arithmetic();
		
		System.out.println("첫번째 연산할 숫자를 입력하세요");
		int value1 = sc.nextInt();
		System.out.println(" 두번째 연산할 숫자를 입력하세요");
		int value2 = sc.nextInt();
		System.out.println(" 연산자를 입력해 주세요");
		
	}
	
	
}
