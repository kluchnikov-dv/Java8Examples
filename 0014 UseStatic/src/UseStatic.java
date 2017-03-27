//Глава 7
//Ключевое слово static
//стр. 193

public class UseStatic {
	
	static int a = 4;
	static int b;
	int k; //к этой переменной не получится обратиться т.к. экземпляр класса UseStatic не создан
	
	static void method(int i) {
		System.out.println("i = " + i);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//System.out.println("k = " + k); компилятор выдаст ошибку
	}
	
	static {
		System.out.println("Статический блок инициализирован");
		b = a + 6;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("k = " + k); компилятор выдаст ошибку
		method(42);		
	}

}
