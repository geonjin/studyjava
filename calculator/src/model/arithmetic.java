package model;
import java.util.Scanner;

import view.Ui;

public class Arithmetic {
	
	  private int add(int a, int b)
	  { 
		  return a+b;
	  } 
	  private int substract(int a, int b)
	  {
		  return a - b; 
	  }
	  private int multiply(int a, int b)
	  { 
		  return a * b;
	  }
	  private double divide(int a, int b)
	  {  
		  return (double)a / (double)b;
	  }
	  
	  public void move (int num1,int num2, String operator, Ui ui) {
		// 변수랑 객체 넘겨올수 있음 매게 변수로써
		    double result;
		    
		  	switch(operator) 
		  	{
		  	case "+":
		  		result = add(num1, num2);
		  		ui.printResult(num2, num2, operator, result);
				break;
			
		  	case "-":
		  		result = substract(num1, num2);
		  		ui.printResult(num2, num2, operator, result);
				break;
				
		  	case "*":
		  		result = multiply(num1, num2);
		  		ui.printResult(num2, num2, operator, result);
				break;
			
		  	case "/":
		  		result = divide(num1, num2);
		  		ui.printResult(num2, num2, operator, result);
				break;
		  	}
		//
	  }
}


  