// Глава 1-7 
// на разные темы 81 пример - следовательно 81 проект
// стр 1 - 176

class Box{
	double width;  //ширина
	double height; //высота
	double depth;  //глубина

	Box(){
		System.out.println("Конструирование обьекта Box и инициализация переменных.");
		width = 10;
		height = 10;
		depth = 10;
	}
	/*
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}*/
	
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	void volume(){
		System.out.print("Объем куба равен:");
		System.out.println(width * height * depth);
	}
	
	double volume2(){
		return(width * height * depth);
	}
	
	void SetParam(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	protected void finalize(){
		//тело, что то типа деструктора в с++
	
	}
}


class Stack {
	int st[] = new int[10];
	int point;
	
	Stack(){
		point = -1;
	}
	
	void push(int item){
		if (point == 9 ) System.out.println("Стек заполнен");
		else st[++point] = item;
	}
	
	int pop(){
		if (point < 0) {
			System.out.println ("Стек пуст");
			return 0;
		}
		else return st[point--];
	}
}

public class HelloWorld {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		/* Аплет - особый вид прикладной программы на Java, предназначенный для передачи по сети интернет и автоматического выполнения в совместимом 
		 * с Java браузере.
		 * 
		 * Безопасность достигается посрелствам динамически исполняющей java средой
		 * 
		 * Переносимость программ тоже достигается посредством испоняющей java среды
		 * 
		 * Три принципа ООП
		 * 1. Инкапсуляция -механизм связывающий код и данные, которыми он манипулирует и защищает от внешнего вмешательства 
		 * 2. Наследование - обьявление в результате которого одни обьект наслоедует свойства (переменные и методы) другого обьекта 
		 * 3. Полиморфизм - принцип ООП ползволяющий использовать один и тот же интерфес для общего класса действий (один интерфейс - несколько методов) 
		 * 
		 * Класс - логическая конструкция
		 * Обьект - физическое воплощение класса
		 * 
		 */
		/**
		 документирующий коментарий
		 */
		/*********************************************************************************************************************************************/
		System.out.println("\nПример 1\n");
		System.out.println("Простая программа на Java.");
		
		/*********************************************************************************************************************************************/
		System.out.println("\nПример 2\n");
		int num = 100;
		System.out.println("Значение переменной num: " + num);
		num = num * 2;
		System.out.println("Значение переменной num * 2: " + num);
		
		/*********************************************************************************************************************************************/
		System.out.println("\nПример 3\n");
		for (int i = 0; i <= 10; i++){
			if (i != 5){
				System.out.println(i);	
			}
			else{
				System.out.println("Тут пропустили num == 5");								
			}
		
		}
		
		/*********************************************************************************************************************************************/
		//Целые типы
		byte  a, k1; //от -128 до 127
		short c, d; //от -32768 до 32767
		int   e, f; //от -2147483648 до 2147483647
		long  g;    //от -9223372036854775808 до -9223372036854775807
		
		//пример использования типа long (какое растояние пройдет свет за 1000 дней)
		System.out.println("\nПример 4\n");
		int lightspeed = 299792458; //скорость света м/с
		long days = 1000;    		//количество дней
		long seconds;
		long distance;
		seconds = days * 24 * 60 * 60; //Подсчитали количество секун в днях
		distance = seconds * lightspeed; //растояние которое пройдет свет за 1000 дней
		System.out.println("За " + days + " дней свет пройдет растояние \n" + distance + " метров \n или \n" + distance/1000 + " километров.");
		
		/*********************************************************************************************************************************************/
		//Числа м плавающей точкой
		float i1;  //от 1,4е-45 до 3,4е+38
		double j1; //от 4,9е-324 до 1,8е+308
		
		//пример использования  чисел с плавающей точкой (вычисляем площадь круга S круга = p*r*r)
		System.out.println("\nПример 5\n");
		double pi, r, S_circle;		
		r = 10.8; //радиус круга
		pi = 3.1416; //константа pi
		S_circle = pi * r * r;
		System.out.println("Площадь круга равна: " + S_circle);
		
		/*********************************************************************************************************************************************/
		//символьный тип char в java 16 разрядный представлен Unicode и диапазон допустимых значений 65535
		// пример использования
		System.out.println("\nПример 6\n");
		char ch1, ch2;
		ch1 = 88;
		ch2 = 'Y';		
		System.out.println("ch1 и ch2: " + ch1 + " и " + ch2);
		
		/*********************************************************************************************************************************************/
		//с символами допускаются арифметические действия, пример
		System.out.println("\nПример 7\n");
		char ch0 = 'X';
		System.out.println("Значение переменной ch0: " + ch0);
		ch0++;
		System.out.println("Значение переменной сh0 после увеличения на 1: " + ch0);
		
