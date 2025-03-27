package marc.m8.uf3;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import marc.m8.uf3.helpers.AssetManager;
import marc.m8.uf3.screens.GameScreen;

public class SpaceRace extends Game {
    private SpriteBatch batch;
    private Texture image;

    @Override
    public void create() {

        AssetManager.load();

        setScreen(new GameScreen());
    }

    @Override
    public void resize(int width, int height){
        super.resize(width, height);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
