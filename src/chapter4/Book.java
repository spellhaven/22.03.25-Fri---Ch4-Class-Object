package chapter4;


// Chapter4_Main���� �� �� �ְ� Book�̶�� Ŭ������ ��������ϴ�.
// ��. ���� �Լ��� �ϳ��� �����ؾ� �ϰ�, main()�� �ʿ�� �ϴ� �͵��� ���ε��� �����ϸ� main()�� �µ��� ȣ���ؼ� ���� ������ �� ���̾�.
// �׷��� ������ �� ������ public static void main(String[] args) { }�� ���� �ž�. ���� ���� �ϳ����̴�. Book, ��� ���� �׺п� Į�� �� . . . 
// (��� ���� ���� ���� "make new Class"����? ��� �� '����' ��ü�� �׳� 'Ŭ����'��.)

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;	// ha ha �ʰ� �ͼ� this�� ���� ������ �� p.193 ���� ��
		this.author = author;
	}
	
}

//"�װ� ���� ���� ���� ���� ������ ��, ������ ������ ���� �������� �Ϳ� ��Ÿ������� ����. 
// �װ��� '��ü ���� ���α׷���'�̴ϱ�." 
