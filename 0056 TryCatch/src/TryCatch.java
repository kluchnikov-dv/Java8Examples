//Глава 10
//Использование блоков операторов try и catch
//стр. 266 - 267

public class TryCatch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d, a;
		try {
			d = 0;
			a = 5 / d;
			System.out.println("Этот опреатор никогда не выоплнится.");
		} catch (ArithmeticException e) {
			System.out.println("Дленение на ноль.");			
		}
		System.out.println("Оператор после catch.");
	}
}
