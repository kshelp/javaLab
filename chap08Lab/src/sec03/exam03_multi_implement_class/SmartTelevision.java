package sec03.exam03_multi_implement_class;

// 다중 인터페이스 구현 클래스
public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}
	

}
