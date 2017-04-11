//Глава 13
//Чтение символьных строк
//стр. 361

import java.io.*;

public class ReadLine {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите строки. \"стоп\" для завершения ввода.");
		String str;
		do{
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("стоп"));
	}

}
