package ch08;

public class StudentNumberMainTest {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", "기계공학과");
		Student student2 = new Student("김철수", "건축공학과");
		Student student3 = new Student("이준혁", "생명공학과");
		Student student4 = new Student("김민수", "전기공학과");
		student1.newIdNumber();
		student2.newIdNumber();
		student3.newIdNumber();
		student4.newIdNumber();
		
		

	} // end of main

} // end of class
