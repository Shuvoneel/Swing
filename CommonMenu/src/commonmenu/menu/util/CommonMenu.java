package commonmenu.menu.util;

import commonmenu.menu.About;
import commonmenu.menu.Check_for_Update;
import commonmenu.menu.Dashboard;
import commonmenu.menu.Help_Contents;
import commonmenu.menu.Login;
import commonmenu.menu.Logout;
import commonmenu.menu.Team;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {

    public static JMenuBar getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem itemDashboard = new JMenuItem("Dashboard");
        itemDashboard.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
        itemDashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Dashboard().setVisible(true);
            }
        });

        JMenuItem itemAbout = new JMenuItem("About");
        itemAbout.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
        itemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new About().setVisible(true);
            }
        });

        JMenuItem itemTeam = new JMenuItem("Team");
        itemTeam.setAccelerator(KeyStroke.getKeyStroke('T', InputEvent.CTRL_DOWN_MASK));
        itemTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Team().setVisible(true);
            }
        });

        JMenuItem itemLogout = new JMenuItem("Logout");
        itemLogout.setAccelerator(KeyStroke.getKeyStroke('L', InputEvent.CTRL_DOWN_MASK));
        itemLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Login().setVisible(true);
            }
        });

        JMenu help = new JMenu("Help");

        JMenuItem helpContent = new JMenuItem("Help Contents");
        helpContent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Help_Contents().setVisible(true);
            }
        });

        JMenuItem checkUpdate = new JMenuItem("Check for Update");
        checkUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Check_for_Update().setVisible(true);
            }
        });

        // add four menuItem in file menu
        file.add(itemAbout);
        file.add(itemDashboard);
        file.add(itemTeam);
        file.add(itemLogout);

        // add two menuItem in help menu
        help.add(helpContent);
        help.add(checkUpdate);

        menuBar.add(file);
        menuBar.add(help);
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);

        return menuBar;
    }
}
