package com.tenco.phonebook;

public class TencoPhoneBookMainTest {

	public static void main(String[] args) {
		
		PhoneBook[] phoneBook = new PhoneBook[10];
		
		phoneBook[0] = new PhoneBook("홍길동", "010-1234-5678");
		phoneBook[1] = new PhoneBook("김철수", "010-9788-0001");
		phoneBook[2] = new PhoneBook("박민수", "051-123-5678");
		phoneBook[3] = new PhoneBook("최민수", "010-2345-4897");
		phoneBook[4] = new PhoneBook("이준혁", "010-4547-9941");

	}

}
