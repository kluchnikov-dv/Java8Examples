//Глава 7
//Вложенные и внутренние классы
//стр 197 - 198
class outer {
	
	int outer_x = 10;
	
	void test () {
		inner in = new inner();
		in.display();
	}
	
	class inner {
		int inner_y = 100;
		void display () {
			System.out.println("Значение переменной outer_x = " + outer_x);
		}
	}
	
	void showy() {
		//System.out.println(y); //компилятор это не пропустит
	}
}

public class InsertedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer outer1 = new outer();
		outer1.test();
	}

}
