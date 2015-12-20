package com.mygdx.game.Reload;

//Класс для сохранения новых параметров ширены и высоты окна и
//прочих временых переменных в приложение(Между экранами)

public class A {
	public static float x_orig=768;  //Шырина оригинал
	public static float y_orig=1280;  //Высота оригинал

	public static float x_pit;  //Шырина new
	public static float y_pit;  //Высота new
	public static float xa_pit;
	public static float ya_pit;

	public static int i=0;
	public static boolean Start=false;
}
