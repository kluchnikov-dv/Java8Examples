//Глава 7
//Введение в управление доступом
//стр. 190

class test {
	int a;
	public int b;
	private int c;
	
	void setc(int i){
		c = i;
	}
	
	int getc(){
		return c;
	}
}

public class ControlAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test object = new test();
		object.a = 1;
		object.b = 2;
		//object.c = 3; вызовит ошибку
		
		object.setc(3);
		System.out.println("a = " + object.a + " b = " + object.b + " c = " + object.getc());		
	}

}
