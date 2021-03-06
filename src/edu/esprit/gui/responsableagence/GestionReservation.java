/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui.responsableagence;

import edu.esprit.DAO.classes.ReservationDAO;
import edu.esprit.adapters.ConsulterReservations;
import edu.esprit.entities.Reservation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Houssem
 */
public class GestionReservation extends javax.swing.JFrame {

    /**
     * Creates new form GestionReservation
     */
    private List<Reservation> listeReservation;
    private NewReservation newReservationGUI;
    public GestionReservation() {
        initComponents();
        
        newReservationGUI=new NewReservation();
        
        refresh();
    }
    
    
    private void refresh(){
        listeReservation=ReservationDAO.getInstance().DisplayReservationsConfirme(true);
        jTable1.setModel(new ConsulterReservations(listeReservation));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        newReservationButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        retourButton = new javax.swing.JButton();
        recherche = new javax.swing.JTextField();
        critereRecherche = new javax.swing.JComboBox();
        rechercheButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        newReservationButton.setText("Liste Nouvelles Reservations");
        newReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReservationButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Gestion Reservation");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        critereRecherche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Client", "Chauffeur", "Type Voiture", "Adresse depart", "Adresse destination" , "Date" }));
        critereRecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                critereRechercheMouseClicked(evt);
            }
        });
        critereRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                critereRechercheActionPerformed(evt);
            }
        });

        rechercheButton.setText("Recherche");
        rechercheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(retourButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addComponent(resetButton)
                        .addGap(32, 32, 32)
                        .addComponent(refreshButton)
                        .addGap(28, 28, 28)
                        .addComponent(newReservationButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(critereRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(rechercheButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(critereRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechercheButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newReservationButton)
                    .addComponent(refreshButton)
                    .addComponent(retourButton)
                    .addComponent(resetButton))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReservationButtonActionPerformed
        newReservationGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_newReservationButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        switch (critereRecherche.getSelectedItem()+"") {
                case "Client":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    break;
                case "Chauffeur":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    break;
                case "Type Voiture":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                    break;
                case "Adresse depart":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                    break;
                case "Adresse destination":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
                    break;
                case "Date":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                    break;
                default:
                    recherche.setText("Erreur");
                    break;
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void critereRechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_critereRechercheMouseClicked
        
    }//GEN-LAST:event_critereRechercheMouseClicked

    private void critereRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_critereRechercheActionPerformed
       /* try {        
            switch (critereRecherche.getSelectedItem()+"") {
                case "Client":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                    break;
                case "Chauffeur":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                    break;
                case "Type Voiture":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                    break;
                case "Adresse depart":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                    break;
                case "Adresse destination":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
                    break;
                case "Date":
                    recherche.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
                    break;
                default:
                    recherche.setText("Erreur");
                    break;
            }
        } catch (Exception e) {
            recherche.setText("Veuillez selectionner une ligne");
        }*/
    }//GEN-LAST:event_critereRechercheActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void rechercheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheButtonActionPerformed
        List<Reservation> auxListe =new ArrayList<>();
        switch (critereRecherche.getSelectedItem()+"") {
                case "Client":
                    for (Reservation listeReservation1 : listeReservation) {
                        if(listeReservation1.getClient().getNom().equals(recherche.getText()))
                            auxListe.add(listeReservation1);
                    }
                    jTable1.setModel(new ConsulterReservations(auxListe));                    
                    break;
                case "Chauffeur":
                    for (Reservation listeReservation1 : listeReservation) {
                        if(listeReservation1.getChauffeur().getNom().equals(recherche.getText()))
                            auxListe.add(listeReservation1);
                    }
                    jTable1.setModel(new ConsulterReservations(auxListe));
                    break;
                case "Type Voiture":
                    for (Reservation listeReservation1 : listeReservation) {
                        if(listeReservation1.getTaxi().getVoiture().getTypeVoiture().equals(recherche.getText()))
                            auxListe.add(listeReservation1);
                    }
                    jTable1.setModel(new ConsulterReservations(auxListe));
                    break;
                case "Adresse depart":
                    for (Reservation listeReservation1 : listeReservation) {
                        if(listeReservation1.getTrajet().getAdresseDep().equals(recherche.getText()))
                            auxListe.add(listeReservation1);
                    }
                    jTable1.setModel(new ConsulterReservations(auxListe));
                    break;
                case "Adresse destination":
                    for (Reservation listeReservation1 : listeReservation) {
                        if(listeReservation1.getTrajet().getAdresseDest().equals(recherche.getText()))
                            auxListe.add(listeReservation1);
                    }
                    jTable1.setModel(new ConsulterReservations(auxListe));
                    break;
                case "Date":
                    for (Reservation listeReservation1 : listeReservation) {
                        if(listeReservation1.getDate().equals(recherche.getText()))
                            auxListe.add(listeReservation1);
                    }
                    jTable1.setModel(new ConsulterReservations(auxListe));
                    break;
                default:
                    recherche.setText("Erreur");
                    break;
            }
    }//GEN-LAST:event_rechercheButtonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        AccueilRespAgence.getAccueilGUI().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retourButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox critereRecherche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newReservationButton;
    private javax.swing.JTextField recherche;
    private javax.swing.JButton rechercheButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton retourButton;
    // End of variables declaration//GEN-END:variables
}