		/*********************************************************************************************************************************************/
		//пример использования логического значения boolean
		System.out.println("\nПример 8\n");
		boolean b;
		b = false;
		System.out.println("b равно: " + b);
		b = true;
		System.out.println("b равно: " + b);
		
		if (b) System.out.println("Этот код выполняется. ");
		b = false;
		if(b) System.out.println("Это код не выполняется. ");
		
		System.out.println("10 > 9 равно: " + (10 > 9));
		
		/*********************************************************************************************************************************************/
		//целочисленные литералы
		System.out.println("\nПример 9\n");
		//в десятичной системе
		int a1 = 123456789;
		System.out.println("a1: " + a1);
		//в восьмеричной системе исчисления
		int a2 = 0275;
		System.out.println("a2: " + a2);
		//в шетснадцатиричной системе исчисления
		int a3 = 0x8f3;
		System.out.println("a3: " + a3);
		//в двоичной системе исчисления
		int a4 = 0b010010;
		System.out.println("a2: " + a4);
		//пример применения символов подчеркивания в целых числах, компилятором игнорируются
		//но визуально такие числа воспринимаются лучше
		int a5 = 123_456_789;
		int a6 = 0b0110_1110_0101_0100;
		System.out.println("a5: " + a5);
		System.out.println("a6: " + a6);
		
		/*********************************************************************************************************************************************/		
		//литералы с плавающей точкой
		System.out.println("\nПример 10\n");
		//явное указание типа double
		double d1 = 2.0d;		 
		//по умолчанию литерам с точкой присваивается тип double
		double d2 = 3.14156;
		//явное указание типа float
		float  d3 = 3.14156f;
		//указание степени
		double d4 = 3.12e12;
		double d5 = 3.12e-12;
		double d6 = 2e+122;
		//в шестнадцетиричной системе исчисления в степени (двоичный порядок)
		double d7 = 0x12.2P2;
		//указание литерала с симоволами подчеркивания для наглядности, компилятор их пропускает
		double d8 = 9_232_122_120.121_121;
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		System.out.println("d4 = " + d4);
		System.out.println("d5 = " + d5);
		System.out.println("d6 = " + d6);
		System.out.println("d7 = " + d7);
		System.out.println("d8 = " + d8);
		
		/*********************************************************************************************************************************************/		
		//Логические литералы исключительно равны true и false (true не равен 1, а false не равен 0)
		System.out.println("\nПример 11\n");
		boolean b1 = true;
		boolean b2 = false;
		if (b1 == true) System.out.println("b1 = " + b1);
		if (b2 == false) System.out.println("b2 = " + b2);
		
		/*********************************************************************************************************************************************/		
		//Символьные литералы
		System.out.println("\nПример 12\n");		
		
		System.out.println('\'');
		System.out.println('\"');
		System.out.println('\\');
		System.out.println('\r');
		System.out.println('\n');
		System.out.println('\f');
		System.out.println('\t');
		System.out.println('\b');
		//ввод символов в шестнадцатиричной системе исчисления из таблицы Unicode
		System.out.println('\ua432');
		//ввод символов в восьмеричной системе исчисления из таблицы Unicode
		System.out.println('\141');
		
		/*********************************************************************************************************************************************/		
		//Символьные строки (строки реализованы в виде обьектов)
		System.out.println("\nПример 13\n");
		
		System.out.println("Hello World");
		System.out.println("Две \n \t линии с табом");
		System.out.println("\"Строка в ковычках\"");
		
		/*********************************************************************************************************************************************/		
		//Переменные
		System.out.println("\nПример 14\n");
		
		int l1, l2, l3;
		int l4 = 3, l5, l6 = 5;
		byte l7 = 22;
		double l8 = 3.14159;
		char l9 = 'd';
		//не инициализированные элементы вывести не удастяся, ругается компилятор
		System.out.println(" l4 = " + l4 + " l6 = " + l6 + " l7 = " + l7 + " l8 = " + l8 + " l9 = " + l9);
		
		//Динамическая инициализация		
		double kat1 = 3.0, kat2 = 4.0;
		double gip = Math.sqrt(kat1 * kat1 + kat2 * kat2);
		System.out.println("Длина гипотенузы = " + gip);
		
		/*********************************************************************************************************************************************/		
		//Переменные
		System.out.println("\nПример 15\n");
		//область действия переменных
		int x1; //эта переменная доступна всему коду из метода main()\		
		x1 = 10;
		if (x1 == 10){
			int y1 = 20;
			System.out.println("x1 и у1 " + x1 + " " + y1);
			x1 = y1 * 2;			
		}
		//y1 = 100; эта переменная не доступна в этом месте кода
		System.out.println("x1 = " + x1);
		
