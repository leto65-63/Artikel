import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame {
    private JPanel myPanel;
    private JLabel lb_giris;
    private JButton Button_article;
    private JButton Button_word;
    private JButton Button_addwords;
    private JButton Button_addArticle;





    MyFrame(){




        JFrame frame = new JFrame("SU17AY-SJ");


        myPanel.setBackground(Color.getColor(null,2222222));

        frame.add(myPanel);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        Button_addwords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == Button_addwords){


                  new MyFrame2();


                }


            }
        });


        Button_word.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==Button_word){

                    new MyFrame3();


                }

            }
        });
        Button_addArticle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==Button_addArticle){




                }
            }
        });
    }


}
