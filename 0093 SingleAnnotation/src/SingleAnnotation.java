//Глава 12
//Одночленные аннотации
//стр.344

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
//одночленная аннотация
@interface myAnno {
	int value(); //обязательно должен иметь имя value
	int param() default 0; //допускается включать еще члены со значением по умолчанию
}


public class SingleAnnotation {
	
	@myAnno(100) //допускается не указвать имя для одночленного параметра, другие параметры получают значения по умолчанию
	public static void myMeth() {
		SingleAnnotation obj = new SingleAnnotation();
		try {
			Method m = obj.getClass().getMethod("myMeth");
			myAnno anno = m.getAnnotation(myAnno.class);
			
			System.out.println(anno.value() + " " + anno.param());
		} catch(NoSuchMethodException e) {
			System.out.println("Метод не найден.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
