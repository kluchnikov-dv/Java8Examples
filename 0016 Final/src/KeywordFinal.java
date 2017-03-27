//Глава 7
//Ключевое слово final
//стр 195
class temp {
	final int MAX = 10;
	final int MIN = 5;
	
	void printMaxMin() {
		System.out.println("Значение final переменных MAX и MIN: " + MAX + " и " + MIN);
	}
}

public class KeywordFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp t = new temp();
		t.printMaxMin();
	}

}
