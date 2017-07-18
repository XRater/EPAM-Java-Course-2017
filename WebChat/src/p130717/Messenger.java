package p130717;

import javax.swing.*;
import java.awt.*;

public class Messenger {

    static Communicator chat;
    private static JTextArea textArea;
    private static JScrollPane sp;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Chat");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        LayoutManager manager = new BorderLayout();

        JPanel panel = new JPanel(manager);
//        panel.setPreferredSize(new Dimension(400, 600));

        textArea = new JTextArea();
        textArea.setEditable(false);

        sp = new JScrollPane(textArea);

        panel.add(sp, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();

        JTextField textField = new JTextField(20);

        textField.addActionListener((e) -> {
            sendText(textField);
        });
        inputPanel.add(textField);

        JButton sendButton = new JButton("Send");
        inputPanel.add(sendButton);

        sendButton.addActionListener((e) -> {
            sendText(textField);
        });

        panel.add(inputPanel, BorderLayout.SOUTH);

        panel.setPreferredSize(new Dimension(400, 400));

        frame.add(panel);

        frame.pack();

        frame.setVisible(true);

        chat = new Communicator();
        chat.init(Messenger::placeText);
    }

    private static void sendText(JTextField textField) {
        String text = textField.getText();
        textField.setText("");
        chat.sendTextToServer(text);
    }

    private static void placeText(String text) {
        textArea.append(text + '\n');
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

}