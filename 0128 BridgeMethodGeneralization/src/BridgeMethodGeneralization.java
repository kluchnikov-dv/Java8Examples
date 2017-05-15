//Глава 14
//Мостовые методы
//стр. 432

//ситуация в которой создается мостовой метод
class Gen<T> {
	T obj; //обьявляем обьект типа T
	
	//передать конструктору ссылку на обьект типа Т
	Gen(T o) {
		obj = o;
	}
	
	//возвратить обьект obj
	T getobj() {
		return obj;
	}
}

//подкласс, производный от класса obj
class Gen2 extends Gen<String> {
	
	Gen2(String o) {
		super(o);
	}
	
	//перегружаем метод getobj() для получения символьных строк
	String getobj() {
		System.out.println("функция getobj() из Gen2: ");
		return obj;
	}
}

public class BridgeMethodGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen2 strobj = new Gen2("тестовая строка.");
		System.out.println(strobj.getobj());
		/*
		Gen strobj2 = new Gen("вторая тестовая строка.");
		System.out.println(strobj2.getobj());
		*/
	}

}
