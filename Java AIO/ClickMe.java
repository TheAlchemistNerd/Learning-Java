import javax.swing.*;
import java.awt.event.*;

public class ClickMe
    extends JFrame implements ActionListener
{
    public static void main(String[] args)
    {
        new ClickMe();
    }

    private JButton button1;

    public ClickMe()
    {
        this.setSize(300, 150);
        this.setDefaultCloseOperation
            (JFrame.EXIT_ON_CLOSE);
        this.setTitle("I'm Listening");

        JPanel panell = new JPanel();
        button1 = new JButton("Click Me!");
        button1.addActionListener(this);
        panell.add(button1);
        this.add(panell);

        this.setVisible(true);
    }

    private int clickCount = 0;
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1)
        {
            clickCount++;
            if (clickCount == 1)
                button1.setText("I've been clicked!");
            else
                button1.setText("I've been clicked "
                    + clickCount + " times!");
        }
    }
}