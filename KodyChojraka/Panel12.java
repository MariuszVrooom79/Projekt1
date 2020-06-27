package KodyChojraka;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

class Panel2 extends JPanel {
    static JFrame ramka;
    static Dimension dimension;


    public Panel2(JFrame ramka, Dimension dimension) {
        this.ramka = ramka;
        this.dimension = dimension;
        setLayout(null);

        JMenuItem plik1 = new JMenuItem("Preferencje");
        JMenu plik2 = new JMenu("Opcje");
        JMenuItem plik3 = new JMenuItem("Zakończ");
        JMenu menu1 = new JMenu("Plik");

        JMenuItem opcje1 = new JMenuItem("Pełny Ekran");
        opcje1.addActionListener(new Listenery.FullScreen());
        plik2.add(opcje1);
        plik3.addActionListener(new Listenery.Exit());

        menu1.add(plik1);
        menu1.add(plik2);
        menu1.add(plik3);
        JMenuBar bar = new JMenuBar();
        bar.setBounds(0, 0, dimension.width, 30);
        bar.add(menu1);
        add(bar);


        JButton tool1 = new JButton();
        tool1.setToolTipText("wybierz plik");
        Icon otworz = new ImageIcon("D:\\Nowy folder\\otworz.png");
        tool1.setIcon(otworz);

        tool1.setIcon(otworz);
        tool1.addActionListener(new Listenery.jfc());
        JButton tool2 = new JButton();
        Icon zapisz = new ImageIcon("D:\\Nowy folder\\zapisz.png");
        tool2.setIcon(zapisz);
        tool2.setToolTipText("zapisz plik");
        tool2.addActionListener(new Listenery.zapisz());
        JButton tool3 = new JButton("przycisk 3");
        JButton tool4 = new JButton("przycisk 4");


        JToolBar tool = new JToolBar();
        tool.setBounds(0, 30, dimension.width, 30);
        tool.setFloatable(false);
        tool.add(tool1);
        tool.add(tool2);
        tool.add(tool3);
        tool.add(tool4);
        add(tool);

        JLabel powitanie = new JLabel("No brawo, Mordo!", SwingConstants.CENTER);
        powitanie.setBounds(0, 250, dimension.width, dimension.height / 10);
        powitanie.setFont(new Font("Waltograph UI", Font.PLAIN, 30));
        add(powitanie);


        ImageIcon gif = new ImageIcon("D:\\Nowy folder\\smile.gif");
        JLabel gifLabel = new JLabel(gif);
        gifLabel.setBounds(0, 60, 160, 160);
        add(gifLabel);

        JScrollBar sb = new JScrollBar();
        sb.setBounds(dimension.width / 4 + dimension.width / 2 + 20, dimension.height / 4 * 3, 20, dimension.height / 6);

        DefaultListModel dane = new DefaultListModel();
        dane.addAll(User.getUsers());
        add(sb);


        JList lista = new JList(dane);
        JScrollPane sp = new JScrollPane(lista);
        sp.setBounds(dimension.width / 4, dimension.height / 4 * 3, dimension.width / 2, dimension.height / 6);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(sp);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Odbyte lekcje z javy");
        DefaultMutableTreeNode remotely = new DefaultMutableTreeNode("zajęcia zdalne");
        DefaultMutableTreeNode absence = new DefaultMutableTreeNode("nieusprawiedliwione nieobecności");
        DefaultMutableTreeNode present = new DefaultMutableTreeNode("zajęcia stacjonarne");
        DefaultMutableTreeNode lesson1 = new DefaultMutableTreeNode("Lekcja 1 - 2020-02-06");
        DefaultMutableTreeNode lesson2 = new DefaultMutableTreeNode("Lekcja 2 - 2020-02-11");
        DefaultMutableTreeNode lesson3 = new DefaultMutableTreeNode("Lekcja 3 - 2020-02-24");
        DefaultMutableTreeNode lesson4 = new DefaultMutableTreeNode("Lekcja 4 - 2020-02-26");
        DefaultMutableTreeNode lesson5 = new DefaultMutableTreeNode("Lekcja 5 - 2020-03-02");
        DefaultMutableTreeNode lesson6 = new DefaultMutableTreeNode("Lekcja 6 - 2020-03-04");
        DefaultMutableTreeNode lesson7 = new DefaultMutableTreeNode("Lekcja 7 - 2020-03-09");
        DefaultMutableTreeNode lesson8 = new DefaultMutableTreeNode("Lekcja 8 - 2020-03-11");
        DefaultMutableTreeNode lesson9 = new DefaultMutableTreeNode("Lekcja 9 - 2020-04-20");
        DefaultMutableTreeNode lesson10 = new DefaultMutableTreeNode("Lekcja 10 - 2020-04-23");
        DefaultMutableTreeNode lesson11 = new DefaultMutableTreeNode("Lekcja 11 - 2020-04-28");
        DefaultMutableTreeNode lesson12 = new DefaultMutableTreeNode("Lekcja 12 - 2020-04-30");
        DefaultMutableTreeNode lesson13 = new DefaultMutableTreeNode("Lekcja 13 - 2020-05-11");
        DefaultMutableTreeNode lesson14 = new DefaultMutableTreeNode("Lekcja 14 - 2020-05-14");
        DefaultMutableTreeNode lesson15 = new DefaultMutableTreeNode("Lekcja 15 - 2020-05-18");
        DefaultMutableTreeNode lesson16 = new DefaultMutableTreeNode("Lekcja 16 - 2020-05-21");
        root.add(present);
        root.add(absence);
        root.add(remotely);

        remotely.add(lesson9);
        remotely.add(lesson10);
        remotely.add(lesson11);
        remotely.add(lesson12);
        remotely.add(lesson13);
        remotely.add(lesson14);
        remotely.add(lesson15);
        remotely.add(lesson16);
        present.add(lesson1);
        present.add(lesson2);
        present.add(lesson7);
        present.add(lesson8);
        absence.add(lesson3);
        absence.add(lesson4);
        absence.add(lesson5);
        absence.add(lesson6);


        JTree tree = new JTree(root);

        JScrollPane sp1 = new JScrollPane(tree);
        sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp1.setBounds(10, 230, dimension.width / 4 - 30, dimension.height - 250);
        add(sp1);

       /* JLayeredPane jp = new JLayeredPane();
        jp.setPreferredSize(new Dimension(600,500));
        jp.setBounds(200,10,200,160);
        jp.setLayer(this,0);
        add(jp);*/


    }

    @Override
    public Dimension getPreferredSize() {
        return dimension;
    }
}

