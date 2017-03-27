//Глава 7
//Использование массива для передачи аргументов переменной длины
//стр. 203

public class MethodVariableArgumentLength {
	
	//старый метод передачи массива
	static void PrintArray1(int array[]){
		System.out.print("Колличество аргументов: " + array.length + " Содержимое: ");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
	}

	//новый метод передачи перменной ссылающейся на массив
	static void PrintArray2(int ... array){
		System.out.print("Колличество аргументов: " + array.length + " Содержимое: ");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	static void PrintArray3(String msg, int ... array){
		System.out.print(msg + array.length + " Содержимое: ");
		for (int x : array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//инициализируем массивы
	int array1[] = {10};
	int array2[] = {4, 3, 5};
	int array3[] = {};
	
	
	PrintArray1(array1);
	PrintArray1(array2);
	PrintArray1(array3);
	
	PrintArray2(10);
	PrintArray2(4, 3, 5);
	PrintArray2();
	
	PrintArray3("Один параметр переменной длины:  ", 10);
	PrintArray3("Три параметр переменной длины:   ", 4, 3 ,5);
	PrintArray3("Без параметров переменной длины: ");
	
	}

}
