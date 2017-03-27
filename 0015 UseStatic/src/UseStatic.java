//Глава 7
//ключевое слово sttaic
//стр. 194

class StaticDemo{
	static int a = 12;
	static int b = 56;
	static void callme(){
		System.out.println("a = " + a);
	}
}

public class UseStatic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.callme();
		System.out.println("b = " + StaticDemo.b);
	}

}
