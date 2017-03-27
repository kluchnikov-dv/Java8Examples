//Глава 7
//Возврат объектов
// стр. 186

class test {
	int a;
	
	test (int i) {
		a = i;
	}
	
	test incrByTen() {
		test tempobject = new test (a + 10);
		return tempobject;
	}
}

public class ReturnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test object1 = new test(2);
		test object2 = object1.incrByTen();
		System.out.println("object1.a = " + object1.a);
		System.out.println("object2.a = " + object2.a);
		object2 = object2.incrByTen();
		System.out.println("второе увеличение значения object2.a = " + object2.a);
		 
	}

}
