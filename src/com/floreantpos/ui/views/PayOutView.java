/*
 * PayOutView.java
 *
 * Created on August 25, 2006, 8:15 PM
 */

package com.floreantpos.ui.views;

import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import com.floreantpos.main.Application;
import com.floreantpos.model.PayoutReason;
import com.floreantpos.model.PayoutRecepient;
import com.floreantpos.model.dao.PayoutReasonDAO;
import com.floreantpos.model.dao.PayoutRecepientDAO;
import com.floreantpos.swing.TransparentPanel;
import com.floreantpos.ui.dialog.NotesDialog;

/**
 *
 * @author  MShahriar
 */
public class PayOutView extends TransparentPanel {
    
    /** Creates new form PayOutView */
    public PayOutView() {
        initComponents();
    }
    
    public void initialize() {
    	PayoutReasonDAO reasonDAO = new PayoutReasonDAO();
    	List<PayoutReason> reasons = reasonDAO.findAll();
    	cbReason.setModel(new DefaultComboBoxModel(reasons.toArray()));
    	
    	PayoutRecepientDAO recepientDAO = new PayoutRecepientDAO();
    	List<PayoutRecepient> recepients = recepientDAO.findAll();
    	cbRecepient.setModel(new DefaultComboBoxModel(new Vector(recepients)));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        numberSelectionView = new com.floreantpos.ui.views.NumberSelectionView();
        jLabel1 = new javax.swing.JLabel();
        cbReason = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbRecepient = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnAddNote = new com.floreantpos.swing.PosButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfNote = new javax.swing.JTextArea();

        numberSelectionView.setTitle(com.floreantpos.POSConstants.AMOUNT_PAID_OUT);
        numberSelectionView.setDecimalAllowed(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText(com.floreantpos.POSConstants.PAY_OUT_REASON);

        cbReason.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText(com.floreantpos.POSConstants.SELECT_PAY_OUT_RECEPIENT);

        cbRecepient.setFont(new java.awt.Font("Tahoma", 1, 18));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText(com.floreantpos.POSConstants.NOTES);

        btnAddNote.setText("...");
        btnAddNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNoteActionPerformed(evt);
            }
        });

        tfNote.setColumns(20);
        tfNote.setEditable(false);
        tfNote.setLineWrap(true);
        tfNote.setRows(5);
        tfNote.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tfNote);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(numberSelectionView, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cbRecepient, 0, 425, Short.MAX_VALUE)
                    .add(cbReason, 0, 425, Short.MAX_VALUE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnAddNote, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(numberSelectionView, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 347, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbReason, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbRecepient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(35, 35, 35)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                            .add(btnAddNote, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {cbReason, cbRecepient}, org.jdesktop.layout.GroupLayout.VERTICAL);

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNoteActionPerformed
    	NotesDialog dialog = new NotesDialog(Application.getPosWindow(), true);
    	dialog.setTitle(com.floreantpos.POSConstants.ENTER_PAYOUT_NOTE);
    	dialog.pack();
    	dialog.open();
    	
    	if(!dialog.isCanceled()) {
    		tfNote.setText(dialog.getNote());
    	}
    }//GEN-LAST:event_btnAddNoteActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.floreantpos.swing.PosButton btnAddNote;
    private javax.swing.JComboBox cbReason;
    private javax.swing.JComboBox cbRecepient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.floreantpos.ui.views.NumberSelectionView numberSelectionView;
    private javax.swing.JTextArea tfNote;
    // End of variables declaration//GEN-END:variables
    
    public double getPayoutAmount() {
    	return numberSelectionView.getValue();
    }
    
    public String getNote() {
    	return tfNote.getText();
    }
    
    public PayoutReason getReason() {
    	return (PayoutReason) cbReason.getSelectedItem();
    }
    
    public PayoutRecepient getRecepient() {
    	return (PayoutRecepient) cbRecepient.getSelectedItem();
    }
}
