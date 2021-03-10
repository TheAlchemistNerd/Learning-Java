import javax.swing.*;
JFrame frame = new JFrame("This is the title");
frame.setSize(350, 260);
frame.setVisible(true);
public class HelloFrame extends JFrame
{
    public HelloFrame()
    {
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello, World!");
        JPanel panell = new JPanel();
        JLabel labell = new JLabel("Hello World!");
        panell.add(labell);
        this.add(panell);
        this.setVisible(true);
    }
}
new HelloFrame();