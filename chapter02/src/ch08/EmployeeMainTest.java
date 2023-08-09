package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {

		// static 은 먼저 메모리에 올라가는 녀석이다.
		// 클래스 이름으로 접근할 수 있다.
//		int number = Employee.serialNum;
//		System.out.println(number);
		
		// 만약 객체가 생성되기 전에 serialNum 값을 알고 싶다면?
		
		System.out.println(Employee.getSerialNum());
		
		
		Employee employeeKim = new Employee("김길동");
		Employee employeeLee = new Employee("이순신");
		Employee employee티모 = new Employee("티모");
		
		System.out.println(employeeKim.getEmployeeId());
		System.out.println(employeeLee.getEmployeeId());
		System.out.println(employee티모.getEmployeeId());

		// 외부에서 static 변수에 접근해서 값을 변경할 수 있는 상태이다.
		// Employee.serialNum = 100;
		
		
		
	} // end of main

} // end of class
