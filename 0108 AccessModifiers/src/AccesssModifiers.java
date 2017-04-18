//Глава 13
//Можификаторы доступа transient, volatile, strictfp

strictfp class T {   //этот модификатор гарантирует выполнение операций с вещественными чисалми с промежуточными округлениями
	transient int a; //значение переменной a не сохраняется, когда сохраняется обьект
	int b; 			 //сохраняется
	volatile int c;  //значение этой переменной всегда будет обновленое актуальное 
					 //это необходимо в многопоточных программах, когда доступ к переменной имеют несколько потоков
}

public class AccesssModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
