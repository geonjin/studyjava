package main;
import java.util.Scanner;

import model.Arithmetic;
import view.ui;
import controller.Userinput;
	// user input , 계산 로직 , main,  ui


public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		 Arithmetic ar = new  Arithmetic();
		  ui userui = new ui();
		 Userinput input = new Userinput();
		 
		 userui.startProgram();
		 input.userinput();
		 
		
	
		
	}

	


	}


