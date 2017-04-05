//Глава 12
//Аннотации-маркеры
//стр. 343

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface myMarker{} //аннотация-маркер не имеет членов



public class AnnotationMarker {
	//аннотация-маркер
	@myMarker
	public static void myMeth() {
		AnnotationMarker obj = new AnnotationMarker();
		try {
			Method m = obj.getClass().getMethod("myMeth");
			if(m.isAnnotationPresent(myMarker.class))
				System.out.println("Аннотация-маркер myMarker присутствует.");
		} catch(NoSuchMethodException e) {
			System.out.println("Метод не найден.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
