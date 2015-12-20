package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.StartGame;

//Пример запуска приложени на десктоп
//Класс DesktopLauncher храняшийчся в модуле Desktop

public class DesktopLauncher {
	public static void main (String[] arg) {

		//Создание конфигурации
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width=768;  //Обявление ширины
		config.height=1280;  //Обявление высоты

		//Для воспроизвидения звука на персональных ПК
		System.setProperty("user.name","EnglishWords");

		//Переход к созданию игры
		new LwjglApplication(new StartGame(), config);
	}
}
