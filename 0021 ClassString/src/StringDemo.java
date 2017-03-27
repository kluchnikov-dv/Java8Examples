//Глава 7
//Класс String
//стр. 200-201
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Это также обьект класса String.");
		
		String str1 = "Это символьная строка";
		System.out.println(str1);
		
		String str2 = "Мне" + " нравится " + "Java";
		System.out.println(str2);
		
		String strObj1 = "Первая строка";
		String strObj2 = "Вторая строка";
		String strObj3 = strObj1 + " и " + strObj2;
		System.out.println(strObj1);
		System.out.println(strObj2);
		System.out.println(strObj3);
		
		//некоторые методы класса
		String strObj4 = strObj1;
		System.out.println("Длина строки strObj1: " + strObj1.length());
		System.out.println("Символ по индексу 6 в строке strObj2: " + strObj2.charAt(5));
		if (strObj1.equals(strObj2)) System.out.println("strObj1 == strObj2");
		else System.out.println("strObj1 != strObj2");
		if (strObj1.equals(strObj4)) System.out.println("strObj1 == strObj4");
		else System.out.println("strObj1 != strObj4");
		
		//массив строк
		String str[] = {"один", "два", "три"};
		for (int i = 0; i < str.length; i++){
			System.out.println("str[" + i + "] = " + str[i]);
		}
		
	}

}
