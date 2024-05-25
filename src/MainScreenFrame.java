import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreenFrame extends JFrame {
    private JPanel myPanel;
    private JLabel lb_giris;
    private JButton Button_article;
    private JButton Button_word;
    private JButton Button_addwords;
    private JButton Button_addArticle;





    public MainScreenFrame(){

        setTitle("SU17AY-SJ");

        this.add(myPanel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myPanel.setBackground(Color.getColor(null,2222222));

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

                    new AddArtikel();



                }
            }
        });

        Button_article.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==Button_article){


                    new LernenArtikel();
                }
            }
        });
    }


}
