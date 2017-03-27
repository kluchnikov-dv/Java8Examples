//Глава 9 
//Основы применения методов по умолчанию
//стр. 257-258


//хоть пиши public хоть не пиши он доступен в основном коде
public interface MyInterface {
	int getNumber();
	
	default String getString() {
		return "Обьект типа String в методе по умолчанию.";
	}

}