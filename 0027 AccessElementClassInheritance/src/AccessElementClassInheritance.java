//Глава 8
//Доступ к членам класса и наследование
//стр. 211

class A {
	int i;
	private int j;
	
	void setij(int x, int y){
		i = x;
		j = y;
	}
}

class B extends A {
	int total;
	
	void sum(){
		//total = i + j; //ошибка компиляции j не доступен в этом класе
	}
}

public class AccessElementClassInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B tempB = new B();
		tempB.setij(1, 2);
		tempB.sum();
		System.out.println("Сумма i + j равна: " + tempB.total);
	}

}
