//Глава 9
//Применение интерфейсов
//стр 250-252

public class TestReferenceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicStack ds = new DynamicStack(5);
		FixedStack fs = new FixedStack(8);
		
		IntStack is;
		is = ds;
		for(int i = 0; i < 12; i++) is.push(i);
		is = fs;
		for(int i = 0; i < 8; i++) fs.push(i);
		
		is = ds;
		System.out.println("Значения динамического стека: ");
		for(int i = 0; i < 12; i++) System.out.print(" " + is.pop());
		
		is = fs;
		System.out.println("\nЗначения фиксированного стека: ");
		for(int i = 0; i < 8; i++) System.out.print(" " + is.pop());
		
		is.clear();
		
	}

}
