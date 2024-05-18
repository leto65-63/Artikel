import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyFrame2 extends JFrame {

    private JPanel myPanel;
    private JTextField textField_word;
    private JTextField textField_mean;
    private JLabel label_word;
    private JLabel label_mean;
    private JButton button_wordAdd;
    private JButton button_training;


  MyFrame2(){

        this.add(myPanel);
        this.setSize(300,300);
        this.setVisible(true);


        button_wordAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==button_wordAdd){


                    try( BufferedWriter writer = new BufferedWriter(new FileWriter("namen.txt",true))){


                        writer.write(String.valueOf(textField_word.getText())+" , "+String.valueOf(textField_mean.getText())+"\n");

                    } catch (IOException g) {
                        throw new RuntimeException(g);
                    }


                }
            }
        });
    }





}
