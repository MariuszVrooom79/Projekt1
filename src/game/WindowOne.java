package game;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowOne extends JPanel {


    public WindowOne() {

        setLayout(null);

        JFrame two = new JFrame("Gra 2048");
        two.setLocation(300, 300);
        two.setSize(500, 500);
        two.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        two.setResizable(true);
        two.setVisible(true);
        two.setBackground(Color.magenta);


//////////////////////////////////////////////////////////////////////////////////

        JButton poziomy = new JButton("wybierz poziom");
        poziomy.setBackground(Color.yellow);
        poziomy.setBounds(150, 350, 150, 40);
        poziomy.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Poziom1 poziom1 = new Poziom1();
               Poziom1 poziom2 = new Poziom1();

            }
        });

        two.add(poziomy);


    }

}
