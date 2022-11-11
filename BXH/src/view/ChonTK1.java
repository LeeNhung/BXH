
package view;

import dao.VongDauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.BTC;
import model.VongDau;


public class ChonTK1 extends javax.swing.JFrame {

    private BTC btc;
    private ArrayList<VongDau> lr;
    public ChonTK1(BTC btc) throws SQLException {
        initComponents();
        this.btc=btc;
        VongDauDAO rdao = new VongDauDAO();
        lr = rdao.getVongDauDaDau();
        if(lr != null){
            for (VongDau i : lr) {
                CbxChonVongDau.addItem(i.getName());
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CbxChonVongDau = new javax.swing.JComboBox<>();
        BtnXem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chọn vòng đấu");

        jLabel2.setText("Vòng đấu:");

        CbxChonVongDau.setToolTipText("");
        CbxChonVongDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxChonVongDauActionPerformed(evt);
            }
        });

        BtnXem.setText("Xem");
        BtnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CbxChonVongDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(BtnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbxChonVongDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnXem)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXemActionPerformed

        // TODO add your handling code here:
        if((evt.getSource() instanceof JButton)&&(((JButton)evt.getSource()).equals(BtnXem))) {
            try {
                //            try {
//                String rname = (String) CbxChonVongDau.getSelectedItem();
//                (new TKCoThu1(rname)).setVisible(true);
//                this.dispose();
//            } catch (SQLException ex) {
//                Logger.getLogger(ChonTK1.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }else
//            JOptionPane.showMessageDialog(this, "This function is under construction!");
VongDauDAO rdao = new VongDauDAO();
lr = rdao.getVongDauDaDau();
String rname = (String) CbxChonVongDau.getSelectedItem();
if(lr != null){
    for (VongDau i : lr) {
        if(rname.equalsIgnoreCase(i.getName())){
            (new TKCoThu1(i)).setVisible(true);
            this.dispose();
        }
    }
}   } catch (SQLException ex) {
                Logger.getLogger(ChonTK1.class.getName()).log(Level.SEVERE, null, ex);
            }}
        
    }//GEN-LAST:event_BtnXemActionPerformed

    private void CbxChonVongDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxChonVongDauActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_CbxChonVongDauActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnXem;
    private javax.swing.JComboBox<String> CbxChonVongDau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


}
