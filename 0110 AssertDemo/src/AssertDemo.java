//Глава 13
//Применение ключевого слова assert
//стр. 385
//для работы данной программы необходимо запускать ее с командной строки с ключом -ea
//чтобы разрешить проверку утверждений


public class AssertDemo {
	
	static int val = 3;
	
	static int getval() {
		return val--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;		
		for (int i = 10; i > 0; i--) {		
			//данное выражение работоспособно с ключом -ea
			//но при обычном запске метод getval даже не будет вызван
			//assert (n = getval()) > 0 : "n отрицательное!";
			n = getval();			
			assert n > 0 : "n отрицательное!";

			System.out.println("n ранво " + n);
		}
	}

}
