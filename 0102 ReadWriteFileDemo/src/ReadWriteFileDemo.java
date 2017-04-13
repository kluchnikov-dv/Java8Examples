//Глава 13
//Чтение запись данных в файлы
//стр. 368

import java.io.*;

public class ReadWriteFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin = null;
		
		if(args.length != 1) { 
			System.out.println("Правильная команда: java ReadWriteFileDemo test.txt");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if (i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");			
		} catch (IOException e) {
			System.out.println("Ошибка чтения файла.");
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Ошибка закрытия файла.");
			}
		}
	}

}
