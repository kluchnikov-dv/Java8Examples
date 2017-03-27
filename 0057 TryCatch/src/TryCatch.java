//Глава 10
//Использование блоков try и catch
//Вывод описания исключения
//стр. 267 - 268

import java.util.Random;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Random r = new Random();
		
		for(int i = 0; i < 32000; i++) {
			try {
				a = r.nextInt();
				b = r.nextInt();
				c = 12345 / (a / b);
			} catch (ArithmeticException e) {
				System.out.print ("Деление на ноль: " + e + "  ");
				c = 0;				
			}
			System.out.println ("c = " + c);
		}
	}
}
