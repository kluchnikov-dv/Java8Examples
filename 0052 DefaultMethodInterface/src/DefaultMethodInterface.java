//Глава 9 
//Основы применения методов по умолчанию
//стр. 257-258

class MyClassDemo1 implements MyInterface {
	public int getNumber() {
		return 100;
	}
}

class MyClassDemo2 implements MyInterface {
	public int getNumber() {
		return 200;
	}
	
	public String getString() {
		return "Обьект типа String в методе не по умолчанию.";
	}
}

public class DefaultMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassDemo1 obj1 = new MyClassDemo1();
		MyClassDemo2 obj2 = new MyClassDemo2();
		
		System.out.println(obj1.getNumber());
		System.out.println(obj1.getString());
		System.out.println(obj2.getNumber());
		System.out.println(obj2.getString());
		
	}

}
