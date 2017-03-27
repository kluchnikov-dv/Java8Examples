//Глава 9
//Применение интерфейсов
//стр 250-252

class FixedStack implements IntStack {
	private int[] stack; //стек где хранятся элементы 
	private int top;     //указатель стека 
	
	FixedStack(int num) {
		stack = new int[num]; //выделяем место под стек заданного размера
		top = -1;             //вершина стека = -1, т.к. элеметов нет
	}
	
	public void push(int item) {
		if(top < (stack.length - 1)) stack[++top] = item;
		else System.out.println("Стек заполнен!");
	}
	
	public int pop() {
		if (top == -1) {
			System.out.println("Стек пуст!");
			return 0;
		}
		else return stack[top--];
	}
}

public class FixedStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack fs1 = new FixedStack(5);
		FixedStack fs2 = new FixedStack(8);
		
		for(int i = 0; i < 5; i++) fs1.push(i);
		for(int i = 0; i < 8; i++) fs2.push(i);
		
		System.out.println("Значения стека fs1: ");
		for(int i = 0; i < 5; i++) System.out.print(fs1.pop() + " ");
		System.out.println("\nЗначения стека fs2: ");
		for(int i = 0; i < 8; i++) System.out.print(fs2.pop() + " ");
	}

}
