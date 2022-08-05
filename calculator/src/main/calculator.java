package main;
import java.util.Scanner;

import model.Arithmetic;
import view.Ui;
import controller.Userinput;

public class Calculator {

	public static void main(String[] args) {
		  Ui userui = new Ui(); 
		 Userinput input = new Userinput();
		 
		 userui.startProgram();
		 input.userinput();
	}
	}


