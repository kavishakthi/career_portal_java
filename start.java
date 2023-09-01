import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class start extends JFrame implements ActionListener
{
    JFrame f = new JFrame();
    JLabel label = new JLabel(); 
    JButton b = new JButton("Start Quiz");

    public start()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setBounds(100,120,100,50);
        b.addActionListener(this);
        label.setText("Count the no.of preferences u choose in Each Set \n ");
        label.setBounds(150,90,300,30);

        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
            if(e.getSource() == b)
            {
                this.setVisible(false);
                new quiztest("Simple Quiz Test");
            }
    }
}