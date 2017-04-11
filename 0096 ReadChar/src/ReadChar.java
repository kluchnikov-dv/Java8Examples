//Глава 13
//Чтение символов
//стр. 360


import java.io.*; //для использования класса BufferedReader для чтения символов


public class ReadChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		System.out.println("Введите символы, q для выхода: ");
		//Читаем и выводим символы пока пользователь не ввел q
		do {
			ch = (char)br.read();
			System.out.println(ch);			
		} while ( ch != 'q');
		System.out.println("Выход.");
		
	}

}
