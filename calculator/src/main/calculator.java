package main;
import java.util.Scanner;


	
	
import model.arithmetic;

public class calculator {

	public static void main(String[] args) {
		
		calculator c1 = new calculator();
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int value2 = sc.nextInt();
		int result =c1.sum(value, value2);
		System.out.println("두수의 합은"+ result);
		
	}

	


	}


