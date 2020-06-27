package KodyChojraka;

import javax.swing.*;
import java.awt.*;

class Panel3 extends JPanel {
    static JFrame ramka;
    static JTextField emailText;
    static JPasswordField hasloText;
    static JComboBox pytanieOpcje;
    static JTextField odpowiedzText;


    public Panel3(JFrame ramka) {
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

        JLabel pytanie = new JLabel("podpowiedz:", SwingConstants.RIGHT);
        pytanie.setBounds(0, 310, 200, 30);
        pytanie.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(pytanie);

        pytanieOpcje = new JComboBox<String>(new String[]{
                "Możesz wpisać swoje pytanie lub wybrać z listy",
                "Imię pierwszego pupila",
                "Data urodzenia",
                "Nazwisko panieńskie Matki"});
        pytanieOpcje.setBounds(220, 310, 300, 30);
        pytanieOpcje.setEditable(true);
        add(pytanieOpcje);

        JLabel odpowiedz = new JLabel("odpowiedz:", SwingConstants.RIGHT);
        odpowiedz.setBounds(0, 370, 200, 30);
        odpowiedz.setFont(new Font("Waltograph UI", Font.PLAIN, 15));
        add(odpowiedz);

        odpowiedzText = new JTextField();
        odpowiedzText.setToolTipText("Min 1 liczba, wielka litera, znak specjalny");
        odpowiedzText.setBounds(220, 370, 300, 30);
        add(odpowiedzText);


        emailText = new JTextField();
        emailText.setBounds(220, 190, 300, 30);
        add(emailText);

        hasloText = new JPasswordField();
        hasloText.setToolTipText("Min 1 liczba, wielka litera, znak specjalny");
        hasloText.setEchoChar('ł');
        hasloText.setFont(new Font("Waltograph UI", Font.PLAIN, 30));
        hasloText.setBounds(220, 250, 300, 30);
        add(hasloText);


        JButton join = new JButton("Jedziemy z tym!");
        join.setBounds(90, 430, 430, 30);
        join.setBackground(Color.pink);
        join.setFont(new Font("Waltograph UI", Font.PLAIN, 20));
        join.addActionListener(new Listenery.Zarejestruj());
        add(join);

        ImageIcon gif = new ImageIcon("D:\\Nowy folder\\smile.gif");
        JLabel gifLabel = new JLabel(gif);
        gifLabel.setBounds(0, 0, 160, 160);

        add(gifLabel);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 500);
    }


}
