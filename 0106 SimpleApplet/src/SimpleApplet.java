//Глава 13
//Основы создания апплетов
//апплет - программа находящаяся на вебсервере, 
//автоматически устанавливается и запускается, как часть веб-документа
//стр. 374

import java.awt.*;
import java.applet.*;

/*
<applet code=SimpleApplet" width=200 height=60> 
</applet>
*/

public class SimpleApplet extends Applet{
	public void paint (Graphics g) {
		g.drawString("Простейший  апплет.", 20, 20);
	}
}
