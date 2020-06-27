package KodyChojraka;

import javax.swing.*;
import java.awt.*;

class Panel4 extends JPanel {
    static JFrame ramka;
    static JLabel email;
    static JTextField emailText;
    static JTextField odpowiedzText;

    public Panel4(JFrame ramka, JTextField emailText) {
        this.ramka = ramka;
        this.emailText = emailText;
        setLayout(null);

        email = new JLabel("e-mail:", SwingConstants.RIGHT);
        email.setBounds(0, 190, 200, 30);
        email.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(email);

        emailText.setBounds(220, 190, 300, 30);
        add(emailText);

        JLabel podpowiedzText = new JLabel(User.chckPytanie(emailText.getText()), SwingConstants.LEFT);
        podpowiedzText.setBounds(220,250,300,30);
        //  podpowiedzText.setFont(new Font ("Waltograph UI", Font.PLAIN, 15));
        add(podpowiedzText);


        JLabel podpowiedz = new JLabel("podpowiedz:", SwingConstants.RIGHT);
        podpowiedz.setBounds(0,250,200,30);
        podpowiedz.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(podpowiedz);

        JLabel odpowiedz = new JLabel("odpowiedz:", SwingConstants.RIGHT);
        odpowiedz.setBounds(0,310,200,30);
        odpowiedz.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(odpowiedz);

        odpowiedzText = new JTextField();
        odpowiedzText.setBounds(220,310,300,30);
        add(odpowiedzText);

        JButton remind = new JButton("Wyświetl moje hasło");
        remind.setBounds(90, 370, 430, 30);
        remind.setBackground(Color.pink);
        remind.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        remind.addActionListener(new Listenery.Reminder());
        add(remind);

        ImageIcon gif = new ImageIcon("D:\\Nowy folder\\smile.gif");
        JLabel gifLabel = new JLabel(gif);
        gifLabel.setBounds(0, 0, 160, 160);

        add(gifLabel);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600,500);
    }
}
