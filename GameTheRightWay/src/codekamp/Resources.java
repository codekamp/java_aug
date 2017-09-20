package codekamp;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 20/09/17.
 */
public class Resources {

    public static Image grassImage;
    public static Image playerImage;


    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getResource("images/grass.png"));
            Resources.playerImage = ImageIO.read(Resources.class.getResource("images/run_anim1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
