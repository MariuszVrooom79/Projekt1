package KodyChojraka;

import java.io.*;
import java.util.HashMap;
import java.util.Set;


public class User implements Serializable {

    private String login;
    private char[] password;
    private String pytanie;
    private String odpowiedz;
    private static HashMap<String, User> Users = new HashMap<String, User>();


    static {
        odczytZPliku();
    }

    public User(String login, char[] password, String pytanie, String odpowiedz) {
        if (!(Users.containsKey(login))) {
            this.login = login;
            this.password = password;
            this.pytanie = pytanie;
            this.odpowiedz = odpowiedz;
            Users.put(login, this);
            zapisDoPliku();
        }
    }


    public static boolean chckUser(String login, char[] password) {
        boolean b = false;
        if (Users.containsKey(login) && Users.get(login).getPassword().length == (password.length)) {
            b = true;
            for (int i = 0; i < password.length && b == true; i++)
                if (password[i] != Users.get(login).getPassword()[i]) b = false;
        }
        return b;
    }

    public static String chckPytanie(String login) {
        if (Users.containsKey(login))
            return Users.get(login).getPytanie();
        return "błędny login przyjacielu Siara";
    }

    public static String chckHaslo(String login, String odpowiedz) {
        StringBuilder sb = new StringBuilder();
        if (Users.containsKey(login) && Users.get(login).getOdpowiedz().trim().compareToIgnoreCase(odpowiedz.trim()) == 0)
            for (char a : Users.get(login).getPassword()) sb.append(a);
        else sb.append("błędna odpowiedź");
        return sb.toString();
    }

    public static Set getUsers() {
        return Users.keySet();
    }

    public char[] getPassword() {
        return password;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public static boolean chckLogin(String login) {
        boolean b = false;
        return (Users.containsKey(login));
    }


    public static void zapisDoPliku() {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Dom\\Documents\\ZAJĘCIA\\GUI\\data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(Users);
            oos.close();
            fos.close();

        } catch (Exception ex) {
        }
    }

    public static void odczytZPliku() {
        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\Dom\\Documents\\ZAJĘCIA\\GUI\\data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            HashMap<String, User> list = (HashMap<String, User>) ois.readObject();

            ois.close();
            fis.close();

            Users = list;

        } catch (Exception ex) {

        }
    }


    @Override
    public String toString() {
        return getOdpowiedz() + getPytanie();
    }


}

