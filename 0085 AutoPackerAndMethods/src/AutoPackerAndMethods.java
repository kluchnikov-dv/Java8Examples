//Глава 12
//Автоупаковка и методы
//стр. 329-330

public class AutoPackerAndMethods {
	//Статиечский метод принимает обьект типа Integer, а возвращает автораспакованный примитивный тип int
	static int method(Integer value) {
		return value;
	}
	
	public static void main(String[] args) {
		//1. значение 100 автоупаковывается в Integer
		//2. method автораспаковывает value
		//3/ iObj присваивается снова автоупакованный int
		Integer iObj = method(100);
		//4. автораспаковка iObj перед выводом
		System.out.println(iObj);
	}

}
