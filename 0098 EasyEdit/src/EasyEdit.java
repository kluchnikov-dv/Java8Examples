//Глава 13
//Чтение строк
//Простой редактор
//стр. 362

import java.io.*;


public class EasyEdit {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[100];
		System.out.println("-----Введите текст.-----");
		for(int i = 0; i < 100; i++) {
			str[i] = br.readLine();
			if(str[i].equals("стоп")) break;
		}
		System.out.println("-----Содержимое.-----");
		for(int i = 0; i < 100; i++) {
			System.out.println(str[i]);
			if(str[i].equals("стоп")) break;			
		}
	}

}
