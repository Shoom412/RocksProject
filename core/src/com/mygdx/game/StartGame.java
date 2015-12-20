package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.game.Screens.Start;
import com.uwsoft.editor.renderer.SceneLoader;

public class StartGame extends Game {

	public SceneLoader sh;

	public void create() {
		com.rocks.gameplay.Reload.A.x_pit=(float)(Gdx.graphics.getWidth()* com.rocks.gameplay.Reload.A.y_orig)/Gdx.graphics.getHeight();
		if(com.rocks.gameplay.Reload.A.x_pit<= com.rocks.gameplay.Reload.A.x_orig)
		com.rocks.gameplay.Reload.A.x_pit= com.rocks.gameplay.Reload.A.x_orig;
		com.rocks.gameplay.Reload.A.y_pit=(float)(Gdx.graphics.getHeight()* com.rocks.gameplay.Reload.A.x_orig)/Gdx.graphics.getWidth();
		if(com.rocks.gameplay.Reload.A.y_pit<= com.rocks.gameplay.Reload.A.y_orig)
		com.rocks.gameplay.Reload.A.y_pit= com.rocks.gameplay.Reload.A.y_orig;
		//Строки приведенные выше для нахождение реальных размеров ширены и высоты экрана
        //S.loadData();//Будем взаимодействовать в дальнейшем)

		sh = new SceneLoader();//Создаем загрузчик для сцен

		setScreen(new Start(this)); //Переход на класс Start в которой и откроется наша первая сцена
	}

}