		//Срок действия переменной
		System.out.println("\nПример 16\n");
		for (int x2 = 0; x2 < 3; x2++){
			System.out.println("x2 = " + x2);
			int y2 = -1;
			System.out.println("y2 = " + y2);
			y2 = 100;
			System.out.println("теперь y2 = " + y2);
		}
		
		int bar = 1;
		{
			//int bar = 2; нельзя повторно обьявить переменную несмотря на то что она во вложенном блоке		
		}
		
		/*********************************************************************************************************************************************/		
		//Приведение типов
		System.out.println("\nПример 17\n");
		int c1 = 257;
		byte c2;
		double c3 = 323.142;
		System.out.println("Преобразование типа int в byte.");		
		c2 = (byte) c1;
		System.out.println(" c2 и c1 " + c2 + " " + c1);
		System.out.println("Преобразование типа double в int.");
		c1 = (int) c3;
		System.out.println(" c1 и c3 " + c1 + " " + c3);
		System.out.println("Преобразование типа double в byte.");
		c2 = (byte) c3;
		System.out.println(" c2 и c3 " + c2 + " " + c3);
		
		//Это отступление для того чтобы просмотреть всю таблицу UNICODE
		/*
		char ch10 = 0; 
		for ( int i1 = 0; i1 < 65535; i1++){
			ch10 = (char) i1;
			if (i1%20 == 0) System.out.print("\n");
			System.out.print(ch10 + " ");
		}
		*/
		
		//Автоматическое приведение типов
		byte a10 = 40;
		byte b10 = 50;
		byte c10 = 100;
		int d10 = a10 * b10 / c10; //При умножении a10 на b10 происходит вычисление промежуточного значения в int целочисленном формате
		System.out.println ("d10 = " + d10);
		
		byte b11 = 50;
		//b11 = b11 * 2; приведет к ошибке компиляции, т.к. b11 byte размера 
		b11 = (byte) (b11 * 2);
		System.out.println ("b11 = " + b11); //а тут приводим к типу
		
		
		//Пример применения правил продвижения типов
		byte  b12 = 42;
		char  c12 = 'a';
		short s12 = 1024;
		int   i12 = 50000;
		float f12 = 5.67f;
		double d12 = .1234;
		double result = (f12 * b12) + (i12 / c12) - (d12 * s12); //в каждой операции побеждает тип с большим числом разрядов
		System.out.println("result = " + result);
		
		/*********************************************************************************************************************************************/		
		
		System.out.println("\nПример 18\n");
		String name_months[] = {"Январь", "Февраль", "Март",
								"Апрель", "Май", "Июнь",
								"Июль", "Август", "Сентябрь",
								"Октябрь", "Ноябрь", "Декабрь"};		
		//Массив - это группа однотипных переменных с общим именем, для доступа к которым используется индекс
		int month_days[] = new int[12];		
		//количество дней в месяце		
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		System.out.println("Количество дней в каждом месяце года:");
		for (int i = 0; i < 12; i++){
			System.out.print(month_days[i] + " ");
			System.out.println(name_months[i]);			
		}
		
		System.out.println("Количество дней в каждом месяце года, динамически проинициализрованных при обьявлении:");
		int month_days2 [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < 12; i++){			
			System.out.print(month_days2[i] + " ");
			System.out.println(name_months[i]);
		}
		
		System.out.println("\nПример 19\n");
		//пример вычисления среднего значения
		double nums[] = {10.1, 11.2, 12.3, 13.4, 14,5};
		double result2 = 0;
		for (int i = 0; i < 5; i++){
			result2 = result2 + nums[i];
		}
		System.out.println("Среднее значение массива nums[] = " + result2/5);
				
