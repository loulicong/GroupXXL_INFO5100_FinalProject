/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PregnantRole;

import System.CareCenterSystem;

import System.Hospital.Hospital;
import System.UserAccount.UserAccount;
import System.InRequest.InRequest;
import System.Pregnant.Pregnant;

import java.awt.CardLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PregnantMain extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CareCenterSystem system;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PregnantMain(JPanel userProcessContainer, UserAccount account,CareCenterSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system= system;
        valueLabel.setText(account.getUsername());
//        for(InRequest inRequest :system.getRequestInList().getWorkRequestList()){
//            if(inRequest.getSender().getPassword().equals(userAccount.getPassword())&& inRequest.getSender().getUsername().equals(userAccount.getUsername())){
//                userAccount.getRequestInList().getWorkRequestList().add(inRequest);
//            }
//        }
//        populateRequestTable();
    }
    
    public void populateRequestTable(){
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
//        model.setRowCount(0);
//        for(InRequest s:system.getRequestInList().getWorkRequestList()){
//            Object[] row = new Object[4];
//            row[0]=s.getMessage();
//            row[1]=s.getSender();
//            row[2]=s.getStatus();
//            row[3]=s.getResult();
//            model.addRow(row);
//        }
//        DefaultTableModel model_1 = (DefaultTableModel) orderJTable.getModel();
//        model_1.setRowCount(0);
//        for(Hospital s:system.getRestaurantDirectory().getRestaurantArrayList()){
//            Object[] row = new Object[2];
//            row[0]=s.getName();
//            model_1.addRow(row);
//        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        HospitalRequestIn = new javax.swing.JButton();
        HospitalRequestOut = new javax.swing.JButton();
        PersonalCheck = new javax.swing.JButton();
        Baby = new javax.swing.JButton();
        PRCRequestIn = new javax.swing.JButton();
        PRCRequestOut = new javax.swing.JButton();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        HospitalRequestIn.setText("Request In a Hospital");
        HospitalRequestIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalRequestInActionPerformed(evt);
            }
        });

        HospitalRequestOut.setText("Request Out a Hospital");
        HospitalRequestOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalRequestOutActionPerformed(evt);
            }
        });

        PersonalCheck.setText("Personal Body Check");
        PersonalCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalCheckActionPerformed(evt);
            }
        });

        Baby.setText("Baby");
        Baby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabyActionPerformed(evt);
            }
        });

        PRCRequestIn.setText("Request in a PRC");
        PRCRequestIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRCRequestInActionPerformed(evt);
            }
        });

        PRCRequestOut.setText("Request Out a PRC");
        PRCRequestOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRCRequestOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HospitalRequestOut)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HospitalRequestIn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PersonalCheck)))
                        .addGap(28, 28, 28)
                        .addComponent(Baby))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PRCRequestOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(PRCRequestIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalRequestIn)
                    .addComponent(PersonalCheck)
                    .addComponent(Baby))
                .addGap(18, 18, 18)
                .addComponent(HospitalRequestOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRCRequestIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRCRequestOut)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalRequestInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalRequestInActionPerformed
        // TODO add your handling code here:
        RequestInHospitalJPanel in=new RequestInHospitalJPanel(userProcessContainer,system,userAccount);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(in);
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_HospitalRequestInActionPerformed

    private void HospitalRequestOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalRequestOutActionPerformed
        // TODO add your handling code here:
        Pregnant pregnant=system.getPregnantDirectory().searchPregnant(userAccount.getUsername());
        pregnant.setHospitalstatu("Out");
        JOptionPane.showMessageDialog(this,"Out Succesfully!");

    }//GEN-LAST:event_HospitalRequestOutActionPerformed

    private void PRCRequestInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRCRequestInActionPerformed
        // TODO add your handling code here:
        RequestInPRCJPanel in=new RequestInPRCJPanel(userProcessContainer,system,userAccount);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(in);
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_PRCRequestInActionPerformed

    private void PRCRequestOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRCRequestOutActionPerformed
        // TODO add your handling code here:
        Pregnant pregnant=system.getPregnantDirectory().searchPregnant(userAccount.getUsername());
        pregnant.setPRCstatu("Out");
        JOptionPane.showMessageDialog(this,"Out Succesfully!");
    }//GEN-LAST:event_PRCRequestOutActionPerformed

    private void BabyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabyActionPerformed
        // TODO add your handling code here:
        BabyInfoJPanel in=new BabyInfoJPanel(userProcessContainer,system,userAccount);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(in);
        crdLyt.next(userProcessContainer);
    }//GEN-LAST:event_BabyActionPerformed

    private void PersonalCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonalCheckActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baby;
    private javax.swing.JButton HospitalRequestIn;
    private javax.swing.JButton HospitalRequestOut;
    private javax.swing.JButton PRCRequestIn;
    private javax.swing.JButton PRCRequestOut;
    private javax.swing.JButton PersonalCheck;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
