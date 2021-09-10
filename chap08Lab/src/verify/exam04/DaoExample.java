package verify.exam04;

public class DaoExample {
	// 클래스의 구성멤버
	// 필드
	// 생성자
	
	// 메소드
	public static void dbWork(DataAccessObject dao) {
	//public static void dbWork(OracleDao dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// DataAccessObject dao = new OracleDao();, 자동형 변환
		dbWork(new OracleDao());  // 구현객체
		dbWork(new MySqlDao());
	}

}
