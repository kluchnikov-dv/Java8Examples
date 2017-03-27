
//Глава 7
//Подробное рассмотрение особенностей передачи аргументов
//стр.184
//Передача параметров по значению

class test {
	void method(int i, int j){
		i *= 2;
		j /= 2;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test object = new test();
		int a = 15, b = 20;
		System.out.println("a и b до вызова: " + a + "  " + b);
		object.method(a,  b);
		System.out.println("a и b после вызова: " + a + "  " + b);		
	}
}
