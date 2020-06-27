package KodyChojraka;

        import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame logowanie = new JFrame("Logowanie");

        logowanie.add(new Panel(logowanie));
        logowanie.setLocationByPlatform(true);

        logowanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logowanie.setVisible(true);
        logowanie.pack();
        //  System.out.println(logowanie.setExtendedState(logowanie.MAXIMIZED_BOTH));

    }
}