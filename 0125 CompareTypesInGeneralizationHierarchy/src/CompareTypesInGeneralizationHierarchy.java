//Глава 14
//Сравнение типов в обобщенных иерархий во время выполнения
//стр. 425-427

//Обобщенный суперкласс
class Generalization<T> {
	T obj;
	
	Generalization(T o) {
		obj = o;
	}
		
}

//Обобщенный подкласс
class SubGeneralization<T> extends Generalization<T> {
	SubGeneralization(T o) {
		super(o);
	}
}


public class CompareTypesInGeneralizationHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generalization<Integer> iobj1 = new Generalization<Integer>(777);
		SubGeneralization<Integer> iobj2 = new SubGeneralization<Integer>(888);
		SubGeneralization<String> sobj2 = new SubGeneralization<String>("Строка.");
		
		if(iobj2 instanceof SubGeneralization<?>) System.out.println("iobj2 является обьектом класса SubGeneralization.");
		//это верно т.к. iobj2 является некторой формой суперкласса Generalization
		if(iobj2 instanceof Generalization<?>) System.out.println("iobj2 является обьектом класса Generalization."); 
		
		if(sobj2 instanceof SubGeneralization<?>) System.out.println("sobj2 является обьектом класса SubGeneralization.");
		if(sobj2 instanceof Generalization<?>) System.out.println("sobj2 является обьектом класса Generalization.");
		
		//эту строку не выведет
		if(iobj1 instanceof SubGeneralization<?>) System.out.println("iobj1 является обьектом класса SubGeneralization."); 
		if(iobj1 instanceof Generalization<?>) System.out.println("iobj1 является обьектом класса Generalization.");
		
		//компилятор выведет ошибку
		//т.к. во время выполнения конкретный тип параметра обобщенного класса определить нельзя
		//if(iobj1 instanceof Generalization<Integer>) System.out.println("iobj1 является обьектом класса Generalization.");
		
		Generalization<Integer> iobj = (Generalization<Integer>) iobj2; //такое приведение допустимо
		//Generalization<Long> lobj = (Generalization<Long>) iobj2; //такое приведение недопустимо
	}

}
