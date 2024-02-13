package Ch06;

public class Member {
	
	int memberNo;
	String memberId;
	String memberName;
	
	
	public Member(int memberNo, String memberId, String memberName) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public String toString() {
		
		return memberNo + ". " + memberId +"( " + memberName + " )";
		
	}
	

}
