//Глава 7
//Вложенные и внутренние классы
//класс можно обьявить внутри блока кода
//стр 199
class outer {	
	int outer_x = 100;
	
	void test() {
		for (int i = 0; i < 10; i++){
			class inner {
				void display(){
					System.out.println("вывод outer_x = " + outer_x);
				}
			}
			inner in = new inner();
			in.display();
		}
	}
}


public class IsertedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer outer1 = new outer();
		outer1.test();
	}
}
