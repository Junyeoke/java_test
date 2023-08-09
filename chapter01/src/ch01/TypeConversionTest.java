package ch01;

public class TypeConversionTest {

	public static void main(String[] args) {

		// 형 변환에 관련한 문제 직접 만들기
		// 1. int 값을 double 값으로 형변환 하시오.
		int aNumber1 = 100;
		double dNumber1;

		dNumber1 = aNumber1;

		System.out.println(dNumber1);

		// 2. double 값을 int 로 형변환하시오.
		double dNumber2 = 3.141592;
		int iNumber2 = (int) dNumber2;
		System.out.println(iNumber2);

		// 3. byte 값을 double 값으로 형변환 하시오.
		byte bNumber = 1;
		double dNumber3;
		dNumber3 = bNumber;
		System.out.println(dNumber3);

		// 4. double 값을 byte 값으로 형변환 한 값은?
		double dNumber4 = 100.56789;
		byte bNumber2 = (byte) dNumber4;
		System.out.println(bNumber2);

		// 5. char 값을 long 값으로 형 변환 한 값은?
		char name;
		name = 'A';
		double dNumber7 = name;
		System.out.println(dNumber7);
		
		// 6. long 값을 double 값으로 형변환 하면?
		long value1 = 5000000000L;
		double dvalue1 = value1;
		System.out.println(dvalue1);
		
		double dvalue2 = 5.0E9;
		long value2 = (long) dvalue2;
		System.out.println(value2);
		
		// 7.
		int a = 10;
		long b = 50000000000L;
		double c = 3.141592;
				
		// long -> int
		int a1 = (int) b;
		System.out.println(a1);
		// double -> int
		int a2 = (int) c;
		System.out.println(a2);
	
		

	} // end of main

} // end of class
