package ex_01;

public class Test11 {

	public static void main(String[] args) {
		// 중첩 if문
		int score = (int)(Math.random()*20) + 81 ; // 
		System.out.println("점수: " + score);
		String grade;
		
		if(score >= 90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : " + grade);
		System.out.println("=============================================");
		int score1 = (int)(Math.random()*20)+81;
		System.out.println("점수 : " + score1);
		String grade1;
		
		if(score1>=90) {
			if(score1>=95) {
				grade1 = "A+";
			} else {
				grade1 = "A";
			}
		} else {
			if(score1>=85) {
				grade1 = "B+";
			} else {
				grade1 = "B";
			}
		}
		System.out.println("학점 : " + grade1);
	}

}
