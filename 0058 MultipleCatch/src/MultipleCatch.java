//Глава 10
//Применение нескольких операторов catch
//стр. 268 - 269

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 23 / a;
			int c[] = {1};
			c[12] = 12;
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Выход за пределы массив: а" + e);
		}
		System.out.println("После блока операторов try и catch.");
	}

}
