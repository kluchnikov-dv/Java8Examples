package p1;

class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("Конструктор класса в этом же пакете. Обьявляем обьект класса Protection.");
	
		System.out.println("p.n = " + p.n);
		//Переменная доступна только в классе Protection
		//System.out.println("p.n_pri = " + p.n_pri);
		System.out.println("p.n_pro = " + p.n_pro);
		System.out.println("p.n_pub = " + p.n_pub);		
	}
}
