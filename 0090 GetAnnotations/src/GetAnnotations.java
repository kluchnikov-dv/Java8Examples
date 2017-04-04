//Глава 12
//Получение всех антоаций
//стр. 340

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnno{
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface what {
	String description();
}

@what(description = "Аннотация класса")
@myAnno(str = "GetAnnotation", val = 99)
public class GetAnnotations {
	
	@what(description = "Аннотация метода")
	@myAnno(str = "myMeth", val = 100) 
	public static void myMeth(){
		
		GetAnnotations obj = new GetAnnotations();
		try{
			Annotation annos[] = obj.getClass().getAnnotations();			
			System.out.println("Все аннотации класса GetAnnotations:");
			for(Annotation a : annos)
				System.out.println(a);
			System.out.println();
			
			Method m = obj.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			System.out.println("Все аннотации метода myMeth:");
			for(Annotation a : annos)
				System.out.println(a);
		} catch(NoSuchMethodException exc) {
			System.out.println("Метод не найден.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
