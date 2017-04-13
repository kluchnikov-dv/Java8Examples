//Глава 13
//Автоматическое закрытие файлов
//Оператор try с ресурсами
//стр. 371-372

import java.io.*;

public class AutoCloseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		//проверяем указано ли имя файла
		if (args.length != 1) {
			System.out.println("Спецификация ввода: java AutoCloseFile test.txt");
			return;
		}
		//оператор try с ресурсами - применяется для открытия файла и автоматического закрытия по завершении опрератора try
		try(FileInputStream fin = new FileInputStream(args[0])) {
			do {
				i = fin.read();
				if(i != -1) System.out.print((char)i);
			} while(i != -1);			
		}catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
		}catch (IOException e) {
			System.out.println("Ошибка ввода-вывода.");
		}		
	}

}
