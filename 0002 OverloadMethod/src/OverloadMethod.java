// Глава 7 
// Перегрузка методов
// стр 177
class OverloadDemo{
	void test () {
		System.out.println("Параметры отсутствуют");
	}
	
	void test (int a) {
		System.out.println("Один целочисленный параметр a: " + a);
	}
	
	void test (int a, int b) {
		System.out.println("Два целочисленных параметра a и b: " + a + " " + b);
	}
	
	double test (double d) { 
		System.out.println("Один вещественный параметр d:" + d);
		return d*d;
	}
	
}

public class OverloadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo od = new OverloadDemo();
		od.test();
		od.test(10);
		od.test(10, 20);
		System.out.println("Возвращаемое значении метода od.test(3.14): " + od.test(3.14));	
	}
}


