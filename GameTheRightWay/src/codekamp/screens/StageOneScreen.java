package codekamp.screens;

import codekamp.GamePanel;
import codekamp.RandomGen;
import codekamp.Resources;
import codekamp.entities.Block;
import codekamp.entities.Cloud;
import codekamp.entities.Player;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Created by cerebro on 20/09/17.
 */
public class StageOneScreen extends Screen {

    private static final int GROUND_COORDINATE = 405;

    private java.util.List<Block> blocks = new ArrayList<>();
    private java.util.List<Cloud> clouds = new ArrayList<>();
    private Player player;
    private int blocksPassed = 0;

    public StageOneScreen() {
        this.blocks.add(new Block(900, randomBlockYCord()));
        this.blocks.add(new Block(1100, randomBlockYCord()));
        this.blocks.add(new Block(1300, randomBlockYCord()));
        this.blocks.add(new Block(1500, randomBlockYCord()));
        this.blocks.add(new Block(1700, randomBlockYCord()));

        this.clouds.add(new Cloud(500, randomCloudYCord()));
        this.clouds.add(new Cloud(900, randomCloudYCord()));

        this.player = new Player(400, 315);

        this.entities.addAll(this.blocks);
        this.entities.addAll(this.clouds);
        this.entities.add(player);
    }

    @Override
    public void update() {
        super.update();

        if(this.player.y >= (GROUND_COORDINATE - this.player.height)) {
            this.player.y = GROUND_COORDINATE - this.player.height;
            this.player.yAcc = 0;
            this.player.yVel = 0;
        }

        for(Block b: this.blocks) {
            if(b.x < -20) {
                b.x = 980;
                b.y = randomBlockYCord();

                if(b.visible) {
                    this.blocksPassed++;

                    if(blocksPassed == 10) {
                        GamePanel.currentScreen = new StageTwoScreen();
                    }
                }

                b.visible = true;
            }

            if(this.player.isCollidingWith(b)) {
                b.visible = false;
                this.player.x -= 10;
                Resources.hitAudio.play();
            }
        }


        for(Cloud c: this.clouds) {
            if(c.x < -128) {
                c.x = 900;
                c.y = randomCloudYCord();
            }
        }
    }

    @Override
    public void render(Graphics g) {

        //draw all non entities
        g.setColor(Resources.skyColor);
        g.fillRect(0, 0, 800, 450);
        g.setColor(Color.red);
        g.drawString("Points: " + blocksPassed, 20, 20);
        g.drawImage(Resources.grassImage, 0, 405, null);

        //draw all entities
        super.render(g);
    }

    private int randomBlockYCord() {
        if (RandomGen.nextInt(2) == 0) {
            return 355;
        } else {
            return 275;
        }
    }

    private int randomCloudYCord() {
        return RandomGen.nextInt(50, 200);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE && this.player.y == (GROUND_COORDINATE - this.player.height)) {
            this.player.yVel = -20;
            this.player.yAcc = 1;
        }
    }
}
