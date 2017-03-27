//Глава 9
//Применение интерфейсов
//стр 250-252

public class TestDynamicStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicStack ds1 = new DynamicStack(5);
		DynamicStack ds2 = new DynamicStack(8);
		
		for(int i = 0; i < 6; i++) ds1.push(i);
		for(int i = 0; i < 9; i++) ds2.push(i);
		
		for(int i = 0; i < 6; i++) System.out.print(" " + ds1.pop());
		System.out.println("\n");
		for(int i = 0; i < 9; i++) System.out.print(" " + ds2.pop());
		
	}

}
