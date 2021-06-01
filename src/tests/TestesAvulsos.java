package tests;

import java.util.Scanner;

public class TestesAvulsos {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String azul=in.nextLine();
		boolean roda=true;
		while(roda) {
			if(azul.equals("azul")) {
				azul="amarelo";
				System.out.println(azul);
				System.out.println("ainda estou rodando");
			}
			if(azul.equals("amarelo"))roda=false;
			else {
				System.out.println(azul);
				azul=in.nextLine();
			}
		}
	}
}
