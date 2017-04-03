//Глава 12
//Автоупаковка и автораспаковка Boolean и Character
//Автоупаковка и автораспаковка помогают предотвратить ошибки
//Предупреждение
//стр. 332

public class AutoPackerCharBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//автоупаковка
		Boolean b = true;
		
		//автораспаковка
		if(b) System.out.println("b = " + b);
		
		//автоупаковка
		Character ch = 'x';
		//автораспаковка		
		char ch2 = ch; 
		System.out.println("ch2 = " + ch2);
		
		//Автоупаковка и автораспаковка предотвращает ошибки
		Integer iOb = 1000;
		int i = iOb.byteValue();
		System.out.println("Значение i = " + i + " что неверно.");
		i = iOb.intValue();
		System.out.println("iOb имеет тип Integer = " + i);
		
		//Дополнительные издержки влекут за собой необоснованое применение Обьектов оболочек
		Double a1, b1, c1;
		a1 = 10.0;
		b1 = 4.0;
		c1 = Math.sqrt(a1 * a1 + b1 * b1);
		System.out.println("Гипотенуза равна = " + c1);
	}

}
