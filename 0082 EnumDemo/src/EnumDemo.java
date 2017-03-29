//Глава 12

//Пример использования перечисления
//Переделанный пример из главы 9

//стр. 325
import java.util.Random;

//само перечисление
enum Answer {
	NO, YES, MAYBE, LETER, SOON, NEVER
}


class Question {
	Random r = new Random();
	
	Answer ask() {
		int result = (int) (100 * r.nextDouble());
		if(result < 15) return Answer.MAYBE;
		else if(result < 30) return Answer.LETER;
		else if(result < 60) return Answer.YES;
		else if(result < 75) return Answer.SOON;
		else if(result < 98) return Answer.NO;
		else return Answer.NEVER;
	}
	
}


public class EnumDemo {
	
	//статичекая функция с выводом результата по значению перечисления
	static void printanswer(Answer result) {
		switch(result) {
			case NO: 
				System.out.println("Нет");
				break;
			case YES: 
				System.out.println("Да");
				break;
			case MAYBE: 
				System.out.println("Возможно");
				break;
			case LETER: 
				System.out.println("Позже");
				break;
			case SOON: 
				System.out.println("Вскоре");
				break;
			case NEVER: 
				System.out.println("Никогда");
				break;				
		}
	}
		
	public static void main(String args[]) {
		Question q = new Question();
		
		printanswer(q.ask());
		printanswer(q.ask());
		printanswer(q.ask());
		printanswer(q.ask());
		
	}
}
