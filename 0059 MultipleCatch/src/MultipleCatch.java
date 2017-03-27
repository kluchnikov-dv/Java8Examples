//Глава 10
//применение нескольких операторов catch
//стр. 269-270

/* В последовательности операторов catch подкласс исключений ArithmeticException
 * должен следовать перед его суперклассом Exception, иначе возникнет ошибка 
 * компиляции. недостижимы код. 
 */

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 0;
			int b = 100 /a;
		} catch(Exception e) { //суперкласс Exception будет отлавливать все исключения
			System.out.println("Перехват исключений от суперкаласса Exception.");
		} /*catch(ArithmeticException e){ //этот опреатор catch никогда не будет выполнен, т.к. ArithmeticException является подклассом
			System.out.println("Этот код вообще не достижим.");
		}*/
	}

}
