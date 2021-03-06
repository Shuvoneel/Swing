package TailorShop.util;

import TailorShop.View.CategoryView;
import TailorShop.View.ClientDetailsView;
import TailorShop.View.ClientView;
import TailorShop.View.DeliveryView;
import TailorShop.View.HelpView;
import TailorShop.View.HomeView;
import TailorShop.View.MeasurementView;
import TailorShop.View.RequisitionView;
import TailorShop.View.SummaryView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class CommonMenu {

    public static JMenuBar getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();

        // Add File menu and Menu item to File
        JMenu file = new JMenu("File");

        JMenuItem itemHome = new JMenuItem("Home");
        itemHome.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
        itemHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new HomeView().setVisible(true);
            }
        });

        JMenuItem itemCategory = new JMenuItem("Category");
        itemCategory.setAccelerator(KeyStroke.getKeyStroke('B', InputEvent.CTRL_DOWN_MASK));
        itemCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new CategoryView().setVisible(true);
            }
        });

        JMenuItem itemClient = new JMenuItem("Honorable Clients");
        itemClient.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK));
        itemClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ClientView().setVisible(true);
            }
        });

        JMenuItem itemMeasurement = new JMenuItem("Measurements");
        itemMeasurement.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
        itemMeasurement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new MeasurementView().setVisible(true);
            }
        });

        JMenuItem itemOrder = new JMenuItem("Orders");
        itemOrder.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));
        itemOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new RequisitionView().setVisible(true);
            }
        });

        JMenuItem itemDelivery = new JMenuItem("Deliveries");
        itemDelivery.setAccelerator(KeyStroke.getKeyStroke('F', InputEvent.CTRL_DOWN_MASK));
        itemDelivery.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DeliveryView().setVisible(true);
            }
        });

        JMenuItem itemSummary = new JMenuItem("Summary");
        itemSummary.setAccelerator(KeyStroke.getKeyStroke('G', InputEvent.CTRL_DOWN_MASK));
        itemSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SummaryView().setVisible(true);
            }
        });

        JMenuItem itemSpecificClients = new JMenuItem("Clients Order Details");
        itemSpecificClients.setAccelerator(KeyStroke.getKeyStroke('H', InputEvent.CTRL_DOWN_MASK));
        itemSpecificClients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ClientDetailsView().setVisible(true);
            }
        });

        JMenuItem itemExit = new JMenuItem("Exit the Program");
        itemExit.setAccelerator(KeyStroke.getKeyStroke('I', InputEvent.CTRL_DOWN_MASK));
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dialogBtn = 0;
                int dialogRslt = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Warning !", dialogBtn);
                if (dialogRslt == JOptionPane.YES_OPTION) {
                    System.out.println("Program Closed !");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Okay ! Complete your task.");
                }
            }
        });

        file.add(itemHome);
        file.add(itemCategory);
        file.add(itemClient);
        file.add(itemMeasurement);
        file.add(itemOrder);
        file.add(itemDelivery);
        file.add(itemSpecificClients);
        file.add(itemSummary);
        file.add(itemExit);
        menuBar.add(file);

        // Add Help menu and Menu item to Help
        JMenu help = new JMenu("Help");
        JMenuItem itemHelp = new JMenuItem("Service Provider");
        itemHelp.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
        itemHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new HelpView().setVisible(true);
            }
        });

        help.add(itemHelp);
        menuBar.add(help);

        f.setJMenuBar(menuBar);
        f.setVisible(true);

        return menuBar;
    }
}
