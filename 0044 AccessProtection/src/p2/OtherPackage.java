package p2;

class OtherPackage {
	OtherPackage() {
		p1.Protection p = new p1.Protection();
		System.out.println("конструтор класса Protection из пакета p2");
		
		//Переменная достпуна только для класса Protection и классов в пакете p1
		//System.out.println("p.n = " + p.n);
		
		//Переменная достпуна только для класса Protection
		//System.out.println("p.n_pri  = " + p.n_pri);
		
		//Переменная доступна только для класса Protection, классов в пакете p1, подкласса Protection
		//System.out.println("p.n_pro" + p.n_pro);

		System.out.println("p.n_pub" + p.n_pub);
	}
}
