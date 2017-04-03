//Глава 12
//Автоупаковка и автораспаковкав выражениях
//стр. 330-332


public class AutoPackerInExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1, obj2;
		int i;
		
		obj1 = 100;
		System.out.println("Значение obj1: " + obj1);
		
		++obj1; //автораспаковка-приращение-автоупаковка
		System.out.println("Значение после ++obj1: " + obj1);
		
		obj2 = obj1 + (obj1 / 3); //автораспаковка - вычисление - автоупаковка
		System.out.println("Значение после obj2 = obj1 + (obj1 / 3)" + obj2);
		
		i = obj1 + (obj1 / 3); //автораспкаовка - вычисление - присваение
		System.out.println("Значение после i = obj1 + (obj1 / 3)" + i);
		
		Integer iOb = 100;
		Double dOb = 98.6;
		
		dOb = iOb + dOb; //автораспаковка - вычисление - приведение типов
		System.out.println("Значение dOb = iOb + dOb: " + dOb);
		
		iOb = 2;
		
		switch(iOb) {
			case 1: 
				System.out.println("один");
				break;
			case 2:
				System.out.println("два");;
				break;
			default:
				System.out.println("ошибка");
		}
		
	}

}
