//Глава 7
//Введение в управление доступом
//стр.191

class stack {
	
	private int stkarray[] = new int[10];
	private int top;
	
	stack(){
		top = -1;
	}
	
	void push(int item) {
		if (top == 9) {
			System.out.println("Стек заполнен.");
		}
		else stkarray[++top] = item;
	}
	
	int pop() {
		if (top < 0) {
			System.out.println("Стек пустой.");
			return 0;
		}
		else return stkarray[top--];
	}
}


public class ControlAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st1 = new stack();
		stack st2 = new stack();
		
		//размещаем элементы в стеках
		for(int i = 0; i < 10; i++)
			st1.push(i);
		for(int i = 10; i < 20; i++)
			st2.push(i);
		
		//выводим элементы из стека
		System.out.println("st1.pop()");
		for(int i = 0; i< 10; i++)
			System.out.println(st1.pop());
		System.out.println("st2.pop()");
		for(int i = 0; i< 10; i++)
			System.out.println(st2.pop());
				
		//такое обращение к переменным вызовет ошибку компилятора
		//st1.top = 1;
		//st2.stkarray[3] = 100;
	}

}
