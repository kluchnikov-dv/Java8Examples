//Глава 14
//Каким образом обобщения повышают типовую безопасность
//стр. 401-402

//Функциональный эквивалент класса Generalization
class NonGeneralization {
	//обьект типа Object
	Object ob;
	
	//Передать конструктору ссылку на обьект
	NonGeneralization(Object o) {
		ob = o;
	}
	//показать тип обьекта ob
	void ShowType() {
		System.out.println("Тип переменной ob: " + ob.getClass().getName());
	}
	
	//Возвратить тип обьекта Object	
	Object getob() {
		return ob;
	}
}

public class NonGeneralizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonGeneralization iOb = new NonGeneralization(88);
		iOb.ShowType();
		//Получить значение iOb, требуется приведение типов
		int value = (Integer)iOb.getob();
		System.out.println("Значение iOb: " + value);
		
		
		NonGeneralization strOb = new NonGeneralization("Пример не обобщеного класса.");
		strOb.ShowType();
		//Получить значение iOb, требуется приведение типов
		String str = (String)strOb.getob();
		System.out.println("Значение iOb: " + str);
		
		//Этот код компилируется, но он принципиально не верен!
		iOb = strOb;
		value = (Integer) iOb.getob(); //ошибка во время выполнения!
		//синтаксически запись верна, но семантически не верна!
		//и обнарживается эта ошибка только во время выполнения, а не во время компиляции
	}

}
