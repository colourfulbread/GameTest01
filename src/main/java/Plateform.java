import javafx.scene.effect.DropShadow;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;

import java.io.IOException;

public class Plateform {
    private static int pf_position_x;
    private static int pf_position_y;
    private int pf_width;

    public Plateform() {
    }

    public Plateform(int pf_position_x, int pf_position_y, int pf_width) {
        this.pf_position_x = pf_position_x;
        this.pf_position_y = pf_position_y;
        this.pf_width = pf_width;
    }

    public int getPf_position_x() {
        return pf_position_x;
    }

    public void setPf_position_x(int pf_position_x) {
        this.pf_position_x = pf_position_x;
    }

    public int getPf_position_y() {
        return pf_position_y;
    }

    public void setPf_position_y(int pf_position_y) {
        this.pf_position_y = pf_position_y;
    }

    public int getPf_width() {
        return pf_width;
    }

    public void setPf_width(int pf_width) {
        this.pf_width = pf_width;
    }
    public void set_position() throws IOException {
        ImageInput imageInput = new ImageInput();
        imageInput.setX(0);
        imageInput.setY(0);
        imageInput.setSource(new Image("img/game/rm.png"));
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(30);
        dropShadow.setInput(imageInput);
    }
}
