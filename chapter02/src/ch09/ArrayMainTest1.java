package ch09;

public class ArrayMainTest1 {

	public static void main(String[] args) {
		
		// 배열이란?
		//  연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다. **
		
		// 1. 선언과 초기화
		int [] arr1;  // 변수의 선언 (int가 아니라 int 배열이다.)
		arr1 = new int[2]; // 배열의 초기화는 반드시 크기를 먼저 지정해주어야 사용가능하다.
		// 배열의 크기도 생각을 해보자
		double[] arr2 = new double[2];  // 선언과 동시에 초기화
		
		// 값을 넣는 방법
		arr1[0] = 100;
		arr1[1] = 1000;
		// 모든 인덱스의 순서는 0번부터 시작한다.
		
		System.out.println(arr1[1]); // 두번째 값 출력
		System.out.println(arr1[0]); // 첫번째 값 출력

		// 주의 : 배열의 길이와(크기) 인덱스의 번호는 다르다.
		// 공식 : 배열의 인덱스 번호는 n-1
		// 오류코드 : System.out.println(arr1[2]);  // 배열의 길이는 2이나 인덱스는 0, 1 까지만 존재하기 때문에 2는 존재하지 않는다.
		
		arr2[0] = 10.0;
		arr2[1] = 20.0;
		arr2[0] = 0.0;
		System.out.println(arr2[1]);
		System.out.println(arr2[0]);
		
		
	} // end of main

} // end of class
