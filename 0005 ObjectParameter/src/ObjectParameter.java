//Глава 7
//Применение обьекта в качестве параметра
//стр.182
class test {
	int i, j;
	
	test (int a, int b) {
		i = a;
		j = b;
	}
	
	boolean equals (test object) {
		if (object.i == i && object.j == j) return true;
		else return false;
	}
}

public class ObjectParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test object1 = new test(100, 11);
		test object2 = new test(100, 11);
		test object3 = new test(1, 1);
		System.out.println("object1 == object2: " + object1.equals(object2));
		System.out.println("object1 == object3: " + object1.equals(object3));
	}

}
