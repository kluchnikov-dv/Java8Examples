//Глава 7
//Перегрузка методов с аргументами переменной длины
//стр. 206

public class OverloadMethodArgumentVariableLength {

	static void PrintArray(int ... array){
		System.out.print("PrintArray(int ...): " + "Колличество аргументов: " + array.length + " Содержимое: ");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	static void PrintArray(boolean ... array){
		System.out.print("PrintArray(boolean ...): " + "Колличество аргументов: " + array.length + " Содержимое: ");
		for(boolean x : array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	static void PrintArray(String msg, int ... array){
		System.out.print("PrintArray(String msg, int ...): " + "Колличество аргументов: " + msg + array.length + " Содержимое: ");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray(1, 2, 3);
		PrintArray("Проверка: ", 10, 20);
		PrintArray(false, true, false);
	}

}
