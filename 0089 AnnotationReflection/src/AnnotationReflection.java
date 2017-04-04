//Глава 12
//Аннотация - второй пример рефлексии, c передачей параметров
//стр.339
//для чего нужны анотации???
//где можно использовать???
//Нужно больше информации!!!

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnno {
	String str();
	int val();
}


public class AnnotationReflection {
	
	@myAnno(str = "Пример аннотации", val = 100)
	public static void myMeth(String str, int i) {
		AnnotationReflection obj = new AnnotationReflection();
		try {
			Class <?> c = obj.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			myAnno anno = m.getAnnotation(myAnno.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch(NoSuchMethodException exc) {
			System.out.println("Метод не найден.");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth("Параметр", 10);
	}

}
