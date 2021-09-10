package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명구현객체: 인터페이스 변수 = new 인터페이스 { //추상메소드 재정의 };
		//  		
		RemoteControl rc;
		
		// 익명구현객체
		rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("전원 켭니다.");
			}			
		};
		
		
		// 람다식: 익명구현객체를 간략히 표현식
		// rc = () -> System.out.println("전원 켭니다.");
		

	}

}
