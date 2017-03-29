//Глава 12
//Перечисления наследуются от класса Enum находящимся в java.lang.Enum
//Поэтому перечислениям доступны методы Ordianl(), CompareTo(), Equals()
//стр. 324

enum Apple {
	Kitayka, Antonovka, Grushovka, Golden, BeliyNaliv
}

public class EnumOrdinalCompareToEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple ap1, ap2, ap3;
				
		System.out.println("Все сорта яблок и их порядковые номера: ");
		//вывод порядковых номеров сортов яблок при помощи метода ordinal()
		for(Apple a : Apple.values()) {
			System.out.println(a + " имеет порядковый номер: " + a.ordinal());
		}		
		System.out.println();
		
		ap1 = Apple.Antonovka;
		ap2 = Apple.Golden;
		ap3 = Apple.Antonovka;
		
		//демонстрация методов compareTo() и equals() 
		if(ap1.compareTo(ap2) < 0) System.out.println(ap1 + " предшествует " + ap2);
		if(ap1.compareTo(ap2) > 0) System.out.println(ap2 + " предшествует " + ap1);
		if(ap1.compareTo(ap3) == 0) System.out.println(ap2 + " равен " + ap3);
		
		System.out.println();
		
		if(ap1.equals(ap2)) System.out.println(ap1 + " != " + ap2);
		if(ap1.equals(ap3)) System.out.println(ap1 + " == " + ap3);
		
		if(ap1 == ap3) System.out.println(ap1 + " == " + ap3);
		
	}

}
