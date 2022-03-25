package chapter4;


// Chapter4_Main에서 쓸 수 있게 Book이라는 클래스를 만들었습니다.
// 어. 메인 함수는 하나만 존재해야 하고, main()이 필요로 하는 것들은 따로따로 존재하며 main()은 걔들을 호출해서 쓰고 버리는 것 뿐이야.
// 그렇기 때문에 이 문서에 public static void main(String[] args) { }가 없는 거야. 왕은 오직 하나뿐이다. Book, 얘는 그저 그분에 칼일 뿐 . . . 
// (사실 문서 만들 때도 "make new Class"였지? 사실 이 '문서' 자체가 그냥 '클래스'다.)

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;	// ha ha 늦게 와서 this가 뭔지 못들음 ㅋ p.193 참조 ㅋ
		this.author = author;
	}
	
}

//"네가 나를 위해 생을 바쳐 봉사한 후, 소임이 끝나는 순간 스러지는 것에 안타까워하지 마라. 
// 그것이 '객체 지향 프로그래밍'이니까." 
