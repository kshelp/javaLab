package verify.exam03;

public class SoundableExample {
	// 클랫의 구성맴버
	// 필드
	// 생성자
	
	// 메소드
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	
	public static void main(String[] args) {
		printSound(new Cat()); 
		// Soundable soundable = new Cat(); 
		// 인터페이스 변수 = 구현객체;, 자동형변환 
		printSound(new Dog());
	}

}
