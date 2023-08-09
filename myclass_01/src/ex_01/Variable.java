package ex_01;


// 자바 파일은 무조건 대문자로 시작
// 클래스 이름 첫 글자도 대문자로 시작
public class Variable {
	
	
	// 코드의 시작점
	public static void main(String[] args) {
		int age;
		int count;
		
		age = 100;
		count = 20;
		
		System.out.println(age);
		System.out.println(count);
		
		int myAge=100;
        int myCount=200;
        System.out.println("============================");
        System.out.println(myAge);
        System.out.println(myCount);
        System.out.println("안녕하세요");
        System.out.println("============================");
        
        int size = 250;
        int weight = 75;
       
        
        size = 300;
        weight = 99;
        
        size = 500;
        weight = 100;
        
        System.out.println("귀하의 사이즈는 " + size + " 입니다.");
        System.out.println("귀하의 무게는 " + weight + " 입니다.");
        System.out.println("당신의 신발 사이즈는 " + size + " 이며, 몸무게는 " + weight + " kg 입니다.");
        
        int a = 1;
        int b = 2;
        int c = 3;
        
        System.out.println(a + b + c);
        
	} // end of main
	
} // end of class
