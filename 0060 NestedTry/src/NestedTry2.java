//Глава 10
//Вложенные операторы try
//стр. 270 - 271

//второй вариант программы с неявным вложением try
public class NestedTry2 {

	static int a, b;
	
	static void nestedtry(int a) {
		try {
			if (a == 1) a = a / (a - a);
			int c[] = {1};
			c[a] = 5;			
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Индекс вышел за пределы массива.\n" + e + "\na =  " + a);			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			a = args.length;
			b =  5 / a;
			nestedtry(a);
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль.\n" + e + "\na = " + a);
		}
	}

}
