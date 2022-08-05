package view;


import model.Arithmetic;
import controller.Userinput;


public class Ui {
  public void startProgram() {
	
		System.out.println("계산기를 시작합니다");
		System.out.println("           ===              ");
		System.out.println("         ========           ");
		System.out.println("       ============         ");
		System.out.println("    ==================      ");
		System.out.println("  =======================   ");
		System.out.println("============================");
		System.out.println("이계산기는 기본적인 사칙연산이 가능합니다");
		System.out.println("============================");
		System.out.println("  =======================   ");
		System.out.println("    ==================      ");
		System.out.println("       =============        ");
		System.out.println("         =========          ");
		System.out.println("           =====            ");
	}
	
  public void firstnum()
	{
		System.out.println("- - - - - - - - -");
		System.out.println("첫번째 연산할 숫자를 입력하세요");
	}

	public void secondnum()
	{

		System.out.println("- - - - - - - - -");
		System.out.println(" 두번째 연산할 숫자를 입력하세요");
	}
	
	public void putoperate()
	{
		System.out.println("- - - - - - - - -");
		System.out.println(" 연산자를 입력해 주세요");
		System.out.println("- - - - - - - - -");
	}
	
	public void printResult(int num1, int num2, String operator, double result) {
		System.out.printf("%d %s %d = %f 입니다\n", num1, operator, num2, result);
		System.out.println("- - - - - - - - -");
	}
}
	
	

