import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddArtikel extends JFrame{


    private JPanel MyPanel;
    private JTextField textField_Artikel;
    private JTextField textField_AddWord;
    private JButton button_add;

    AddArtikel(){

        this.add(MyPanel);
        this.setSize(300,300);
        this.setVisible(true);


        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (e.getSource()==button_add){


                    try( BufferedWriter writer = new BufferedWriter(new FileWriter("artikel.txt",true))){


                        writer.write(String.valueOf(textField_Artikel.getText())+" , "+String.valueOf(textField_AddWord.getText())+"\n");

                    } catch (IOException g) {
                        throw new RuntimeException(g);
                    }


                }

            }
        });
    }
}
