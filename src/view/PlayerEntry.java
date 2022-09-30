package view;
import controller.Input;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class PlayerEntry extends JFrame {

    Input input;

     public PlayerEntry(){

//         i.setEntry(this);
        
         this.setTitle("Laser Tag Team 2");
         this.setSize(700, 500);
         this.setFocusable(true);
         this.getContentPane().setBackground(Color.BLACK);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
         setLocation((size.width-getWidth())  / 2, (size.height-getHeight()) / 2);

         this.setVisible(false);
         setLabel();

    }

    private void setLabel(){

        JLabel label = new JLabel("Player Entry Screen");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("sans_serif", Font.PLAIN, 28));
        label.setForeground(Color.red);
        label.setVisible(true);
        super.add(label);

    }

}
