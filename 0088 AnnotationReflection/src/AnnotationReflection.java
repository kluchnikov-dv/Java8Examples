//Глава 12
//Получение аннотаций методом рефлексии
//стр. 337-338
//для чего нужны анотации???
//где можно использовать???
//Нужно больше информации!!!

import java.lang.annotation.*;
import java.lang.reflect.*;

//Правило сохранения аннотаций (сохранять доступность аннотации во время выполнения)
@Retention(RetentionPolicy.RUNTIME)
//аннотация
@interface myAnno {
	String str();
	int val();
}


public class AnnotationReflection {	
	//аннотировать метод
	@myAnno(str = "Пример аннотации", val = 100)
	public static void myMeth() {
		//Получить аннотацию из метода и вывести значения ее членов
		try {
			AnnotationReflection obj = new AnnotationReflection();

			//Получить обьект типа Сlass, представляющий данный класс
			Class <?> c = obj.getClass();
			
			//Получить обьект типа Method, представляющий данный метод 
			Method m = c.getMethod("myMeth");

			//Получить аннотацию для данного класса
			myAnno anno = m.getAnnotation(myAnno.class);
			
			//вывести значения членов аннотации
			System.out.println(anno.str() + " " + anno.val());
					
			
		} catch(NoSuchMethodException exc) {
			System.out.println("Метод не найден.");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth();
	}

}
