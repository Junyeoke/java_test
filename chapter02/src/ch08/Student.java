package ch08;

public class Student {

	private String name;
	private static int studentNumber  = 1;
	private String gradeName;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, String gradename) {
		this(name);
		this.gradeName = gradename;
	}
	
	public void newIdNumber() {
		System.out.println(name + " 학생 " +"("+ gradeName +")" +"의 신규학번은 " + "2023 - "+ studentNumber);
		studentNumber++;
	} 
} // end of class
