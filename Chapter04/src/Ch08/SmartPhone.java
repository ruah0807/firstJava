package Ch08;

public class SmartPhone implements Phone {

	boolean power;
	
	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);

		System.out.println(number1 + number2 + number3 +"에 전화합니다.");
	}

	@Override
	public void turnOn() {		//power값이 1이면 실행 안됨(부정이기 때문)
		if(!power) {
			power = true;
		}

	}

	@Override
	public void turnOff() {
		if (power) {					// 1이면 동작한다.
			power = false;
		}

	}

}
