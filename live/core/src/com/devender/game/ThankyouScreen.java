package com.devender.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class ThankyouScreen implements Screen {

	final CatchRain game;
	
	private Texture thanks;
	public ThankyouScreen(final CatchRain gam) {
		game = gam;
		
		thanks = new Texture(Gdx.files.internal("thankyou.png"));
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		game.batch.begin();
		game.batch.draw(thanks, 123, 56);
		game.batch.end();
		
		if (Gdx.input.justTouched()){
			dispose();
			Gdx.app.exit();
		}

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		thanks.dispose();
	}

}
