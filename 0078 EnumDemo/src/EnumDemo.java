//Глава 12
//Основные положения о перечислениях
//стр. 319

enum Apple{ 
	Kitayka, Antonovka, Grushovka, Golden, BeliyNaliv
}

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap = Apple.Antonovka;
		System.out.println("Переменная ap типа Apple имеет значение: " + ap);
		System.out.println();
		ap = Apple.Golden;
		if(ap == Apple.Golden) System.out.println("Переменная ap типа Apple имеет значение Golden.\n");
		ap = Apple.BeliyNaliv;
		switch(ap) {
			case Kitayka:
				System.out.println("Сорт Kitayka.");
				break;
			case Antonovka:
				System.out.println("Сорт Antonovka.");
				break;
			case Grushovka:
				System.out.println("Сорт Grushovka.");
				break;
			case Golden:
				System.out.println("Сорт Golden.");
				break;
			case BeliyNaliv:
				System.out.println("Сорт BeliyNaliv.");
				break;
		}
	}

}
