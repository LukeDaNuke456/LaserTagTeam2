package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

//Uses JWindow to display a splash screen
public class SplashScreen extends JWindow {
    Image splashImage;
    public SplashScreen() {

        //loading in an image
        try {

            splashImage = ImageIO.read(new File("src/resource/logo.png"));
        }

        catch (Exception e){

            e.printStackTrace(System.err);
            System.exit(1);
        }

        //sets the size of window to whatever the width and height of image is
        this.setSize(splashImage.getWidth(this), splashImage.getHeight(this));

       //looks at your screen and determines where the middle is
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((size.width-getWidth())  / 2, (size.height-getHeight()) / 2);
        this.setVisible(true);

    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(splashImage, 0, 0,this);

    }


}
