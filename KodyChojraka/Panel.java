package KodyChojraka;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    static JFrame ramka;
    static JPasswordField hasloText;
    static JTextField emailText;


    public Panel(JFrame ramka) {
        this.ramka = ramka;
        setLayout(null);


        JLabel email = new JLabel("e-mail:", SwingConstants.RIGHT);
        email.setBounds(0, 190, 200, 30);
        email.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(email);

        JLabel haslo = new JLabel("haslo:", SwingConstants.RIGHT);
        haslo.setBounds(0, 250, 200, 30);
        haslo.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(haslo);


        emailText = new JTextField();
        emailText.setBounds(220, 190, 300, 30);
        add(emailText);

        hasloText = new JPasswordField();
        hasloText.setToolTipText("Min 1 liczba, wielka litera, znak specjalny");
        hasloText.setBounds(220, 250, 300, 30);
        hasloText.setEchoChar('Å');
        hasloText.setFont(new Font("Waltograph UI", Font.PLAIN, 30));
        hasloText.addKeyListener(new Listenery.ZalogujEnter());
        add(hasloText);
//////////////////////////////////////////////////////////////////////////////////////////////////////

        JButton clear = new JButton("Wyczysc");
        clear.setBounds(90, 380, 200, 30);
        clear.setBackground(Color.pink);
        clear.setFont(new Font("Waltograph UI", Font.PLAIN, 20));
        clear.addActionListener(new Listenery.Wyczysc());
        add(clear);
//////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton login = new JButton("Zaloguj");
        login.setBounds(320, 380, 200, 30);
        login.setBackground(Color.pink);
        login.setFont(new Font("Waltograph UI", Font.PLAIN, 20));
        login.addActionListener(new Listenery.Zaloguj());
        add(login);
//////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton register = new JButton("Zarejestruj sie");
        register.setBounds(90, 320, 430, 30);
        register.setBackground(Color.pink);
        register.setFont(new Font("Waltograph UI", Font.PLAIN, 17));
        register.addActionListener(new Listenery.Rejestracja());
        add(register);

///////////////////////////////////////////////////////////////////////////////////////////////////

        ImageIcon gif = new ImageIcon("D:\\Nowy folder\\smile.gif");
        JLabel gifLabel = new JLabel(gif);
        gifLabel.setBounds(0, 0, 160, 160);
        add(gifLabel);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 500);
    }

}


