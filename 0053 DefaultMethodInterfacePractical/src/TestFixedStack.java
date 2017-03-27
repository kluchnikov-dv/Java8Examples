//Глава 9
//Применение интерфейсов
//стр 250-252

public class TestFixedStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack fs1 = new FixedStack(5);
		FixedStack fs2 = new FixedStack(8);
		
		for (int i = 0; i < 5; i++) fs1.push(i);
		for (int i = 0; i < 8; i++) fs2.push(i);
		
		for (int i = 0; i < 5; i++) System.out.print(" " + fs1.pop());
		System.out.println("\n");
		for (int i = 0; i < 8; i++) System.out.print(" " + fs2.pop());
	}

}
