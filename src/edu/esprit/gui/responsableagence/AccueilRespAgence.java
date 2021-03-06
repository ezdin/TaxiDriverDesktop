/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui.responsableagence;

import edu.esprit.DAO.classes.AgenceDAO;
import edu.esprit.DAO.classes.ResponsableAgenceDAO;
import edu.esprit.entities.Agence;
import edu.esprit.entities.ResponsableAgence;

/**
 *
 * @author Houssem
 */
public class AccueilRespAgence extends javax.swing.JFrame {

    /**
     * Creates new form AccueilChauffeur
     */
    
    private static ResponsableAgence respAgence;
    private static Agence agence;
    
    private static ProfileRespAgence profileGUI;
    private static GestionChauffeur gestionChauffeurGUI;
    private static GestionVoiture gestionVoitureGUI;
    private static MonAgence monAgenceGUI;
    private static GestionReclamation gestionReclamationGUI;
    private static GestionReservation gestionReservationGUI;
    private static GestionTrajet gestionTrajetGUI;
    private static GestionOffre gestionOffreGUI;
    private static GestionTaxi gestionTaxiGUI;
    
    private static AccueilRespAgence AccueilGUI;
    
    public AccueilRespAgence() {
        initComponents();
    }
    
    public AccueilRespAgence(String login) {
        initComponents();
        
        respAgence=ResponsableAgenceDAO.getInstance().findRespAgenceByLogin(login);
        agence=AgenceDAO.getInstance().findAgenceByRespAgence(respAgence.getIdResponsableAgence());

        AccueilGUI=this;
        profileGUI=new ProfileRespAgence();
        gestionChauffeurGUI=new GestionChauffeur();
        gestionVoitureGUI=new GestionVoiture();
        monAgenceGUI=new MonAgence();
        gestionReclamationGUI= new GestionReclamation();
        gestionReservationGUI= new GestionReservation();
        gestionTrajetGUI= new GestionTrajet();
        gestionOffreGUI=new GestionOffre();
        gestionTaxiGUI=new GestionTaxi();
        
    }

    public static Agence getAgence() {
        return agence;
    }    
    
    public static ResponsableAgence getRespAgence() {
        return respAgence;
    }

    public static void setRespAgence(ResponsableAgence respAgence) {
        AccueilRespAgence.respAgence = respAgence;
    }

    public static void setAgence(Agence agence) {
        AccueilRespAgence.agence = agence;
    }

    public static ProfileRespAgence getProfileGUI() {
        return profileGUI;
    }

    public static GestionChauffeur getGestionChauffeurGUI() {
        return gestionChauffeurGUI;
    }

    public static GestionVoiture getGestionVoitureGUI() {
        return gestionVoitureGUI;
    }

    public static MonAgence getMonAgenceGUI() {
        return monAgenceGUI;
    }

    public static GestionReclamation getGestionReclamationGUI() {
        return gestionReclamationGUI;
    }

    public static GestionReservation getGestionReservationGUI() {
        return gestionReservationGUI;
    }

    public static AccueilRespAgence getAccueilGUI() {
        return AccueilGUI;
    }

    public static GestionTrajet getGestionTrajetGUI() {
        return gestionTrajetGUI;
    }

    public static GestionOffre getGestionOffreGUI() {
        return gestionOffreGUI;
    }

    public static GestionTaxi getGestionTaxiGUI() {
        return gestionTaxiGUI;
    }

    public static void setGestionTaxiGUI(GestionTaxi gestionTaxiGUI) {
        AccueilRespAgence.gestionTaxiGUI = gestionTaxiGUI;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chauffeurButton = new javax.swing.JButton();
        voitureButton = new javax.swing.JButton();
        agenceButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        reservationButton = new javax.swing.JButton();
        reclamationButton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        taxiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chauffeurButton.setText("Gestion Chauffeur");
        chauffeurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chauffeurButtonActionPerformed(evt);
            }
        });

        voitureButton.setText("Gestion Voiture");
        voitureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voitureButtonActionPerformed(evt);
            }
        });

        agenceButton.setText("Gestion Agence");
        agenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenceButtonActionPerformed(evt);
            }
        });

        profileButton.setText("Profile");
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });

        reservationButton.setText("Gestion Reservation");
        reservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationButtonActionPerformed(evt);
            }
        });

        reclamationButton.setText("Gestion Reclamation");
        reclamationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamationButtonActionPerformed(evt);
            }
        });

        jButton8.setText("Gestion Trajet");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Gestion Offre");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        taxiButton.setText("Gestion Taxi");
        taxiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taxiButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton8)
                            .addComponent(agenceButton)
                            .addComponent(voitureButton)
                            .addComponent(chauffeurButton)
                            .addComponent(profileButton)
                            .addComponent(reclamationButton))
                        .addComponent(reservationButton)))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(chauffeurButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voitureButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agenceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reclamationButton)
                .addGap(30, 30, 30)
                .addComponent(reservationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(taxiButton)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chauffeurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chauffeurButtonActionPerformed
        gestionChauffeurGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_chauffeurButtonActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        profileGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_profileButtonActionPerformed

    private void voitureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voitureButtonActionPerformed
        gestionVoitureGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voitureButtonActionPerformed

    private void agenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenceButtonActionPerformed
        monAgenceGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_agenceButtonActionPerformed

    private void reservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationButtonActionPerformed
        gestionReservationGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reservationButtonActionPerformed

    private void reclamationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationButtonActionPerformed
        gestionReclamationGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reclamationButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        gestionTrajetGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        gestionOffreGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void taxiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiButtonActionPerformed
        gestionTaxiGUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_taxiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AccueilRespAgence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilRespAgence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilRespAgence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilRespAgence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AccueilRespAgence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agenceButton;
    private javax.swing.JButton chauffeurButton;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton reclamationButton;
    private javax.swing.JButton reservationButton;
    private javax.swing.JButton taxiButton;
    private javax.swing.JButton voitureButton;
    // End of variables declaration//GEN-END:variables
}
