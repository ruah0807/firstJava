package Ch09;

public class User {

	int userIdx;
	String userId;
	
	public User() {} 		// 기본 생성자, 매개생성자를 만들었다.
	
	public User(int userIdx, String userId) {		//매개 생성자
		this.userIdx = userIdx;
		this.userId = userId;
		
	}

	public int getUserIdx() {
		return userIdx;
	}

	public void setUserIdx(int userIdx) {
		this.userIdx = userIdx;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
}
