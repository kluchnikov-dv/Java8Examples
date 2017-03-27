//Глава 9
//Переменные в интерфейсах
//стр. 253-254

import java.util.Random;

interface SharedConstants {
	int NO = 0;
	int YES = 1;
	int MAYBE = 3;
	int LATER = 4;
	int SOON = 5;
	int NEVER = 6;
}

class Question implements SharedConstants {
	Random rand = new Random();
	
	int ask() {
		int prob = (int) (100 * rand.nextDouble());
		if (prob < 30) return NO;
		else if (prob < 60) return YES;
		else if (prob < 75) return LATER;
		else if (prob < 98) return SOON;
		else return NEVER;
	}
}


public class VariableInterface implements SharedConstants{
	
	static void answer(int result) {
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
			case LATER:
				System.out.println("Позднее");
				break;
			case SOON:
				System.out.println("Вскоре");
				break;
			case NEVER:
				System.out.println("Никогда");
				break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		
	}

}
