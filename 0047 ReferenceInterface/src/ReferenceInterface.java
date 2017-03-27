//Глава 9
//Доступ к реализациям через ссылки на интерфейсы
//стр.247-248

interface Callback {
	void printnum(int param);
}

//первая реализация интерфейса
class Client implements Callback {
	public void printnum(int p) {
		System.out.println("Метод printnum(), вызываемый со значением: " + p);
	}
	
	void othermethod() {
		System.out.println("В классах реализующих интерфес, могут иметь другие методы.");
	}
}

//вторая реализация интерфейса
class OtherClient implements Callback {
	public void printnum(int p) {		
		System.out.println("Другая реализация интерфейса Callback(). ");
		System.out.println("p в квадрате = " + p*p);
	}
}

//любой класс не реализующий методы интерфеса,
//должен быть обьявлен как абстрактный
abstract class Incomplete implements Callback {
	int a, b;
	
	void show() {
		System.out.println("Значение параметров а и b: " + a + " " + b);
	}	
}

public class ReferenceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Переменной с присвоен экземпляр класса Client, хотя перемення обьявлена как тип интерфейса Callback
		Callback c = new Client();
		//Переменная с может вызвать только на те методы что обьявлены в интерфейсе, так она не может вызвать othermethod(),
		//т.к. он не обьявлен в интерфейсе
		c.printnum(56);
		OtherClient obj = new OtherClient();
		c = obj;
		c.printnum(56);
	}

}
