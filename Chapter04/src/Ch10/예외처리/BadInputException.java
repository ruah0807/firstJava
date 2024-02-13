package Ch10.예외처리;

public class BadInputException extends Exception {

	BadInputException () {
		super("사용자의 입력값이 올바르지 않습니다.");
	}
}
