//Глава 9
//Применение интерфейсов
//стр 258

public interface IntStack {
	void push(int item); //поместить элемент стека
	int pop();			 //извлеч элемент стека
	
	default void clear() {
		System.out.println("\nМетод clear() не реализован в данном классе.");		
	}
}


