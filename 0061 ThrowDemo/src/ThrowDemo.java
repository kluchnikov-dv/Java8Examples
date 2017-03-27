//Глава 10
//Оператор Throw
//стр. 272 - 273 

public class ThrowDemo {

	static void demoproc() {
		try { 
			throw new NullPointerException("Демонстрация.");			
		} catch(NullPointerException e) {
			System.out.println("Исключение перехвачено из метода demoproc(). " + e);
			throw e;			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demoproc();
		} catch (NullPointerException e) {
				System.out.println("Исключение перехвачено повторно из главного метода." + e);				
		}

	}

}
