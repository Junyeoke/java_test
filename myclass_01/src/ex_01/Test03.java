package ex_01;

public class Test03 {

	public static void main(String[] args) {

		int kor = 80;
		int eng = 96;
		int math = 99;

		double avg = (kor + eng + math) / 3.0;

		System.out.println("평균점수(실수형) : " + avg);
		System.out.println("평균점수(정수형) : " + (int) avg);

	}

}
