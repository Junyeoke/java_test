package ex_01;
import java.util.Scanner;


public class DoWhileExample {

	public static void main(String[] args) {
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하시리면 q를 눌러주세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		

	}

}
