//Глава 14
//Базовые типы и унаследованный код
//стр. 420 - 421
//Базовый тип нужен исключительно для совмещения старого кода, до появления обобщенных классов
//В других случаях его лучше не использовать, нарушает типовую безопасность

//обобщенный класс
class Generalization<T> {
	T value;
	
	Generalization(T obj) {
		value = obj;
	}
	
	T getvalue() {
		return value;
	}
}

public class BaseTypesAndInheritadeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generalization<Integer> iobj = new Generalization(100);
		Generalization<String> sobj = new Generalization("Строка.");
		
		System.out.println("iobj = " + iobj.getvalue());
		System.out.println("sobj = " + sobj.getvalue());
		
		//Пример класса базового типа, тут параметризированный тип T не указан
		//грубо говоря он является типом Object
		//basegen присваивается значение типа Double
		Generalization basegen = new Generalization(new Double(98.4)); //нарушает типовую безопасность, не удается проверить соответствия типов во время компиляции
		
		Double d = (Double) basegen.getvalue();
		System.out.println("d = " + d);
		
		// Все чсто ниже компилятор пропускает, но во время выполнения приводит к ошибке
		//int i = (Integer) basegen.getvalue(); //вызовет ошибку во время выполнения, т.к. в basegen содержится тип Double
		//System.out.println("i = " + i);
		
		sobj = basegen; //sobj начинает содержать Double
		//String str = sobj.getvalue(); //поэтому присовение типу String типа Double не возможно
		
		basegen = iobj;// basegen начинает содержать тип Integer
		//d = (Double) basegen.getvalue(); // попытка присвоения типу Double типа Integer
		
		
		
	}

}