		System.out.println("\nПример 20\n");
		//пример использования двухмерного массива
		int twoD[][] = new int[4][5];
		int k5 = 0;
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				twoD[i][j] = k5;
				k5++;
			}
		}
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nПример 21\n");
		//В многомерном массиве достаточно указать память для первого элемента, последующие можно обьявть позже
		int twoD2 [][] = new int [4][];
		twoD2[0] = new int [1];
		twoD2[1] = new int [2];
		twoD2[2] = new int [3];
		twoD2[3] = new int [4];
		
		int k6 = 0;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < i+1; j++){
				twoD2[i][j] = k6;
				k6++;
			}
		}
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < i+1; j++){
				System.out.print(twoD2[i][j] + " ");				
			}
			System.out.println();
		}
		
		System.out.println("\nПример 22\n");
		//Пример инициализации двухмерного масива		
		double m[][] = {
				{0 * 0, 0 * 1, 0 * 2, 0 * 3},
				{1 * 0, 1 * 1, 1 * 2, 1 * 3},
				{2 * 0, 2 * 1, 2 * 2, 2 * 3},
				{3 * 0, 3 * 1, 3 * 2, 3 * 3}
		};
		
		for (int i = 0; i < 4; i++){
			for ( int j = 0; j < 4; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nПример 23\n");
		//Пример трехмерного масива
		int threeD[][][] = new int [3][4][5];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				for (int k = 0; k < 5; k++){
					threeD[i][j][k] = i * j * k;
				}
			}
		}
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 4; j++){
				for (int k = 0; k < 5; k++){
					System.out.print(threeD[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//равнозначные обьявления массива
		int[] m1 = new int[3];
		int m2[] = new int[3];
		
		char chD1[][] = new char[3][2];
		char[][] chD2 = new char[3][2];
		
		
		int[] m3, m4, m5; //такая форма обьявления удобна для обьявления нескольких массивов
		//int m3[], m4[], m5[]; //равнозначное обьявление, но приходится строчить скобки
		
		/*********************************************************************************************************************************************/				
		System.out.println("\nПример 24\n");
		//Пример использования строковой переменной
		String str = "Это тестовая строка!";
		System.out.println(str);
		
		/*********************************************************************************************************************************************/				
		System.out.println("\nПример 25\n");
		//Основные арифметические операции целые чилса
		int a9 = 1 + 1;
		int b9 = a9 * 3;
		int c9 = b9 / 4;
		int d9 = c9 - a9;
		int e9 = -d9;
		System.out.println("a9 = " + a9);
		System.out.println("b9 = " + b9);
		System.out.println("c9 = " + c9);
		System.out.println("d9 = " + d9);
		System.out.println("e9 = " + e9);
		//Основные арифметические операции вещественные чилса
		double da9 = 1 + 1;
		double db9 = da9 * 3;
		double dc9 = db9 / 4;
		double dd9 = dc9 - da9;
		double de9 = -dd9;
		System.out.println("da9 = " + da9);
		System.out.println("db9 = " + db9);
		System.out.println("dc9 = " + dc9);
		System.out.println("dd9 = " + dd9);
		System.out.println("de9 = " + de9);
		
		System.out.println("\nПример 26\n");
		//деление по модулю
		int x = 42;
		double y = 42.25;		
		System.out.println("x mod 10 =  " + x%10);
		System.out.println("y mod 10 =  " + y%10);
		
		System.out.println("\nПример 27\n");
		//составные операции
		int asost = 1;
		int bsost = 2;
		int csost = 3;
		asost += 5;
		bsost *= 4;
		csost += asost * bsost;
		csost %= 6;
		
		System.out.println("asost = " + asost);
		System.out.println("bsost = " + bsost);
		System.out.println("csost = " + csost);

		System.out.println("\nПример 28\n");
		//операции инкремента и декремента
		int aid = 1;
		int bid = 2;
		int cid;
		int did;
		
		cid = ++bid;
		did = aid++;
		cid++;
		System.out.println("aid = " + aid);
		System.out.println("bid = " + bid);
		System.out.println("cid = " + cid);
		System.out.println("did = " + did);
		
		
		byte bporaz = 42;
		bporaz = 0b00100101 | 0b00001011; //2+6+64=72 2+4+16=22 00101111=2+4+8+16+64=94
		System.out.println("bporaz = " + bporaz);
		
		System.out.println("\nПример 29\n");
		//пример пораязрядных операций
		String binary[] = {
			"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
			"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
			};
		int ap = 3;
		int bp = 6;
		int cp = ap | bp;
		int dp = ap & bp;
		int ep = ap ^ bp;
		int fp = (~ap & bp) | (ap & ~bp);
		int gp = ~ap & 0x0f;
		
		System.out.println("ap = " + binary[ap]);
		System.out.println("bp = " + binary[bp]);
		System.out.println("ap | bp= " + binary[cp]);
		System.out.println("ap & bp= " + binary[dp]);
		System.out.println("ap ^ bp= " + binary[ep]);
		System.out.println("(~ap & bp) | (ap & ~bp)= " + binary[fp]);
		System.out.println("~ap & 0x0f = " + binary[gp]);
		
		System.out.println("\nПример 30\n");
		//пример арифметического сдвига влево
		byte a7 = 64, b7; //64 = 0b1000000
		int i7;
		i7 = a7 << 2; //при выполнении операции сдвига число умножается на 2, но автоматически приводится к типу int, поэтому не теряет старший разряд
		b7 = (byte) (a7 << 2); // а вот в данном случае автоматическое приведение к типу int явно обратно приводят к byte
		System.out.println("Первоначальное зачение a7 = " + a7);
		System.out.println("i7 = " + i7);
		System.out.println("b7 = " + b7);
		
		System.out.println("\nПример 31\n");
		//пример использования сдвига умножения чилса на 2, когда 1 попадает на 31-ую позицию, число становится отрицательным 
		int num1 = 0xffffffe;
		for (int i =0; i < 40; i++){
			num1 = num1 << 1;
			System.out.println(num1);
		}
		
		System.out.println("\nПример 32\n");
		//пример использования сдвига вправо, деление чилса на 2		
		int a8 = 32; //0b100000
		System.out.println("a8 до сдвига вправо на 2 разряда= " + a8);
		a8 = a8 >> 2;
		System.out.println("a8 после сдвига = " + a8);
		//пример потери младших разрядов при сдвиге вправо
		System.out.println("\nПример 33\n");
		int a11 = 35; //0b100011
		System.out.println("a11 до сдвига вправо на 2 разряда= " + a11);
		a11 = a11 >> 2;
		System.out.println("a11 после сдвига = " + a11);
		//пример сдвига вправо отрицательного значения (старшие разряды заполняются единицами)
		System.out.println("\nПример 34\n");
		int a12 = -8; //0b100011
		System.out.println("a12 до сдвига вправо на 1 разряд= " + a12);
		a12 = a12 >> 1;
		System.out.println("a12 после сдвига = " + a12);
		
		//пример перевода byte в 16-ую запись
		System.out.println("\nПример 35\n");
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		byte b3 = (byte) 0xf1;
		System.out.println( "b3 = 0x" + hex[(b3 >> 4) & 0x0f] + hex[b3 & 0x0f]);
		byte b4 = (byte) 0xac;
		System.out.println("b4 = 0x" + hex[(b4 >> 4) & 0x0f] + hex[b4 & 0x0f]);
		
		//пример перевода int в 16-ую запись
		System.out.println("\nПример 36\n");
		int a13 = 0xfafffcff;
		System.out.println("a13 = 0x" + hex[(a13 >> 32) & 0x0000000f] + 
										hex[(a13 >> 28) & 0x0000000f] + 
										hex[(a13 >> 24) & 0x0000000f] + 
										hex[(a13 >> 20) & 0x0000000f] + 
										hex[(a13 >> 16) & 0x0000000f] + 
										hex[(a13 >> 12) & 0x0000000f] + 
										hex[(a13 >> 8) & 0x0000000f] + 
										hex[(a13 >> 4) & 0x0000000f] + 
										hex[a13 & 0x0000000f]);

		//пример беззнакового сдвига вправо >>>
		System.out.println("\nПример 37\n");
		int a14 = -1;
		a14 = a14 >>> 24;
		System.out.println("a14 = " + a14);
		
		//беззнаковый сдвиг byte
		System.out.println("\nПример 38\n");
		byte b5 = (byte) 0xf1;
		byte c5 = (byte) (b5 >> 4);
		byte d13 = (byte) (b5 >>> 4);
		byte e5 = (byte) ((b5 & 0xff) >> 4);
		System.out.println("b5 = 0x" + hex[(b5 >> 4) & 0x0f] + hex[b5 & 0x0f] + " = " + b5);
		System.out.println("c5 = 0x" + hex[(c5 >> 4) & 0x0f] + hex[c5 & 0x0f] + " = " + c5);
		System.out.println("d13 = 0x" + hex[(d13 >> 4) & 0x0f] + hex[d13 & 0x0f] + " = " + d13);
		System.out.println("e5 = 0x" + hex[(e5 >> 4) & 0x0f] + hex[e5 & 0x0f] + " = " + e5);
				
		//Порразрядные составные операции с присваиванием
		System.out.println("\nПример 39\n");
		int a15 = 1; //0b0001
		int b6 = 2;  //0b0010
		int c6 = 3;  //0b0011
		
		a15 |= 4; //0b0001 |0b0100 = 0b0101 = 5 
		b6 >>= 1; //0b0010 >> 1 = 0b0001 = 1
		c6 <<= 1; //0b0011 << 1 = 0b0110 = 6  
		a15 ^= c6;//0b0101 ^ 0b0110 = 0011 = 3 
		              
		System.out.println("a15 = " + a15); //3
		System.out.println("b6 = " + b6);   //1
		System.out.println("c6 = " + c6);   //6
		
		//Порразрядные составные операции с присваиванием
		System.out.println("\nПример 40\n");
		int a16 = 4;
		int b8 = 1;
		boolean c7 = a16 < b8;
		System.out.println("c7 = " + c7);
		
		
		//Логические операции
		System.out.println("\nПример 41\n");
		boolean a20 = true;
		boolean b20 = false;
		boolean c20 = a20 | b20;
		boolean d20 = a20 & b20;
		boolean e20 = a20 ^ b20;
		boolean f20 = (!a20 | b20) | (a20 | !b20);
		boolean g20 = !a20;
		
		System.out.println(" a20 = " + a20);
		System.out.println(" b20 = " + b20); 
		System.out.println(" c20 = a20 | b20 = " + c20);
		System.out.println(" d20 = a20 & b20 = " + d20);
		System.out.println(" e20 = a20 ^ b20 = " + e20);
		System.out.println(" f20 = (!a20 | b20) | (a20 | !b20) = " + f20);
		System.out.println(" g20 = !a20 = " + g20);
		
		
		//укороченные логические операции
		System.out.println("\nПример 42\n");
		int num2 = 9;
		int denom = 0;
		if (denom != 0 && num2 / denom > 10) System.out.println("Эта строка напечатается только если denum != 0");
		else System.out.println("Деление num2 / denom не произошло, деление на 0 привело бы к исключению");
		
		//операция присваивания
		System.out.println("\nПример 43\n");
		int x3, y3, z3;
		x3 = y3 = z3 = 100;
		System.out.println("x3 = " + x3 + " y3 = " + y3 + " z3 = " + z3);
		
		//тернарная операция
		System.out.println("\nПример 44\n");
		float num3, denom3, ratio3;
		denom3 = 0;
		num3 = 5;
		ratio3 = denom3 == 0 ? 0 : num3 / denom3;
		System.out.println("ratio3 = " + ratio3);
		
		//пример вычисления абсолютного значения чилса при помощи тернарной операции
		System.out.println("\nПример 45\n");
		int a21, b21;
		a21 = 10;
		b21 = a21 < 0 ? -a21 : a21;
		System.out.println("Абсолютное значение а21 = " + a21 +" равно ABS(a21) = " + b21);
				
		a21 = -10;
		b21 = a21 < 0 ? -a21 : a21;
		System.out.println("Абсолютное значение а21 = " + a21 +" равно ABS(a21) = " + b21);
		
		//круглые скобки меняют порядок вычисления
		System.out.println("\nПример 46\n");
		int a22, b22;
		a22 = 256;
		b22 = 4;		
		a22 = a22 >> b22 + 3;
		System.out.println("a22 = a22 >> b22 + 3; == " + a22);
		
		a22 = 256;
		b22 = 4;	
		a22 = (a22 >> b22) + 3;
		System.out.println("a22 = a22 >> b22 + 3; == " + a22);
		
		//условный оператор if
		System.out.println("\nПример 47\n");		
		int a23 = 1, b23 = 2;
		System.out.println("a23 = " + a23 + " b32 = " + b23);		
		if (a23 < b23) a23 = 0;
		else b23 = 0;
		System.out.println("a23 = " + a23 + " b32 = " + b23);
		
		//пример вложенных условных операторов else, определяем время года
		System.out.println("\nПример 48\n");
		int month = 4;
		String season;
		if(month == 12 || month == 1 || month == 2) season = "зиме";
		else if (month == 3 || month == 4 || month == 5) season = "весне";
		else if (month == 6 || month == 7 || month == 8) season = "лету";
		else if (month == 9 || month == 10 || month == 11) season = "осени";
		else season = "такого месяца не существует, как и сезона к нему";
		System.out.println("Апрель относится к " + season + ".");

		//пример использования оператора switch значение выражения только byte, short, int, char + перечисление, String
		System.out.println("\nПример 49\n");
		for (int i = 0; i < 6; i++){
			switch (i){
				case 0: 
					System.out.println("i равно нулю.");
					break;
				case 1:
					System.out.println("i равно единице");
					break;
				case 2:
					System.out.println("i равно двум");
					break;
				case 3:
					System.out.println("i равно трем");
					break;
				default: 
					System.out.println("i больше трех");
			}
		}
		
		System.out.println("\nПример 50\n");
		
		for (int i = 0; i < 12; i++){
			switch (i){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
					System.out.println("i меньше 5");
					break;
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.println("i меньше 10");
					break;
				default:
					System.out.println("i больше равно 10");
			
			}
		}
		
		System.out.println("\nПример 51\n");
		
		int month2 = 7;
		String season2;
		switch (month2){
			case 12:
			case 1:
			case 2:
				season2 = "зиме";
				break;
			case 3:
			case 4:
			case 5:
				season2 = "весне";
				break;
			case 6:
			case 7:
			case 8:
				season2 = "лету";
				break;
			case 9:
			case 10:
			case 11:
				season2 = "осени";
			default:
				season2 = "нет такого месяца";
		}
		System.out.println("Июль месяц относится к " + season2 + ".");
		
		//с 7 версии java можно использовать тип String
		System.out.println("\nПример 52\n");
		String str2 = "Два";
		switch (str2){
			case "Один":
				System.out.println("Один");
				break;
			case "Два":
				System.out.println("Два");
				break;
			case "Три":
				System.out.println("Три");
				break;
			default:
				System.out.println("Не совпало.");
		}
		
		//цилк while		
		System.out.println("\nПример 53\n");
		int n = 10;
		while (n > 0){
			System.out.println("такт " + n);
			n--;
		}
		
		int a24 = 10, b24 = 20;
		while (a24 > b24) System.out.println("Это тело цикла не будет выполнено ни разу");
		
		//пример пустого тела цикла while
		System.out.println("\nПример 54\n");
		int a25 =100, b25 = 200;
		while (++a25 < --b25);
		System.out.println("Среднее значеие a25 и b25 = " + a25 + " " + b25);
		
		//цикл do while
		System.out.println("\nПример 55\n");
		
		n = 10;
		do{
			System.out.println("такт " + n);		
		}
		while(--n > 0);
		
		//цикл for
		System.out.println("\nПример 56 в отдельном проекте\n");
		System.out.println("\nПример 57\n");
		
		for(int i = 10; i > 0; i--){
			System.out.println("такт " + i);
		}
		
		System.out.println("\nПример 58\n");
		//проверка на простые числа
		num = 331;
		boolean isPrime;
		if (num < 2) isPrime = false;
		else isPrime = true;
		
		for(int i = 2; i <= num / i; i++){
			if (num % i == 0){ 
				isPrime = false;			
				break;}
		}
		if(isPrime) System.out.println("Простое число");
		else System.out.println("не простое число");
		
		System.out.println("\nПример 59\n");
		//цилк с двойной инициализацией и двойной итерацией
		for(int i = 4, j = 1; i > j; i--, j++){
			System.out.println("i = " + i);
			System.out.println("j = " + j);			
		}
		
		System.out.println("\nПример 60\n");
		//пример цикла for c пустым инициализатором и итерацией
		boolean done = false;
		int k = 0;
		for(;!done;){
			if (k == 10) done = true;
			k++;
			System.out.println("k = " + k);
		}
		System.out.println("done  = " + done);
		
		//пример бесконечного цикла
		//for(;;){
			//...
		//}
		
		System.out.println("\nПример 61\n");
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		//цикл в стиле for each
		for (int i : array){
			System.out.println(" i = " + i);
			sum += i;
			if (i == 5) break;
			i = 10;	//присвоение i-му элементу значения не приведет к изменению массива, он доступен только для чтения
		}
		System.out.println("sum = " + sum);
		
		
		//пример перебора двух-мерного массива в стиле for each	
		System.out.println("\nПример 62\n");
		sum = 0;
		int matrix[][] = new int[3][5];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 5; j++){
				matrix[i][j] = (1 + i) * (1 + j);
			}			
		}
				
		for(int i[] : matrix){
			for (int j : i){
				System.out.print(j + " ");
				sum +=j;
			}			
			System.out.println(" Сумма = " + sum);
			sum = 0;
		}
		
		//вложенные циклы - в принципе мы их использовали уже
		System.out.println("\nПример 63\n");
		for (int i = 0; i < 10; i++){
			for (int j = i; j < 10; j++)
				System.out.print(".");
			System.out.println();
		}
		
		//операторы перехода break, continue, return
		
		System.out.println("\nПример 64\n");
		//пример прерывания цикла при помощи оператора break
		for (int i = 0; i < 100; i++){
			if (i == 10) break;
			System.out.println("i: " + i);
		}
		System.out.println("Цикл прерван.");
		
		System.out.println("\nПример 65\n");
		//такой же пример while
		int a26 = 0;
		while (a26 < 100){
			System.out.println("a26: " + a26);
			if (a26 == 10)break;
			a26++;
		}
		System.out.println("Цикл прерван.");
		
		System.out.println("\nПример 66\n");
		//в двойном цикле break выходит только из внутреннего цикла
		for (int i = 0; i < 3; i++){
			System.out.println("Проход " + i + ":");
			for (int j = 0; j < 100; j++){
				if (j == 10)break;
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Циклы завершены");
		
		
		System.out.println("\nПример 67\n");
		boolean t = true;
		//break как goto
		first:{
			second:{
				third:{
					System.out.println("оператор перед break");
					if(t)break second;
					System.out.println("этот оператор не выполнится.");
				}
				System.out.println("этот оператор не выполнится.");
			}
			System.out.println("этот оператор следует за блоком second.");
		}

		
		System.out.println("\nПример 68\n");
		//пример выхода из двойного цикла при помощи break метка, как goto
		outer: for (int i = 0; i < 3; i++){
			System.out.println("Проход : " + i);
			for (int j = 0; j < 100; j++){
				if (j == 10) break outer;
				System.out.print(j + " ");				
			}
			System.out.println("Эта строка не выполнится");
		}
		System.out.println("Конец цикла");
		
		
		System.out.println("\nПример 69\n");
		//нельзя перейти по ссылке с помощью оператора break не для обьемлюещего кода
		/*
		one: for(int i = 0; i < 3; i++){
			System.out.println("Проход: " + i);			
		}
		
		for (int j = 0; j < 100; j++){
			if (j == 10) break one; //ОШИБКА нельзя перейти к не обьемлеющему блоку
			System.out.println(j + " ");
		}
		*/
		
		System.out.println("\nПример 70\n");
		//пример использование оператора continue для досрочного завершения цикла
		for (int i = 0; i < 10; i++){
			System.out.print(i + " ");
			if (i % 2 == 0) continue;
			System.out.println();
		}
		
		
		//пример использование continue c меткой
		System.out.println("\nПример 71\n");
		outcicle: for(int i = 0; i < 10; i++){
			for (int j = 0; j < 10; j++){
				if (j > i){
					System.out.println();
					continue outcicle;
				}
				System.out.print(" " + (i * j));
			}
		}
		System.out.println("\nПример 72\n");
		//пример использование оператора return обманным условием
		/*
		boolean t1 = true;
		System.out.println("До возврата");
		if(t) return;
		System.out.println("Этот оператор выполняться не будет");
		*/
		
		//классы
		//создаем обьект - экземпляр класс, по шаблону - классу
		Box myBox1 = new Box();
		myBox1.width = 100;
		myBox1.height = 50;
		myBox1.depth = 10;
		System.out.println("Обьем параллелепипеда: " + myBox1.width * myBox1.height * myBox1.depth);
		
		
		Box myBox2 = new Box();
		myBox2.width = 10;
		myBox2.height = 21;
		myBox2.depth = 12;
		System.out.println("Обьем параллелепипеда: " + myBox2.width * myBox2.height * myBox2.depth);
		
		
		System.out.println("\nПример 73\n");
		String string = "004-034556";
		String[] parts = string.split("-");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		
		String str1 = "004.034556";
		String[] parts1 = str1.split("\\.");
		String partS1 = parts1[0]; // 004
		String partS2 = parts1[1]; // 034556
		System.out.println(partS1);
		System.out.println(partS2);
		
		System.out.println("\nПример 74\n");
		
		
		Box myBox3 = new Box();
		Box myBox4 = new Box();
		
		myBox3.width = 10;
		myBox3.height = 20;
		myBox3.depth = 15;
		
		myBox4.width = 3;
		myBox4.height = 6;
		myBox4.depth = 9;
		
		myBox3.volume();
		myBox4.volume();
		
		System.out.println("\nПример 75\n");		
		System.out.println("Объем куба равен: " + myBox3.volume2());		
		System.out.println("Объем куба равен: " + myBox4.volume2());
		
		System.out.println("\nПример 76\n");
		Box myBox6 = new Box();
		Box myBox7 = new Box();
		
		myBox6.SetParam(10, 20, 15);
		myBox7.SetParam(3, 6, 9);
		System.out.println("Обьем куба равен: " + myBox6.volume2());
		System.out.println("Обьем куба равен: " + myBox7.volume2());
		
		System.out.println("\nПример 77\n");
		Box myBox8 = new Box();
		Box myBox9 = new Box();
		System.out.println("Обьем куба равен: " + myBox8.volume2());
		System.out.println("Обьем куба равен: " + myBox9.volume2());
		
		System.out.println("\nПример 78 и 79 одновременно\n");
		Box myBox10 = new Box(3, 7, 11);
		Box myBox11 = new Box(10, 5, 15);
		System.out.println("Обьем куба равен: " + myBox10.volume2());
		System.out.println("Обьем куба равен: " + myBox11.volume2());
		
		System.out.println("\nПример 80\n");
		Stack myStack = new Stack();
		myStack.push(1);
		myStack.push(3);
		myStack.push(5);
		myStack.push(7);
		for (int i = 0; i < 5; i++){
			System.out.println("Вывод элемента из стека: " + myStack.pop());	
		}
		
		System.out.println("\nПример 81\n");
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();		
		for(int i = 0; i < 10; i++) myStack1.push(i);
		for(int i = 10; i < 20; i++) myStack2.push(i);
		System.out.println("Содержимое стека myStack1: ");
		for (int i = 0; i < 10; i++) System.out.println(myStack1.pop());
		System.out.println("Содержимое стека myStack2: ");
		for (int i = 0; i < 10; i++) System.out.println(myStack2.pop());
		
		
	}

}
