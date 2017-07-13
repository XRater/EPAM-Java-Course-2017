package p110717;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Messenger {

    static ChatClient chat;
    private static JTextArea textArea;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Chat");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        LayoutManager manager = new BorderLayout();

        JPanel panel = new JPanel(manager);

        textArea = new JTextArea();
        textArea.setEditable(false);

        panel.add(textArea, BorderLayout.CENTER);

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

        chat = new ChatClient();
        chat.init(Messenger::placeText);
    }

    private static void sendText(JTextField textField) {
        String text = textField.getText();
        textField.setText("");
        chat.sendTextToServer(text);
    }

    private static void placeText(String text) {
        textArea.append(text + '\n');
    }

}