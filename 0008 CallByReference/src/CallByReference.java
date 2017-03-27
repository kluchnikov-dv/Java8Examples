//Глава 7
//Подробное рассмотрение особенностей передачи аргументов
//стр.185
//Передача параметров по ссылке на обьект

class test {
	int a, b;
	
	test(int i, int j) {
		a = i;
		b = j;
	}
	
	void method (test object) {
		object.a *= 2;
		object.b /= 2;
	}
}


public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test object1 = new test(15, 20);
		System.out.println("object1.a и object1.b до вызова: " + object1.a + " " + object1.b);
		object1.method(object1);
		System.out.println("object1.a и object1.b после вызова: " + object1.a + " " + object1.b);
	}

}
