package ClassWork.p240717;

import javax.swing.*;
import java.awt.*;

class DemoInterfaces {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.addMouseListener(new MyMouseListener());

        panel.setPreferredSize(new Dimension(400, 400));

        frame.add(panel);

        frame.pack();

        frame.setVisible(true);
    }
}
