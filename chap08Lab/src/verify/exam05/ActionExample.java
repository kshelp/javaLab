package verify.exam05;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ۼ� ��ġ
		// �͸�����ü: new �������̽���() { //�߻�޼ҵ� ���� };
		
		Action action = new Action() {
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("���縦 �մϴ�.");
			}
		};
				
		action.work();		

	}

}
