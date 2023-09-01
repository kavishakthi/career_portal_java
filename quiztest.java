import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class quiztest extends JFrame implements ActionListener{

    JLabel label;
    JButton btnNext, btnResult, b1;
    JRadioButton Rbuttons[] = new JRadioButton[6];
    
    ButtonGroup bg;
    int count = 0, current = 0, x=0, y=0, now=0;
    int m[] = new int[9];

    public quiztest(String s)
    {
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();


        b1 = new JButton("Show");
        b1.setBounds(500,340,120,25);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        for(int i=0; i<6; i++)
        {
            Rbuttons[i] = new JRadioButton();
            add(Rbuttons[i]);
            bg.add(Rbuttons[i]);
        }

        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);

        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(50,70,450,30);
        Rbuttons[0].setBounds(70,90,450,20);
        Rbuttons[1].setBounds(70,120,450,20);
        Rbuttons[2].setBounds(70,150,450,20);
        Rbuttons[3].setBounds(70,180,450,20);
        Rbuttons[4].setBounds(70,220,450,20);
        //Rbuttons[5].setBounds(70,270,450,20);
        btnNext.setBounds(200,340,100,30);
        btnResult.setBounds(370,340,100,30);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(250,100);
        setSize(800,450);
        
        getContentPane().setBackground(new Color(128, 128, 255));
        setLayout(null);
        setVisible(true);
        
        
    }

    void setData()
    {
        Rbuttons[5].setSelected(true);
        if(current == 0)
        {
            label.setText("SET - A");
            Rbuttons[0].setText("1. I like to work on cars.");
            Rbuttons[1].setText("2. I like to build things.");
            Rbuttons[2].setText("3. I like to Take care of animals.");
            Rbuttons[3].setText("4. I like working outdoors.");
            Rbuttons[4].setText("5. I like to cook.");
        }

        if(current == 1)
        {
            label.setText("SET - B");
            Rbuttons[0].setText("1. I like to do puzzles.");
            Rbuttons[1].setText("2. I like to do experiments");
            Rbuttons[2].setText("3. I enjoy science");
            Rbuttons[3].setText("4. I'm Good at math");
            Rbuttons[4].setText("5. I like to analyse problems.");
        }

        if(current == 2)
        {
            label.setText("SET - C");
            Rbuttons[0].setText("1. I'm a Creative Person.");
            Rbuttons[1].setText("2. I like to play Instruments.");
            Rbuttons[2].setText("3. I like Acting in plays");
            Rbuttons[3].setText("4. I enjoy creative writing");
            Rbuttons[4].setText("5. I am good at worknig independently."); 
        }

        if(current == 3)
        {
            label.setText("SET - D");
            Rbuttons[0].setText("1. I like to work in teams");
            Rbuttons[1].setText("2. I like to teach or train people.");
            Rbuttons[2].setText("3. I am interested in healing people");
            Rbuttons[3].setText("4. I enjoy learning about other cultures");
            Rbuttons[4].setText("5. I like helping people.");
        }

        if(current == 4)
        {
            label.setText("SET - E");
            Rbuttons[0].setText("1. I like to give speeches");
            Rbuttons[1].setText("2. I like to lead.");
            Rbuttons[2].setText("3. I would like to start my own business");
            Rbuttons[3].setText("4. I like selling things");
            Rbuttons[4].setText("5. I set goals for myself.");

        }

        if(current == 5)
        {
            label.setText("SET - F");
            Rbuttons[0].setText("1. I like to work in office");
            Rbuttons[1].setText("2. I am good at keeping records of my work");
            Rbuttons[2].setText("3. I pay attention to details.");
            Rbuttons[3].setText("4. I like to do filing or typing");
            Rbuttons[4].setText("5. I like to organize things.");
        }

        if(current == 6)
        {
            label.setText("Get ready to answer some Aptitude Questions :)");
            label.setText("SET - G - your Prefered way of Learning? ");
            Rbuttons[0].setText("(A) Reading and Studying" );
            Rbuttons[1].setText("(B) Through others real life Stories.");
            Rbuttons[2].setText("(C) Watching and Observing.");
            Rbuttons[3].setText("(D) Interacting and discussing with others.");
            Rbuttons[4].setText("(E) Experimenting and trying things out.");
        }

        if(current == 7)
        {
            label.setText("SET - H - What kind of problems U enjoy solving? ");
            Rbuttons[0].setText("(A) Mathematical");
            Rbuttons[1].setText("(B) Logical ");
            Rbuttons[2].setText("(C) Creative ");
            Rbuttons[3].setText("(D) People-oriented");
            Rbuttons[4].setText("(E) Technical ");
        }

        if(current == 8)
        {
            label.setText(" SET - I - Which sector Excites u the most?");
            Rbuttons[0].setText("(A) Realistic(mechanical, electrical...)");
            Rbuttons[1].setText("(B) Investigate");
            Rbuttons[2].setText("(C) Artistic");
            Rbuttons[3].setText("(D) Social");
            Rbuttons[4].setText("(E) Enterprising.");
        }

        label.setBounds(30, 30,450, 20);
        for(int i =0,j=0; i<=90; i+=30,j++)
        {
            Rbuttons[j].setBounds(70, 100+i, 270, 20);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnNext)
        {
            // if(checkAns())
            //     count = count ++;

             current++;
             setData();
            if(current == 8)
            {
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Result")) 
        {
            //if(checkAns())
                //count = count+1;
            current++;
            JOptionPane.showMessageDialog(this, "Sucessfully Completed Your Quiz.");
            
        }

        if(e.getSource() == b1)
        {
            this.setVisible(false);
            new Show();
        }
    }
}