//Глава 12
//Методы values() и valuesOf()
//стр. 320 

enum Apple { 
	Kitayka, Antonovka, Grushovka, Golden, BeliyNaliv
}

public class EnumValuesValueOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Применение метода values()
		Apple[] allapple = Apple.values();
		
		System.out.println("Все константы перечисления Apple for(Apple a : allapple) :");
		for(Apple a : allapple) {
			System.out.println(a);
		}
		
		//Второй способ написания цикла for
		System.out.println("\nВсе константы перечисления Apple for(Apple a : Apple.values()) :");
		for(Apple a : Apple.values()) {
			System.out.println(a);
		}
		
		//Применение метода valueOf()
		Apple ap = Apple.valueOf("Antonovka");
		System.out.println("\nЗначение ap содержит: " + ap);
	}

}
