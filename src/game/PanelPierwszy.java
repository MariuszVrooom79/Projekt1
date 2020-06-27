package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPierwszy extends JPanel {

    public PanelPierwszy() {

        setLayout(null);

        JFrame one = new JFrame("Gra 2048");
        one.setSize( 500, 500);
        one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        one.setResizable(false);
//        one.setVisible(true);

 //////////////////////////////////////////////////////////////////////////////////////////
        JButton button1 = new JButton("zacznij grać");
        button1.setBounds(130, 400, 200, 30);
        button1.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        button1.setBackground(Color.orange);

        button1.addActionListener(new ActionListener() {

            @Override
                                      public void actionPerformed(ActionEvent e) {
                                          JFrame poziomy = new JFrame();
                                          poziomy.add(new WindowOne());
                                      }
                                  });


 /*
        /////////////////////////////////////////////////////////////////////////////////////////
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setLayout(null);

                JFrame window2 = new JFrame("Wybór poziomu");

                window2.setSize(500, 500);
                window2.setLocation(250, 250);
                window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window2.setResizable(false);
                window2.setVisible(true);
                JButton poziom = new JButton();
                poziom.setBackground(Color.orange);
                poziom.setBounds(170, 220, 130, 40);
                poziom.setText("wybierz poziom");
                window2.add(poziom);


            }});
*/
                one.add(button1);

//////////////////////////////////////////////////////////////////////////////////////////
        ImageIcon jpg2 = new ImageIcon("C:\\Users\\Dom\\Documents\\2049.jpg");
        JLabel jpgLabel2 = new JLabel(jpg2);
        jpgLabel2.setBounds(30, 30, 200, 200);
        one.add(jpgLabel2);

        ImageIcon jpg = new ImageIcon("C:\\Users\\Dom\\Documents\\2048.jpg");
        JLabel jpgLabel = new JLabel(jpg);
        jpgLabel.setBounds(100, 100, 1500, 1500);
        one.add(jpgLabel);

        one.setResizable(true);
        one.setVisible(true);
 //       one.add(new WindowOne());


/////////////////////////////////////////////////////////////////////////////////////////////

    }

}