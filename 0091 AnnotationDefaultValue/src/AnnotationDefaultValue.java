//Глава 12
//Использование значений по умолчанию в аннотациях
//стр. 342

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnno {
	String str() default "Значение по умолчанию.";
	int value() default 777;
}


public class AnnotationDefaultValue {
	
	@myAnno() //значения аннотации по умолчанию
	public static void myMeth() {
		AnnotationDefaultValue obj = new AnnotationDefaultValue();
		try {			
			
			Class <?> c = obj.getClass();
			
			Method m = c.getMethod("myMeth");
			
			myAnno anno = m.getAnnotation(myAnno.class);

			//если сократить код
			//myAnno anno = obj.getClass().getMethod("myMeth").getAnnotation(myAnno.class);
			System.out.println(anno.str() + " " + anno.value());
					
		} catch(NoSuchMethodException exc) {
			System.out.println("Нет такого метода.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
