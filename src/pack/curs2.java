package pack;

import javax.swing.*; /*импортируем библиотеку swing
         Swing — библиотека для создания графического интерфейса для программ на языке Java.
         Swing предоставляет более гибкие интерфейсные компоненты и имеет
         более широкий набор функций, чем библиотека AWT.
         "*" - означает что библиотека swing ыключает все свои элементы (jbutton,jlabel и т.д.)
         */ 
import javax.swing.border.EmptyBorder; //импортируем класс EmptyBorder
import java.awt.*; /*импортируем библиотеку графического интерфейса awt
             Все стандартные классы, поставляемые с системой Java хранятся в пакете java
             Пакет AWT (загружается java.awt) содержит набор классов, поволяющих 
             выполнять графические операции и создавать элементы управления.
             "*" - означает что библиотека awt включает все свои элементы 
             */

public class curs2 extends JFrame { /*создание класса curs2 - наследник стандартного класса JFrame
      public - открытый уровень доступа, т.е. наш класс curs2 доступен из любого места, любому классу
      class - зарезервированное слово.Оно говорит транслятору, что мы собираемся описать новый класс (в нашем случае curs2)
      Описание класса curs2 располагается между открывающей фигурной скобкой({) и закрывающей фигурной скобкой(})
      extends указывает на то, что curs1 — это подкласс класса JFrame
      JFrame - класс в библиотеке Swing, представляющий собой окно с рамкой и строкой заголовка
        */                          
	private JPanel contentPane; /*объявляем Панель (JPanel), доступный только внутри класса (private)
                   Панель JPanel — это элемент управления, представляющий собой прямоугольное пространство, на котором можно размещать другие элементы.
                   */
	/**
	 * Create the frame.
	 */
	public curs2() { /*указываем конструктор
                         модификатор доступа public означает что метод curs2 виден и доступен любому классу*/
		setTitle("Результаты"); //название окна
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //приложение закрывается по закрытию формы
		setBounds(100, 100, 300, 300); // положение и размер окна
		contentPane = new JPanel(); /*создание панели
                                Панель JPanel — это элемент управления, представляющий собой прямоугольное пространство, на котором можно размещать другие элементы.
                                Оператор new создает экземпляр класса JPanel
                                */
		contentPane.setBorder(new EmptyBorder(10, 10, 0, 0)); /*устанавливаем рамку с отступами вокруг панели
                                    EmptyBorder — пустая рамка, позволяет создать отступы вокруг панели. 
                                    Размеры отступов задаются в конструкторе четырьмя целыми числами.
                                    */
		setContentPane(contentPane); //Метод setContentPane() позволяет заменить панель содержимого окна
		contentPane.setLayout(new GridLayout(7, 1, 0, 0)); /*задаем сеточную компановку панели
                                      Менеджер табличного размещения GridLayout  разбивает панель на ячейки одинаковой ширины и высоты
                                      Этот менеджер размещения создается конструктором с параметрами (четыре целых числа). 
                                      Необходимо указать количество строк, столбцов и расстояние между ячейками по горизонтали и по вертикали.
                                      В нашем случае 7 строк, 1 столбец, расстояний между ячейками по горизотали и по вертикали нет 
		                      */
		JLabel lblQ = new JLabel("Результаты:"); //создание элемента для отображения фиксированного текста("Ведите длину бани (в метрах):")
		lblQ.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblQ); //добавление метки на панель
		
		JLabel lblNewLabel = new JLabel(""); //создание метки
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblNewLabel); //добавление метки на панель
		
		JLabel lblNewLabel_1 = new JLabel(""); //создание метки
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblNewLabel_1); //добавление метки на панель
		
		JLabel lblNewLabel_2 = new JLabel(""); //создание метки
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblNewLabel_2); //добавление метки на панель
		
		JLabel lblNewLabel_3 = new JLabel(""); //создание метки
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblNewLabel_3); //добавление метки на панель
		
		JLabel lblNewLabel_4 = new JLabel(""); //создание метки
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblNewLabel_4); //добавление метки на панель
		
		JLabel lblNewLabel_5 = new JLabel(""); //создание метки
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER); //расположение текста метки по центру
		contentPane.add(lblNewLabel_5); //добавление метки на панель
		
		/*расчет переменных rez1, rez2, rez3, rez4, rez5, rez6 по формулам
                               переменные вещественного типа*/
		double rez1=curs1.razmer1*curs1.razmer2;
		double rez2=4*(curs1.razmer3/0.2);
		double rez3=(curs1.razmer1*curs1.razmer2)*0.5;
		double rez4=curs1.razmer1*curs1.razmer2*0.25;
		double rez5=curs1.razmer1*curs1.razmer2*0.4;
		double rez6=curs1.razmer1*curs1.razmer2*0.35;

		/*форматированный вывод
                %.2f отображает значение с двумя разрядами после точки
                %.0f не отображает знаки после точки
                статический метод String.format() используется для создания форматиованной строки без ее вывода*/
		 String R1 = String.format("Площадь бани (кв. метров): %.2f", rez1); 
		 String R2 = String.format("Количесто брусов, требующихся для бани: %.0f", rez2); 
		 String R3 = String.format("Max кол-во людей в бане: %.0f", rez3);
		 String R4 = String.format("Размер предбанника (кв. метров): %.2f", rez4);
		 String R5 = String.format("Размер парильной (кв. метров): %.2f", rez5);
		 String R6 = String.format("Размер моечной (кв. метров): %.2f", rez6);
		 /*вывод расчетов на текстовые метки
                  метод setText означает написать результат в текстовое поле*/
		 lblNewLabel.setText(R1);
		 lblNewLabel_1.setText(R2);  
		 lblNewLabel_2.setText(R3);  
		 lblNewLabel_3.setText(R4);
		 lblNewLabel_4.setText(R5);
		 lblNewLabel_5.setText(R6);
	}

}
