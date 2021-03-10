import javax.swing.*;
import java.awt.event.*;

public class Namer extends JFrame
{

    public static void main(String[] args)
    {
        new Namer();
    }

    private JButton buttonOk;
    private JTextField textName;

    public Namer()
    {
        this.setSize(325, 100);
        this.setTitle("Who Are You?");
        this.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);

        JPanel panell = new JPanel();

        panell.add(new JLabel("Enter your name: "));

        textName = new JTextField(15);
        panell.add(textName);

        buttonOk = new JButton("OK");
        buttonOk.addActionListener(e -> buttonOkClick());
        panell.add(buttonOk);

        this.add(panell);

        this.setVisible(true);
    }

    public void buttonOkClick()
    {
        String name = textName.getText();
        if (name.length() == 0)
        {
            JOptionPane.showMessageDialog(
                Namer.this,
                "You didn't enter anything!",
                "Moron",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(
                Namer.this,
                "Good morning " + name,
                "Salutations",
                JOptionPane.INFORMATION_MESSAGE);
        }
        textName.requestFocus();
    }
}