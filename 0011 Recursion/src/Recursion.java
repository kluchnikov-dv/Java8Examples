//Глава 7
//Рекурсия
//стр. 189

class test {
	int values[];
	test(int i){
		values = new int[i];
	}
	//рекурсивный вывод элементов массива
	void printArray(int i){
		if (i == 0) return;
		else printArray(i - 1);
		System.out.println("[" + (i - 1)+ "]" + values[i - 1]);
	}
}

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test object = new test(10);
		for(int i = 0; i < 10; i++) object.values[i] = i;
		object.printArray(10);
	}

}
