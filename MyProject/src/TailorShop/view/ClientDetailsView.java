package TailorShop.view;

import TailorShop.dao.CategoryDao;
import TailorShop.dao.ClientDetailsDao;
import TailorShop.pojo.Category;
import TailorShop.pojo.ClientDetails;
import TailorShop.service.CategoryDaoImpl;
import TailorShop.service.ClientDetailsDaoImpl;
import TailorShop.util.CommonMenu;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClientDetailsView extends javax.swing.JFrame {

    public ClientDetailsView() {
        initComponents();
        displayListIntoTable();
        CommonMenu.getCommonMenu(this);
    }

    public void displayListIntoTable() {
        clearTable();
        ClientDetailsDao dao = new ClientDetailsDaoImpl();
        CategoryDao categoryDao = new CategoryDaoImpl();
        List<ClientDetails> list = dao.getDetails();
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] cols = new Object[7];

        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getName();
            cols[1] = list.get(i).getMobile();
            cols[2] = list.get(i).getEmail();
            cols[3] = list.get(i).getAddress();
            Category category = categoryDao.getCategoryById(list.get(i).getCategory());
            cols[4] = category.getCatName();
            cols[5] = list.get(i).getQuantity();
            cols[6] = list.get(i).getOrderDate();
            model.addRow(cols);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        btnEmail = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnMobile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clients Order Details");

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 51));

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mobile", "Email", "Address", "Category", "Quantity", "Order Date"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Find data with Mobile");

        txtMobile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEmail.setText("Email Search");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Find data with Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnMobile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMobile.setText("Mobile Search");
        btnMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMobileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMobile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmail)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        clearTable();
        String email = txtEmail.getText();
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] cols = new Object[7];
        ClientDetailsDao details = new ClientDetailsDaoImpl();
        CategoryDao categoryDao = new CategoryDaoImpl();
        List<ClientDetails> list1 = details.getClientDetailsByEmail(email);
        for (int i = 0; i < list1.size(); i++) {
            cols[0] = list1.get(i).getName();
            cols[1] = list1.get(i).getMobile();
            cols[2] = list1.get(i).getEmail();
            cols[3] = list1.get(i).getAddress();
            Category category = categoryDao.getCategoryById(list1.get(i).getCategory());
            cols[4] = category.getCatName();
            cols[5] = list1.get(i).getQuantity();
            cols[6] = list1.get(i).getOrderDate();
        }
        model.addRow(cols);
    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMobileActionPerformed
        clearTable();
        int mobile = Integer.parseInt(txtMobile.getText());
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        Object[] cols = new Object[7];
        ClientDetailsDao details = new ClientDetailsDaoImpl();
        CategoryDao categoryDao = new CategoryDaoImpl();
        List<ClientDetails> list = details.getClientDetailsByMobile(mobile);
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getName();
            cols[1] = list.get(i).getMobile();
            cols[2] = list.get(i).getEmail();
            cols[3] = list.get(i).getAddress();
            Category category = categoryDao.getCategoryById(list.get(i).getCategory());
            cols[4] = category.getCatName();
            cols[5] = list.get(i).getQuantity();
            cols[6] = list.get(i).getOrderDate();
            model.addRow(cols);
        }

    }//GEN-LAST:event_btnMobileActionPerformed

    /**
     * @param args the command line arguments
     */
    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientDetailsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientDetailsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnMobile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables
}