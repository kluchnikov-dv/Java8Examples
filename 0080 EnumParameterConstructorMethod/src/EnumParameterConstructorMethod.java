//Глава 12
//Перечисления в Java относятся к типам классов
//поэтому ведут себя практически как классы
//не могут наследоваться, быть суперклассом (не может расширяться)
//стр. 321

enum Apple {
	Kitayka(10), Antonovka(3), Grushovka, Golden(12), BeliyNaliv(8);
	
	//переменная перечисления
	private int price;
	
	//перегружаемый конструтор
	Apple(int p) {
		price = p;
	}
	//перегружаемый конструтор
	Apple() {
		price = -1;
	}

	//метод перечисления
	int getPrice() { 
		return price;
	}
}

public class EnumParameterConstructorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple ap;
		
		System.out.println("Яблоко сорта Golden стоит: " + Apple.Golden.getPrice() + "рублей.\n");
		
		for(Apple a : Apple.values()) {
			if (a.getPrice() != -1) {
				System.out.println(a + " стоит: " + a.getPrice() + "рублей.");
			} else {
				System.out.println("Цена на яблоки сорта " + a + " не известна.");
			}
		}
	}

}
