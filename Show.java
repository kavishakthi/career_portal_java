import javax.swing.*;
import java.awt.*;

public class Show extends JFrame{

    JLabel label = new JLabel();
    public static void main(String[] args) {
        Show show = new Show();
    }

    public Show(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Suggestion Box");

        label.setForeground(Color.BLACK);
        label.setFont(new Font("tahcma", Font.PLAIN, 16));
        label.setBounds(70, 30, 400, 550);
        getContentPane().setBackground(new Color(255, 255, 150));
        label.setText(
            "<html>" + 
            "Set A --> These people are often good at mechanical or atheletic jobs.<br><br>"+
            "Set B --> These people like to watch, learn, analyze and solve problems.<br><br>"+
            "Set C --> These people like to work in unstructed situations where they can use their creativity.<br><br>"+
            "Set D --> These people like to work with other people, rather than things.<br><br>"+
            "Set E --> These people like to work with others and enjoy persuading and performing.<br><br>"+
            "Set F --> These people are very detail oriented, organized and like to work with data.<br><br>"+
            "Set G --> People prefering first two choices like to work related to studies and the other choices prefer to work in Experimenting.<br><br>"+
            "</html>"
        );
        add(label);
        setVisible(true);
        setSize(800, 600);

    }

    
}
