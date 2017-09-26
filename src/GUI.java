import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//This class will handle the bulk of the GUI, including the main menu, character creation, and in game UI.
public class GUI {
    private JFrame frame;
    private JPanel primaryPanel,bgPanel;
    private JButton menuButton1,menuButton2,menuButton3,menuButton4;
    private BufferedImage bgImage;
    public GUI() {
        //Upon construction, will create the main menu. First method that is called.
        frame = new JFrame("Cooking MMO: TITLE TBD");
        primaryPanel = new JPanel();
        menuButton1 = new JButton("Play");
        menuButton2 = new JButton("Characters");
        menuButton3 = new JButton("Settings");
        menuButton4 = new JButton("Quit");
        //Add buttons to panel.
        primaryPanel.add(menuButton1);
        primaryPanel.add(menuButton2);
        primaryPanel.add(menuButton3);
        primaryPanel.add(menuButton4);
        primaryPanel.setOpaque(false);
        //Finalize frame
        frame.setLayout(new GridLayout(1,2));
        frame.add(new CustomPanel());
        frame.add(primaryPanel);
        frame.setSize(1920,1080);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
