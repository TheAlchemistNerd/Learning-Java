import javax.swing.*;
import java.awt.event.*;

public class ClickMeLambda
    extends JFrame
{
    public static void main(String[] args)
    {
        new ClickMeLambda();
    }

    private JButton button1, exitButton;

    public ClickMeLambda()
    {
        this.setSize(300, 150);
        this.setDefaultCloseOperation
            (JFrame.EXIT_ON_CLOSE);
        this.setTitle("I'm Listening");
        JPanel panell = new JPanel();
        button1 = new JButton("Click Me!");
        exitButton = new JButton("Exit");
        button1.addActionListener(e -> button1Click());
        exitButton.addActionListener(e -> exitButtonClick());
        panell.add(button1);
        panell.add(exitButton);
        this.add(panell);

        this.setVisible(true);
    }

    private int clickCount = 0;
    public void button1Click()
    {
        clickCount++;
        if (clickCount == 1)
            button1.setText("I've been clicked!");
        else
            button1.setText("I've been clicked "
                + clickCount + " times!");
        
    }
    public void exitButtonClick()
    {
        if (clickCount > 0)
            System.exit(0);
        else
        {
            JOptionPane.showMessageDialog(
                ClickMeLambda.this,
                "You must click at least once!",
                "Not so fast, buddy",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}