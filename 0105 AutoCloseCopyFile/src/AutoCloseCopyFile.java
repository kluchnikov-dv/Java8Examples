//Глава 13
//Автоматическое закрытие файла
//Оператор try с несколькими ресрусами
//стр. 372-373

import java.io.*;

public class AutoCloseCopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		if (args.length != 2) {
			System.out.println("Спецификация вывода: java AutoCloseFileCopy in.txt out.txt");
			return;
		}
		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1])) {
			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		}catch (IOException e) {
			System.out.println("Ошибка вводы-вывода: " + e);
		}
	}

}
