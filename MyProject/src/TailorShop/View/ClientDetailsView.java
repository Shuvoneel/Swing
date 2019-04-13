package TailorShop.View;

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
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnMobile = new javax.swing.JButton();
        txtMobile = new javax.swing.JTextField();
        btnEmail = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Clients Order Details");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 102)));

        btnMobile.setText("Search by Mobile");
        btnMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMobileActionPerformed(evt);
            }
        });

        txtMobile.setBackground(new java.awt.Color(153, 153, 153));
        txtMobile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtMobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEmail.setText("Search by Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(153, 153, 153));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mobile", "Email", "Address", "Category", "Quantity", "Order Date"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        jTextField2.setBackground(new java.awt.Color(51, 0, 0));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Copyright @ Shuvo/01717677451");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 387, Short.MAX_VALUE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMobile)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(190, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
        model.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables
}
