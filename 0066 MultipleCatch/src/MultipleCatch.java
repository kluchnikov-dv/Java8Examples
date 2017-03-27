//Глава 10
//Многократный перехват
//стр. 283

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0;
		int array[] = {1, 2, 3};
		
		try {
			//int result = a / b;
			array[5] = 4;
			
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Перехвачено исключение: " + e);
		}
		System.out.println("После блока многократного перехвата.");
	}

}
