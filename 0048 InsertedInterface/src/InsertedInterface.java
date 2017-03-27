//Глава 9
//Вложенные интерфейсы
//стр. 249

class A {
	public interface InsertedIF {
		boolean isNegative(int x);
	}
}

class B implements A.InsertedIF {
	public boolean isNegative(int x) {
		return x < 0 ? true : false;
	}
}

public class InsertedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.InsertedIF iNobj = new B();
		if(iNobj.isNegative(10)) System.out.println("Число 10 не отрицательное, поэтому не будтет выведено");
		if(iNobj.isNegative(-13)) System.out.println("Число -13  отрицательное, поэтому будет выведено");
	}

}
