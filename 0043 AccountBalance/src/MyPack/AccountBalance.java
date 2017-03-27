package MyPack;

class Balance {
	String name;
	double bal;
	
	Balance(String n, double b) {
		name = n;
		bal = b;
	}
	
	void show() {
		if (bal < 0) System.out.print("-->");
		System.out.println(name + ": $" + bal);
	}
}

class AccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance current[] = new Balance[3];
		
		current[0] = new Balance("Иванов В.В.", 122.31);
		current[1] = new Balance("Петров С.С.", 149.67);
		current[2] = new Balance("Иванов В.В.", -12.31);
		
		for(int i = 0; i < 3; i++) current[i].show();
	}

}
