//Глава 13
//Чтение Запись данных в файлы
//стр. 366 - 367
//java 8 ругается, что не проинициализирован FileInputStream
//пришлось присвоить null, иначе не билдится


import java.io.*;

public class ReadWriteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin = null;
		//если не ввели имя файла, прерываем работу программы
		if (args.length != 1) {
			System.out.println("Использование: java ReadWriteFileDemo \"имя_файла\"");
			return;
		}
		
		
		//Открываем файл, если он существет
		try {
			fin = new FileInputStream(args[0]);
			//Читаем данные из файл и выводим на консоль
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
		}

		try {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char)i);							
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("Ошибка чтения из файла.");
		} finally {
			try {
				fin.close(); //если конец файла, закрываем его
			} catch (IOException e) {
				System.out.println("Ошибка закрытия файла.");
			}
		}
		
		
		
	}

}
