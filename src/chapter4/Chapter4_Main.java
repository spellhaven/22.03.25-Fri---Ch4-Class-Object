package chapter4;

import java.util.Scanner;

public class Chapter4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book book1 = new Book("ȫ�浿��", "���");
		
		Book book_array[] = new Book[5];
		// �츮�� book.java�� ����� �� Ŭ������ Book�� ���ϴ� ��ü(�ν��Ͻ�)�� ����� ���� ��
		// ��� ����� ������, int a[] = new int[5]; �̷��� ����� �Ŷ� ���� ����̷�. �츮�� Ŭ������ ���� �ͻ�����.
		
		Scanner scann = new Scanner(System.in);
		
		for(int i=0; i<book_array.length; i++) {
			System.out.print("å ������ �Է��ϼ���: ");
			String title = scann.nextLine();
			System.out.print("å ���ڸ� �Է��ϼ���: ");
			String author = scann.nextLine();
			
			book_array[i] = new Book(title, author);
		}
		
		
		// �׳� ����� �ƴ��� 3���� ���÷� �� ����� �ô� ��
		// ����� "3��"�� 4��° å�̾�. ��������? �迭 �ε����� 0���� �����ϱ� ������... �����ʾ���? �׷���?
		String author3 = book_array[3].author;
		String title3 = book_array[3].title;
		
		System.out.println(author3);
		System.out.println(title3);		
		
		scann.close();
	}
}
