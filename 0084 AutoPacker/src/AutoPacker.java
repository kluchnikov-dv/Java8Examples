//Глава 12
//Автоупаковка
//стр. 329
public class AutoPacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iObj = 100; //автоупаковка //нет необходимости вызывать обьект метод new 
		int i = iObj; //автораспаковка //Нет необходимости вызвать метод iObj.intValue()
		System.out.println("Значение iObj: " + iObj);
		System.out.println("Значение i: " + i);
	}

}
