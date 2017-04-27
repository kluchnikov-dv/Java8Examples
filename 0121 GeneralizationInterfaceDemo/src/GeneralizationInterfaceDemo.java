//Глава 14
//Обобщенные интерфейс
//стр. 418 - 419

//Обобщенный интерфейс
interface MinMax<T extends Comparable<T>> {
	public T min();
	public T max();
}

//По идее я бы мог сразу реализовать интерфейс, но был бы ограничен типом
class RznMinMax implements MinMax<Integer> {
	
	public Integer min() {return 0;};
	public Integer max() {return 0;};
}

//Обобщенный класс реализующий интерфейс MinMax
class RealizationMinMax<T extends Comparable<T>> implements MinMax<T> {
	T[] array; //массив перечисляемых обьектов, ограниченных интерфейсом Comparable входящим в Java.lang
	
	//конструктор класса инициализирующий массив
	RealizationMinMax(T[] obj) {
		array = obj;
	}
	
	public T min() {
		T value = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i].compareTo(value) < 0) value = array[i];
		}
		return value;
	};
	
	public T max() {
		T value = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i].compareTo(value) > 0) value = array[i];
		}
		return value;
	};
}


public class GeneralizationInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] iarray = {5, 7, 2, 20, 33, 8};
		Character[] charray = {'d', 't', 'b', 'a', 'x'};
		
		RealizationMinMax<Integer> iobj = new RealizationMinMax(iarray);		
		System.out.println("Минимальное значение iarray: " + iobj.min());
		System.out.println("Максимальное значение iarray: " + iobj.max());
		
		RealizationMinMax<Character> chobj = new RealizationMinMax(charray);		
		System.out.println("Минимальное значение charray: " + chobj.min());
		System.out.println("Максимальное значение charray: " + chobj.max());
		
	}

}
