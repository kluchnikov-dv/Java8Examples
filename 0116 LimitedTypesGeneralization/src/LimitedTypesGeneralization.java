//Глава 14
//Ограниченные типы в обобщенных обьектах
//стр. 406


//аругмент типа T должен быть классом Number, либо его подклассом
class Stats<T extends Number> {
	T[] numbers; //Массив класса NUmber или его подкласса
	
	//Передать конструктору класса ссылку на массив класса Number или его подкласса
	Stats(T[] num) {
		numbers = num;
	}
	
	//Возвратить значение double в любом случае
	double average() {
		double sum = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			//компилятор не пропустил бы эту строку,
			//если бы numbers не состоял из элементо класса Number, либо его подкласса.
			sum += numbers[i].doubleValue(); 
		}
		return (sum / numbers.length);
	}
}

/* допускается  ограничение в виде одного класса и сколько угодно интерфейсов
 * 
 * Когда ограничение включает в себя тип интерфейса, допустимы 
 * только аргументы типа, реализующие этот интерфейс.
class MyClass {
	
}

interface MyInterface1 {
	
}

interface MyInterface2 {
	
}

class Stats2<T extends MyClass & MyInterface1 & MyInterface2> {
	
}
*/

public class LimitedTypesGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inum = {1, 2, 3, 4, 5};
		Stats<Integer> obj1 = new Stats<Integer>(inum);
		System.out.println("Среднее значение целых чисел массива inum: " + obj1.average());
		
		Double[] dnum = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> obj2 = new Stats<Double>(dnum);
		System.out.println("Среднее значение целых чисел массива dnum: " + obj2.average());
		
		//Вот это компилятор не пропустит, т.к. массив snum принадлежит типу String
		//String[] snum = {"1.1", "2.2", "3.3", "4.4", "5.5"};
		//Stats<String> obj3 = new Stats<String>(snum);
		//System.out.println("Среднее значение целых чисел массива snum: " + obj3.average());
	}

}
