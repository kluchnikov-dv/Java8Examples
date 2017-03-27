//Глава 9
//Применение интерфейсов
//стр 250-252

class DynamicStack implements IntStack {
	private int stack[];
	int top;
	
	DynamicStack(int num) {
		stack = new int [num];
		top = -1;
	}
	
	public void push(int item) {
		if(top == (stack.length - 1)) {
			int temp[] = new int[stack.length * 2];
			for(int i = 0; i < (stack.length); i++) temp[i] = stack[i];
			stack = temp;
			stack[++top] = item;
		}
		else stack[++top] = item;
	}
	
	public int pop() {
		if (top < 0) {
			System.out.println("Стек пуст.");
			return 0;			
		}
		else return stack[top--];
	}
}


public class DynamicStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
