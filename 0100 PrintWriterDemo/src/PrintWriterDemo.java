//Глава 13
//класс PrintWriter
//стр. 364

import java.io.*; //применение класса PrintWriter

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out, true);
		
		pw.println("строка");
		
		int i = 231;
		pw.println(i);
		
		double d = 121.12e4;
		pw.println(d);
		
	}

}
