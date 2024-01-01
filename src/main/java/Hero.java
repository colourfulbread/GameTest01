import javafx.scene.effect.DropShadow;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;

import java.io.IOException;

public class Hero {
    private static int hero_position_x;
    private static int hero_position_y;

    public Hero() {
    }

    public Hero(int hero_position_x, int hero_position_y) {
        this.hero_position_x = hero_position_x;
        this.hero_position_y = hero_position_y;
    }

    public int getHero_position_x() {
        return hero_position_x;
    }

    public void setHero_position_x(int hero_position_x) {
        this.hero_position_x = hero_position_x;
    }

    public int getHero_position_y() {
        return hero_position_y;
    }

    public void setHero_position_y(int hero_position_y) {
        this.hero_position_y = hero_position_y;
    }

    public void set_position() throws IOException {

    }

}
