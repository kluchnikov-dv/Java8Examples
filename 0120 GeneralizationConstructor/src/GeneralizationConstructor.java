//Глава 14
//Обобщенные конструкторы
//стр. 417

class GenConst {
	double num;
	
	//обобщенный конструктор
	<T extends Number>
	GenConst(T val) {
		num = val.doubleValue();
	}
	
	void show_num() {
		System.out.println("Значение num = " + num);
	}
}


public class GeneralizationConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenConst obj1 = new GenConst(10);
		GenConst obj2 = new GenConst(4.53F);
		
		obj1.show_num();
		obj2.show_num();
	}

}
