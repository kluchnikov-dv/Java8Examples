//Глава 14
//Применение метасимвольных аргуменов
//стр. 408 - 409

class Stats<T extends Number> {
	T[] num; //массив типа T, ограниченный классом T и его подклассами
	
	//Передаем конструктору ссылку на массив типа T, ограниченный классом T и его подклассами
	Stats(T[] o) {
		num = o;
	}
	
	double getavg() {
		double sum = 0.0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i].doubleValue();
		}
		return sum / num.length;
	}
	
	//Определить равенство двух средних значений, текущего обьекта и передаваемого в качестве аргумента
	//Тут применяется метасимвольный аргумент ?, представлет неизвестный тип
	//Stats<?> - совпадает с любым обьектом класса Stats 
	boolean CompareAvg(Stats<?> ob) {
		if (getavg() == ob.getavg()) return true;
		return false;
	}
	
	//если бы я написал так, то если вызывающий обьект относится к обьекту типа Stats<Integer>, 
	//то и параметр должен относится к обьекту типа Stats<Integer>
	boolean CompareAvg2(Stats<T> ob) {
		if (getavg() == ob.getavg()) return true;
		return false;
	}
	
}

public class MetacharacterDemoGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inum = {1, 2, 3, 4, 5};
		Double[] dnum = {1.1, 2.2, 3.3, 4.4, 5.5};
		Float[] fnum = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
		
		Stats<Integer> obj1 = new Stats<Integer>(inum);
		Stats<Double> obj2 = new Stats<Double>(dnum);
		Stats<Float> obj3 = new Stats<Float>(fnum);
		
		System.out.println("Среднее значение obj1: " + obj1.getavg());
		System.out.println("Среднее значение obj2: " + obj2.getavg());
		System.out.println("Среднее значение obj3: " + obj3.getavg());
		
		System.out.println("\nСравниваем среднии значения разных типов: ");
		if(obj1.CompareAvg(obj2)) System.out.println("Средние значения obj1 и obj2 равны");
		else System.out.println("Средние значения obj1 и obj2 не равны");
		if(obj1.CompareAvg(obj3)) System.out.println("Средние значения obj1 и obj3 равны");
		else System.out.println("Средние значения obj1 и obj3 не равны");
		
		/* компилятор это не пропустит, обьекты относятся к разным типам Integer[], Double[], Float[] 
		if(obj1.CompareAvg2(obj2)) System.out.println("Средние значения obj1 и obj3 равны");
		else System.out.println("Средние значения obj1 и obj3 не равны");
		if(obj1.CompareAvg2(obj3)) System.out.println("Средние значения obj1 и obj3 равны");
		else System.out.println("Средние значения obj1 и obj3 не равны");
		*/
	}

}
