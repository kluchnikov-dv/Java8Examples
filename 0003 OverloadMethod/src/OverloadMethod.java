// Глава 7 
// Перегрузка методов
// стр 178
class OverloadDemo{
	void test () {
		System.out.println("Параметры отсутствуют");
	}
	
	void test (int a, int b) {
		System.out.println("Два целочисленных параметра a и b: " + a + " " + b);
	}
	
	void test (double d) { 
		System.out.println("Один вещественный параметр d:" + d*d);		
	}
	
}

public class OverloadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo od = new OverloadDemo();
		od.test();		
		od.test(10, 20);
		//пример автоматического преобразования типа int в double
		//метода для вывода целочисленного параметра нет
		int i = 200;
		od.test(i);	
	}
}
