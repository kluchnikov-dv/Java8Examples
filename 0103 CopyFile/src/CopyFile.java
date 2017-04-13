//Глава 13
//Чтение запись данных в файл. Скопировал файл.
//стр. 370


import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		if(args.length != 2) {
			System.out.println("Шаблон ввода: FileCopy откуда куда");
			return;
		}
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			do {
				i = fin.read();
				if(i != -1) fout.write(i);				
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("ошибка ввода-вывода: " + e);
		} finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Ошибка закрытия файла копирования-ввода.");
			}
			try {
				if (fout != null) fout.close();
			} catch (IOException e) {
				System.out.println("Ошибка закрытия файла записи-вывода.");
			}
		}
	}

}
