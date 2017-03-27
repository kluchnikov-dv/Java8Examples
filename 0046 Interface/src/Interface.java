//Глава 9
//Реализация интерфейсов
//стр.246-247

interface Callback {
	void printint(int param);
}

class Client implements Callback {
	public void printint(int p){
		System.out.println("Метод callcback(), со значениеим: " + p);
	}
	
	//дополнительный метод, отсутствующий в интерфейсе
	void otherprint () {
		System.out.println("В классе могут быть обьявлены\nдополнительные методы и\nпеременные, не обьявленные в интерфейсе");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		c.printint(97);
		c.otherprint();
	}

}
