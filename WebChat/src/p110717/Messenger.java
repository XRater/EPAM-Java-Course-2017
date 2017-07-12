package p110717;

import javax.swing.*;
import java.awt.*;

public class Messenger {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Chat");
        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(panel);
        frame.pack();

        frame.setVisible(true);

    }

}
