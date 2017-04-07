//Глава 12
//Типовые аннотации
//стр. 349-350
//во хрень!

//все способы применения хер запомнишь
//то что касается типа параметра, х.з. что это ваще такое пока!!!
//что за уровень доступа к массиву???!!!
//что за оператор throws? пока рассказано только про throw - для создания собственного исключения


//Продемонстрировать применение нескольких типовых аннотаций
import java.lang.annotation.*;
import java.lang.reflect.*;

//Аннотация маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface TypeAnno{}

//Параметризированная аннотация, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
 @interface MaxLen{
	int value();
}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen{}

//Аннотация маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface Unique{}

//Аннотация, которую можно применить к параметру типа (пока не догнал для чего)
@Target(ElementType.TYPE_PARAMETER)
@interface What{
	String description();
}

//Аннотация, которую можно применить в обьявлении поля
@Target(ElementType.FIELD)
@interface EmptyOK{}

//Аннотация, которую можно применить в обьявлении метода
@Target(ElementType.METHOD)
@interface Recommended{}


//применить аннотацию в параметре типа
public class TypeAnnotation <@What(description = "Данные обобщенного типа") T> {
	
	//Применить типовую аннотацию в конструкторе
	public @Unique TypeAnnotation() {}
	
	//Аннотировать тип (в данном случае String), но не поле
	@TypeAnno String str;
	
	//Аннотировать тест поля
	@EmptyOK String test;
	
	//применить типовую аннотацию для аннотирования
	//ссылки this на обьект (получатель)
	
	public int f(@TypeAnno TypeAnnotation<T> this, int x) {
		return 10;
	}
	
	//аннотировать возвращаемый тип
	public @TypeAnno Integer f2(int j, int k){
		return (j + k);
	}
	
	//аннотировать обьявление метода
	public @Recommended Integer f3(String str) {
		return str.length() / 2; 
	}
	
	//применить типовую аннотацию в операторе throw
	public void f4() throws @TypeAnno NullPointerException {
		//...
	}
	
	//аннотировать уровни доступа к массиву
	String @MaxLen(10) [] @NotZeroLen [] w;
	
	//аннотировать тип элемента массива
	@TypeAnno Integer[] vec;
	
	public static void myMeth(int i) {
		//применить типовую аннотацию в аргументе типа
		TypeAnnotation <@TypeAnno Integer> ob = new TypeAnnotation<@TypeAnno Integer>();
		
		//применить типовую аннотацию в операторе new
		@Unique TypeAnnotation<Integer> ob2 = new @Unique TypeAnnotation<Integer>();
		
		Object x = new Integer(10);
		Integer y;
		//применить типовую аннотацию в приведении типов
		y = (@TypeAnno Integer) x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth(10);
	}
	
	//применить типовую аннотацию в выражении наследования
	class SomeClass extends @TypeAnno TypeAnnotation<Boolean> {}
}
