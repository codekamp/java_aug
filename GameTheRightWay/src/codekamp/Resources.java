package codekamp;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by cerebro on 20/09/17.
 */
public class Resources {

    public static Image grassImage;
    public static Image blockImage;
    public static Image cloudImage;
    public static Image welcomeImage;
    public static java.util.List<Image> playerImages = new ArrayList<>();
    public static Color skyColor = new Color(208, 244, 247);
    public static AudioClip hitAudio;


    public static void load() {
        try {
            Resources.grassImage = ImageIO.read(Resources.class.getResource("images/grass.png"));
            Resources.blockImage = ImageIO.read(Resources.class.getResource("images/block.png"));
            Resources.cloudImage = ImageIO.read(Resources.class.getResource("images/cloud1.png"));
            Resources.welcomeImage = ImageIO.read(Resources.class.getResource("images/welcome.png"));

            Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim1.png")));
            Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim2.png")));
            Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim3.png")));
            Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim4.png")));
            Resources.playerImages.add(ImageIO.read(Resources.class.getResource("images/run_anim5.png")));
            Resources.playerImages.add(Resources.playerImages.get(3));
            Resources.playerImages.add(Resources.playerImages.get(2));
            Resources.playerImages.add(Resources.playerImages.get(1));
            Resources.hitAudio = Applet.newAudioClip(Resources.class.getResource("images/onjump.wav"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
