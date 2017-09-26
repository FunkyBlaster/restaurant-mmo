import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CustomPanel extends JPanel {
    //may need to code a method to be able to change background of the panel. (setter for filename and change IO.read file to variable)
    private BufferedImage image;
    public CustomPanel() {
        try {
            image= ImageIO.read(new java.io.File("resources/char_menu.png"));
        }
        catch(IOException e){

        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
