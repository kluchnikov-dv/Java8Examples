//Глава 7
//Рекурсия
//стр. 187

class factorial {
	int fact (int n){
		int result;
		if (n == 1) return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factorial f = new factorial();
		System.out.println("факториал 3 = " + f.fact(3));
		System.out.println("факториал 4 = " + f.fact(4));
		System.out.println("факториал 5 = " + f.fact(5));
		System.out.println("факториал 6 = " + f.fact(31)); //32 - переполнение стека
	}

}
