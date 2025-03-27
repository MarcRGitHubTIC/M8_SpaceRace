package marc.m8.uf3.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.Random;

import marc.m8.uf3.helpers.AssetManager;
import marc.m8.uf3.utils.Methods;
import marc.m8.uf3.utils.Settings;

public class Asteroid extends Scrollable {
    private float runTime;
    public Asteroid(float x, float y, float width, float height, float velocity) {
        super(x, y, width, height, velocity);
        runTime = Methods.randomFloat(0, 1);
    }

    @Override
    public void act (float delta){
        super.act(delta);
        runTime += delta;
    }

    @Override
    public void reset(float newX){
        super.reset(newX);

        float newSize = Methods.randomFloat(Settings.MIN_ASTEROID, Settings.MAX_ASTEROID);

        width = height = 34 * newSize;

        position.y = new Random().nextInt(Settings.GAME_HEIGHT - (int) height);
    }

    public float getRunTime(){
        return runTime;
    }

    @Override
    public void draw(Batch batch, float parentAlpha){
        super.draw(batch, parentAlpha);
        batch.draw((TextureRegion) AssetManager.asteroidAnim.getKeyFrame(runTime), position.x, position.y, width, height);
    }
}
