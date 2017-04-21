//Глава 13
//Статический импорт
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//можно было записать одной строкой
//import static java.lang.Math.*;
import static java.lang.System.out;

public class ImportStatic {
	public static void main(String[] args) {
		double katet1 = 4.0, katet2 = 3.0;
		double hypot;
		hypot = sqrt(pow(katet1, 2) + pow(katet2, 2));
		out.println("При заданных сторонах прмоугольного треугольника:");
		out.println("katet1 = " + katet1 + "\nkatet2 = " + katet2 + "\n" + "гипотенуза  = " + hypot);		
	}

}
