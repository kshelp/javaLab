package verify.exam04;

// DAO(Data Access Object): java class <-> db(Oracle DB, MySQL)
public interface DataAccessObject {
	// �������̽��� �������
	// ���
	
	// �߻� �޼ҵ�
	abstract void select();
	void insert();
	void update();
	void delete();
	
	// ����Ʈ �޼ҵ�
	// ���� �޼ҵ�

}
