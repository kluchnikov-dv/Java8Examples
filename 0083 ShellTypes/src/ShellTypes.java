//Глава 12
//Оболочки для простых(примитивных) типов данных
//Character, Boolean, Integer, Byte, Short, Long, Float, Double
//стр. 327 - 328


public class ShellTypes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'п';
		Character ch = new Character(c);
		System.out.println("Значение обьекта ch класса Character: " + ch.charValue());
		
		boolean b = true;		
		Boolean bool = new Boolean(b);
		Boolean bool2 = new Boolean("true");
		System.out.println("Значение обьекта bool класса Boolean: " + bool.booleanValue());
		System.out.println("Значение обьекта bool2 класса Boolean: " + bool2.toString());
		
		Integer intob = new Integer(100);
		Integer intob2 = new Integer("90");
		int i = intob2.intValue();
		System.out.println("Значение обьекта intob класса Boolean: " + intob.intValue());
		System.out.println("Значение обьекта intob2 класса Boolean: " + intob2.toString());
		System.out.println("Значение переменной i: " + i);
		
	}

}
