package p1;

class Derived extends Protection{
	Derived() {
		System.out.println("Конструктор подкласса в пакете p1.");
		
		System.out.println("n = " + n);
		//эта переменая доступна только для класса Protection
		//System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);				
	}
}
