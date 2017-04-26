//Глава 14
//Обобщенные методы
//стр. 415

//обычный не обобщенный класс
public class GeneralizationMethodDemo {

	//обобщенный метод
	static <T extends Comparable<T>, V extends T> 
	boolean isIn(T element, V[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(element)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i_array[] = {1, 2, 3, 4, 5};
		String s_array[] = {"один", "два", "три", "четыре", "пять"};
		
		if(isIn(2, i_array)) System.out.println("2 содержится в массиве i_array.");
		if(!isIn(7, i_array)) System.out.println("7 не содержится в массиве i_array.");
		if(isIn("два", s_array)) System.out.println("два содержится в массиве s_array");
		if(!isIn("семь", s_array)) System.out.println("семь не содержится в массиве s_array.");
		
		//if(isIn(2, s_array)) System.out.println("Компилятор это не пропустит, не соответствие типов.");
		
		//Полная запись вызова метода isIn выглядит следующим образом, новая запись появилась с версией Java8
		if(GeneralizationMethodDemo.<Integer, Integer>isIn(3, i_array)) System.out.println("3 содержится в массиве i_array");
	}

}
