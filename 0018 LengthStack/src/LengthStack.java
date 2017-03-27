//Глава 7
//Еще раз о массивах
//стр 196

class stack {
	private int stackarray[];
	private int top;
	
	stack(int size){
		stackarray = new int[size];
		top = -1;
	}
	
	void push(int item){
		if (top == stackarray.length - 1)
			System.out.println("стек переполнен");
		else
			stackarray[++top] = item;
	}
	
	int pop(){
		if (top < 0){
			System.out.println("стек пуст");
			return 0;
		}
		else 
			return stackarray[top--];
	}
}

public class LengthStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st1 = new stack(8);
		stack st2 = new stack(5);
		
		//присваиваем значения элементам
		for(int i = 0; i < 8; i++) st1.push(i);
		for(int i = 0; i < 5; i++) st2.push(i);
		
		//извлекаем элементы из стека
		System.out.println("Значения st1: ");
		for(int i = 0; i < 8; i++)
			System.out.print(st1.pop() + " ");
		System.out.println("\nЗначения st2: ");
		for(int i = 0; i < 5; i++)
			System.out.print(st2.pop() + " ");
		
		
	}

}