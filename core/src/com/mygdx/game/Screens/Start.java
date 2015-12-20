package com.mygdx.game.Screens;

/**
 * Created by Shoom on 19.12.2015.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.Reload.A;
import com.mygdx.game.StartGame;
import com.uwsoft.editor.renderer.components.DimensionsComponent;
import com.uwsoft.editor.renderer.components.TransformComponent;
import com.uwsoft.editor.renderer.components.additional.ButtonComponent;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class Start extends Stage implements Screen {

    final StartGame game;
    private ItemWrapper root;
    private Viewport viewport;
    public Start(final StartGame gam) {
        game = gam;
    }
    @Override //show - Действия при запуске класса
    public void show() {
        //Создание размеров для данно окна
        viewport = new FitViewport(com.rocks.gameplay.Reload.A.x_pit, com.rocks.gameplay.Reload.A.y_pit);

        //Загрузка сцены. MainScene – Название сцены
        game.sh.loadScene("MainScene",viewport);

        //Класс для восприятия с кнопками
        Buttons();
    }
    @Override //render - цикл отрисовки
    public void render(float delta) {
        //Очиска цветом
        Gdx.gl.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);

        //Обновление окна
        game.sh.getEngine().update(Gdx.graphics.getDeltaTime());
    }
    @Override
    public void hide() {
    }
    @Override //Происходит при закрытие приложения
    public void dispose() {
        //S.saveData();
        game.dispose();
    }
    @Override //При изменение размера
    public void resize(int width, int height) {
    }
    @Override //При режиме пауза
    public void pause() {
    }
    @Override //При возобновление с паузы
    public void resume() {
        Buttons();
    }
    //В дальнейшем будем взаимодействовать)
    private void Buttons() {
        game.sh.addComponentsByTagName("button", button.getClass());
    }
}
