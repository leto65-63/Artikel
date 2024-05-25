import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MyFrame3 extends JFrame{
    private JPanel myPane;
    private JLabel label1;
    private JLabel label3;
    private JLabel label2;
    private JLabel label4;
    private JButton button_refresh;
    private JButton button1_true;
    private JButton button2_true;
    private JButton button3_true;
    private JButton button4_true;


    Random random = new Random();

    ArrayList<JLabel> labeller;

    ArrayList<String> kelimeler;

    MyFrame2 frame2 = new MyFrame2();

    LinkedList<String> robert;

    String cumle;
    String [] yazi ;




    public void arrayDoldur(){

        labeller = new ArrayList<>();

        labeller.add(label1);
        labeller.add(label2);
        labeller.add(label3);
        labeller.add(label4);





        robert = new LinkedList<String>();

        try(Scanner reader = new Scanner(new BufferedReader(new FileReader("namen.txt")))){

            while(reader.hasNext()){

                cumle = reader.nextLine();

                robert.add(cumle);

            }


        } catch (IOException b) {
            throw new RuntimeException(b);
        }



        kelimeler = new ArrayList<String>();


        for (int i = 1; i<5; i++){

            int n = random.nextInt(robert.size());

            yazi = String.valueOf(robert.get(n)).split(",");

            kelimeler.add(yazi[0]);
            kelimeler.add(yazi[1]);

        }

        for (int j = 0; j<4; j++){

            labeller.get(j).setText(kelimeler.get(j*2));

        }


    }

        MyFrame3() {




            frame2.setVisible(false);


            label1.setBackground(Color.CYAN);
            label2.setBackground(Color.CYAN);
            label3.setBackground(Color.CYAN);
            label4.setBackground(Color.CYAN);

            label1.setOpaque(true);
            label2.setOpaque(true);
            label3.setOpaque(true);
            label4.setOpaque(true);

            label1.setPreferredSize(new Dimension(120, 30));
            label2.setPreferredSize(new Dimension(120, 30));
            label3.setPreferredSize(new Dimension(120, 30));
            label4.setPreferredSize(new Dimension(120, 30));
            button_refresh.setPreferredSize(new Dimension(100, 30));

            label1.setHorizontalAlignment(JLabel.CENTER);
            label2.setHorizontalAlignment(JLabel.CENTER);
            label3.setHorizontalAlignment(JLabel.CENTER);
            label4.setHorizontalAlignment(JLabel.CENTER);


            button1_true.setPreferredSize(new Dimension(10, 5));
            button3_true.setPreferredSize(new Dimension(10, 5));
            button2_true.setPreferredSize(new Dimension(10, 5));
            button4_true.setPreferredSize(new Dimension(10, 5));


            myPane.setBackground(Color.getColor(null, 22));


            this.add(myPane);
            this.setSize(500, 500);
            this.setVisible(true);
            this.setAlwaysOnTop(true);


            arrayDoldur();

            label1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);


                    if (e.getSource() == label1) {

                        if (label1.getText().equals(kelimeler.get(0))) {

                            label1.setText(kelimeler.get(1));
                        } else {

                            label1.setText(kelimeler.get(0));
                        }

                    }
                }
            });
            label2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);

                    if (e.getSource() == label2) {


                        if (label2.getText().equals(kelimeler.get(2))) {

                            label2.setText(kelimeler.get(3));
                        } else {

                            label2.setText(kelimeler.get(2));
                        }


                    }
                }
            });

            label3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);

                    if (e.getSource() == label3) {

                        if (label3.getText().equals(kelimeler.get(4))) {

                            label3.setText(kelimeler.get(5));
                        } else {

                            label3.setText(kelimeler.get(4));
                        }

                    }
                }
            });

            label4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);

                    if (e.getSource() == label4) {


                        if (label4.getText().equals(kelimeler.get(6))) {

                            label4.setText(kelimeler.get(7));
                        } else {
                            label4.setText(kelimeler.get(6));
                        }

                    }
                }
            });
            button_refresh.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button_refresh) {

                        if (robert.size()<5){

                            JOptionPane.showMessageDialog(null,"Please add words to traning");
                        }

                        arrayDoldur();
                    }
                }
            });
            button1_true.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button1_true) {

                        ArrayList<String> array = new ArrayList<String>();

                        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("namen.txt")))) {

                            while (reader.hasNext()) {

                                cumle = reader.nextLine();

                                String[] yazi = cumle.split(",");

                                if (!yazi[0].equals(label1.getText())) {

                                    array.add(cumle);
                                }

                            }

                            PrintWriter pw = new PrintWriter("namen.txt");
                            pw.close();

                            try( BufferedWriter writer = new BufferedWriter(new FileWriter("namen.txt",true))){

                                for (String str: array){

                                    writer.write(str +"\n");

                                }



                            } catch (IOException g) {
                                throw new RuntimeException(g);
                            }


                        }catch (FileNotFoundException exception){


                        }
                    }
                }
            });


            button2_true.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (e.getSource() == button2_true) {

                        ArrayList<String> array = new ArrayList<String>();

                        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("namen.txt")))) {

                            while (reader.hasNext()) {

                                cumle = reader.nextLine();

                                String[] yazi = cumle.split(",");

                                if (!yazi[0].equals(label2.getText())) {

                                    array.add(cumle);
                                }

                            }

                            PrintWriter pw = new PrintWriter("namen.txt");
                            pw.close();

                            try( BufferedWriter writer = new BufferedWriter(new FileWriter("namen.txt",true))){

                                for (String str: array){

                                    writer.write(str +"\n");

                                }



                            } catch (IOException g) {
                                throw new RuntimeException(g);
                            }


                        }catch (FileNotFoundException exception){


                        }
                    }


                }
            });
            button3_true.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button3_true) {

                        ArrayList<String> array = new ArrayList<String>();

                        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("namen.txt")))) {

                            while (reader.hasNext()) {

                                cumle = reader.nextLine();

                                String[] yazi = cumle.split(",");

                                if (!yazi[0].equals(label3.getText())) {

                                    array.add(cumle);
                                }

                            }

                            PrintWriter pw = new PrintWriter("namen.txt");
                            pw.close();

                            try( BufferedWriter writer = new BufferedWriter(new FileWriter("namen.txt",true))){

                                for (String str: array){

                                    writer.write(str +"\n");

                                }



                            } catch (IOException g) {
                                throw new RuntimeException(g);
                            }


                        }catch (FileNotFoundException exception){


                        }
                    }

                }
            });
            button4_true.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button4_true) {

                        ArrayList<String> array = new ArrayList<String>();

                        try (Scanner reader = new Scanner(new BufferedReader(new FileReader("namen.txt")))) {

                            while (reader.hasNext()) {

                                cumle = reader.nextLine();

                                String[] yazi = cumle.split(",");

                                if (!yazi[0].equals(label4.getText())) {

                                    array.add(cumle);
                                }

                            }

                            PrintWriter pw = new PrintWriter("namen.txt");
                            pw.close();

                            try( BufferedWriter writer = new BufferedWriter(new FileWriter("namen.txt",true))){

                                for (String str: array){

                                    writer.write(str +"\n");

                                }



                            } catch (IOException g) {
                                throw new RuntimeException(g);
                            }


                        }catch (FileNotFoundException exception){


                        }
                    }

                }
            });
        }
}
