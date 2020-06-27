package KodyChojraka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static KodyChojraka.Panel.hasloText;


public class Listenery {


    static class Zaloguj implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (User.chckUser(Panel.emailText.getText(), hasloText.getPassword())) {
                JFrame zalogowano = new JFrame("Twoje konto");
                zalogowano.add(new Panel2(zalogowano, new Dimension(600, 500)));
                zalogowano.setLocationByPlatform(true);
                zalogowano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                zalogowano.pack();
                zalogowano.setVisible(true);
                Panel.ramka.setVisible(false);
                Panel.ramka.dispose();
            } else {
                int input = JOptionPane.showConfirmDialog(Panel.ramka, "Co Ty! Mordeczko, przypomnieć Ci hasło?", "Źle!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (input == 0) {
                    JFrame przypomnij = new JFrame("Odzyskiwanie hasła");
                    przypomnij.add(new Panel4(przypomnij, Panel.emailText));
                    przypomnij.setLocationByPlatform(true);
                    przypomnij.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    przypomnij.setVisible(true);
                    przypomnij.pack();
                    przypomnij.setVisible(true);
                    Panel.ramka.setVisible(false);
                    Panel.ramka.dispose();
                }
            }

        }
    }

    static class Rejestracja implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame rejestracja = new JFrame("Rejestracja");
            rejestracja.add(new Panel3(rejestracja));
            rejestracja.setLocationByPlatform(true);
            rejestracja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            rejestracja.setVisible(true);
            rejestracja.pack();
            rejestracja.setVisible(true);
            Panel.ramka.setVisible(false);
            Panel.ramka.dispose();

        }
    }

    static class ZalogujEnter implements KeyListener {


        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyChar() == 10) {
                if (User.chckUser(Panel.emailText.getText(), hasloText.getPassword())) {
                    JFrame zalogowano = new JFrame("Twoje konto");
                    zalogowano.add(new Panel2(zalogowano, new Dimension(600, 500)));
                    zalogowano.setLocationByPlatform(true);
                    zalogowano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    zalogowano.setVisible(true);
                    zalogowano.pack();
                    zalogowano.setVisible(true);
                    Panel.ramka.setVisible(false);
                    Panel.ramka.dispose();
                } else {
                    int input = JOptionPane.showConfirmDialog(Panel.ramka, "Co Ty! Mordeczko, przypomnieć Ci hasło?", "Źle!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (input == 0) {
                        JFrame przypomnij = new JFrame("Odzyskiwanie hasła");
                        przypomnij.add(new Panel4(przypomnij, Panel.emailText));
                        przypomnij.setLocationByPlatform(true);
                        przypomnij.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        przypomnij.pack();
                        przypomnij.setVisible(true);
                        Panel.ramka.setVisible(false);
                        Panel.ramka.dispose();
                    }
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    static class Zarejestruj implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!(User.chckLogin(Panel3.emailText.getText()))) {
                new User(Panel3.emailText.getText(), Panel3.hasloText.getPassword(), Panel3.pytanieOpcje.getSelectedItem().toString(), Panel3.odpowiedzText.getText());
                JOptionPane.showMessageDialog(Panel3.ramka, "Zarejestrowano użytkownika. Możesz się zalogować \nZ fartem!");
                JFrame zarejestrowano = new JFrame("Logowanie");
                zarejestrowano.add(new Panel(zarejestrowano));
                zarejestrowano.setLocationByPlatform(true);
                zarejestrowano.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                zarejestrowano.setVisible(true);
                zarejestrowano.pack();
                zarejestrowano.setVisible(true);
                Panel3.ramka.setVisible(false);
                Panel3.ramka.dispose();
            } else {
                int input = JOptionPane.showConfirmDialog(Panel3.ramka, "Mordeczko, jest już taki login! \n Przypomnieć Ci hasło?", "Źle!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (input == 0) {
                    JFrame przypomnij = new JFrame("Odzyskiwanie hasła");
                    przypomnij.add(new Panel4(przypomnij, Panel3.emailText));
                    przypomnij.setLocationByPlatform(true);
                    przypomnij.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    przypomnij.setVisible(true);
                    przypomnij.pack();
                    przypomnij.setVisible(true);
                    Panel3.ramka.setVisible(false);
                    Panel3.ramka.dispose();
                }
            }
        }
    }

    static class Reminder implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (User.chckLogin(Panel4.emailText.getText())) {
                JOptionPane.showMessageDialog(Panel4.ramka, User.chckHaslo(Panel4.emailText.getText(), Panel4.odpowiedzText.getText()));
                JFrame logowanie = new JFrame("Logowanie");
                logowanie.add(new Panel(logowanie));
                logowanie.setLocationByPlatform(true);
                logowanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                logowanie.setVisible(true);
                logowanie.pack();
                logowanie.setVisible(true);
                Panel4.ramka.setVisible(false);
                Panel4.ramka.dispose();

            } else {
                int input = JOptionPane.showConfirmDialog(Panel4.ramka, "A teraz zły login podajesz! \n Chcesz spróbować jeszcze raz?", "Źle!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (input == 1) {
                    Panel4.ramka.setVisible(false);
                    Panel4.ramka.dispose();
                }
            }

        }
    }

    static class Wyczysc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Panel.emailText.setText("");
            hasloText.setText("");
        }
    }

    static class FullScreen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame bigger = new JFrame("Twoje konto");
            Panel2.ramka.setVisible(false);
            Panel2.ramka.dispose();
            bigger.add(new Panel2(bigger, new Dimension(Toolkit.getDefaultToolkit().getScreenSize())));
            bigger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            bigger.setVisible(true);
            bigger.pack();
            bigger.setVisible(true);
            bigger.setExtendedState(bigger.MAXIMIZED_BOTH);

        }

    }

    static class Exit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Panel2.ramka.dispose();

        }

    }

    static class jfc implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fc = new JFileChooser("D:\\Nowy folder");
            int odp = fc.showDialog(Panel2.ramka, "Wybierz");
            if (odp == JFileChooser.APPROVE_OPTION)
                JOptionPane.showMessageDialog(Panel2.ramka, "Brawo, wybrałeś sobie plik", "Brawo", JOptionPane.INFORMATION_MESSAGE);
            // fc.getFileSystemView();
            // fc.isFileSelectionEnabled();

        }
    }

    static class zapisz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(Panel2.ramka, "Udawajmy, że coś zapisałeś", "Zapisano", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}