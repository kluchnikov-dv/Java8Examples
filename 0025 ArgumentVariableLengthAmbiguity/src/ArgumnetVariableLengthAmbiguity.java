//Глава 7
//Аргументы переменной длины и неоднозначность
//стр. 207-208


public class ArgumnetVariableLengthAmbiguity {

	static void PrintVariable(int ... array){
		System.out.print("PrintVariable(int ...): Колличество аргументов" + array.length + " Содержимое: ");
		for(int x : array)
			System.out.print(x + " ");
		System.out.println();
	}
	
	static void PrintVariable(boolean ... array){		
			System.out.print("PrintVariable(boolean ...): Колличество аргументов" + array.length + " Содержимое: ");
			for(boolean x : array)
				System.out.print(x + " ");
			System.out.println();
	}
	
	//если обьявить два таких метода, то 1*
	//static void PrintVariable(int ... array);
	//static void PrintVariable(int i, int ... array);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintVariable(1, 2, 3);
		PrintVariable(true, false, true);
		//PrintVariable(); вызовет ошибку, т.к. компилятор не сможет понять к какому перегружаемому методу отнести данный вызов, 
		//неоднозначный вызов
		
		//1* - неоднозначый вызов для компилятора, т.к. не понятно какой перегнружаемый метод выполнить
		//PrintVariable(1);
	}

}
