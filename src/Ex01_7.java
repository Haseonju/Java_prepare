public class Ex01_7 {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");	//다른타입 + 문자타입은 문자타입으로 출력된다
		System.out.println(" " + 7);	//space bar의 공백을 인식 한 후 7을 문자타입으로 출력한다.
		System.out.println(7 + "");	
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");	//7+7을 연산 후 문자타입으로 변환하여 출력한다.
		System.out.println("" + 7 + 7);	//문자타입으로 먼저 변환하여 7과 7 이라는 문자로 인식하여 출력한다.
	}
}
