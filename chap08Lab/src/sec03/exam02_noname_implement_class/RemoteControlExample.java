package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �͸�����ü: �������̽� ���� = new �������̽� { //�߻�޼ҵ� ������ };
		//  		
		RemoteControl rc;
		
		// �͸�����ü
		rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("���� �մϴ�.");
			}			
		};
		
		
		// ���ٽ�: �͸�����ü�� ������ ǥ����
		// rc = () -> System.out.println("���� �մϴ�.");
		

	}

}
