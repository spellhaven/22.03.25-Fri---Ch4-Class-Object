package chapter4;

import java.util.Scanner;

public class Chapter4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book book1 = new Book("홍길동전", "허균");
		
		Book book_array[] = new Book[5];
		// 우리가 book.java로 만들어 준 클래스인 Book에 속하는 객체(인스턴스)를 만들어 보자 ㅋ
		// 사실 어려워 보여도, int a[] = new int[5]; 이렇게 만드는 거랑 같은 방식이래. 우리가 클래스를 만든 것뿐이지.
		
		Scanner scann = new Scanner(System.in);
		
		for(int i=0; i<book_array.length; i++) {
			System.out.print("책 제목을 입력하세요: ");
			String title = scann.nextLine();
			System.out.print("책 저자를 입력하세요: ");
			String author = scann.nextLine();
			
			book_array[i] = new Book(title, author);
		}
		
		
		// 그냥 제대로 됐는지 3권을 샘플로 함 출력해 봤다 ㅋ
		// 참고로 "3권"은 4번째 책이야. 왠지알지? 배열 인덱스는 0부터 시작하기 때문에... 잊지않았지? 그렇지?
		String author3 = book_array[3].author;
		String title3 = book_array[3].title;
		
		System.out.println(author3);
		System.out.println(title3);		
		
		scann.close();
	}
}
