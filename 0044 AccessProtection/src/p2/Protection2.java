package p2;

class Protection2 extends p1.Protection{
	Protection2() {
		System.out.println("Конструктор класса Protection2 в пакете p2, унаследованный от Protection в пакете p1");
		
		//Переменная доступна только классу Protected и классам пакета p1
		//System.out.println("n = " + n);
		
		//Переменная доступна только классу Protected
		//System.out.println("n_pri = " + n_pri);
		
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
		
	}

}
