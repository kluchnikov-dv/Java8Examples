//Глава 12
//Повторяющиейся аннотации
//стр. 352-353

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(myAnnoRepeat.class)
@interface myAnno {
	String str() default "Тестирование";
	int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface myAnnoRepeat {
	myAnno[] value();
}

public class RepeatableAnnotations {

	//повторяем аннотацию myAnno для метода myMeth()
	@myAnno(str= "первая аннотация", val = -1)
	@myAnno(str= "вторая аннотация", val = 100)
	public static void myMeth(String s, int i) {		
		RepeatableAnnotations obj = new RepeatableAnnotations();
		try {
		Class <?> c = obj.getClass();
		Method m = c.getMethod("myMeth", String.class, int.class);
		//первый способ выода повторяющихся аннотаций
		//Annotation anno = m.getAnnotation(myAnnoRepeat.class);
		//System.out.println(anno);
		
		//второй способ вывода повторяющихся аннотаций
		Annotation[] anno = m.getAnnotationsByType(myAnno.class);
		for(Annotation a : anno)
			System.out.println(a);
				
		} catch(NoSuchMethodException e) {
			System.out.println("Метод не найден.");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth("тест", 1);
	}

}
