package Java.Basic;

public class Ifelse {


	public static void ifelse(){
		int time = 22;
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time < 20) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		}
		// Outputs "Good evening."
	}

	public static void ShortHandIfelse(){
		// variable = (condition) ? expressionTrue :  expressionFalse;
		int  num =20;
		var sys =num>10? true:false;
		System.out.println(sys);
	}
	public static void main(String[] args) {
		ifelse();
		ShortHandIfelse();
	}
}
