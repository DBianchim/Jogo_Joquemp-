/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.joquempo;

/**
 *
 * @author 202228319
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
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

        jLabel2 = new javax.swing.JLabel();
        btnPedra = new javax.swing.JButton();
        btnTesoura = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblBot = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblVitoria = new javax.swing.JLabel();
        lblEmpate = new javax.swing.JLabel();
        lblDerrota = new javax.swing.JLabel();
        lblPlacarEmpate = new javax.swing.JLabel();
        lblPlacarDerrota = new javax.swing.JLabel();
        lblPlacarVitoria = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPedra.setText("Pedra");
        btnPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedraActionPerformed(evt);
            }
        });

        btnTesoura.setText("Tesoura");
        btnTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTesouraActionPerformed(evt);
            }
        });

        btnPapel.setText("Papel");
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Joquempô ?");

        lblUsuario.setText("Usuario:");

        lblBot.setText("Bot:");

        lblResultado.setText("Resultado:");

        lblVitoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVitoria.setText("Vitorias");

        lblEmpate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpate.setText("Empate");

        lblDerrota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDerrota.setText("Derrota");

        lblPlacarEmpate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlacarEmpate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlacarEmpate.setText("0");

        lblPlacarDerrota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlacarDerrota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlacarDerrota.setText("0");

        lblPlacarVitoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlacarVitoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlacarVitoria.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBot)
                            .addComponent(lblResultado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPedra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVitoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlacarVitoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTesoura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmpate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlacarEmpate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDerrota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlacarDerrota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedra)
                    .addComponent(btnTesoura)
                    .addComponent(btnPapel))
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblBot)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVitoria)
                    .addComponent(lblEmpate)
                    .addComponent(lblDerrota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlacarEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlacarDerrota, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlacarVitoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void placar(String resultado){
        int textAux;
        if(resultado.equals("Empate")){
            textAux = Integer.parseInt(lblPlacarEmpate.getText()) +1;
            lblPlacarEmpate.setText(Integer.toString(textAux));
        } else if (resultado.equals("Ganhou!")) {
            textAux = Integer.parseInt(lblPlacarVitoria.getText()) +1;
            lblPlacarVitoria.setText(Integer.toString(textAux));
        } else {
            textAux = Integer.parseInt(lblPlacarDerrota.getText()) +1;
            lblPlacarDerrota.setText(Integer.toString(textAux));
        }
    }
    
    public void comparaBot(Jogada j){
        Jogada jogadaBot = Bot.escolhaJogada();
        
        //Jogada do computador
        switch (jogadaBot.getJogada()){
            case 0:
                lblBot.setText("Bot: Pedra");
                break;
            case 1:
                lblBot.setText("Bot: Papel");
                break;
            case 2:
                lblBot.setText("Bot: Tesoura");
                break;
            default:
                lblBot.setText("Bot: Deu ruim!");
        }
        // Jogada do Usuario
        switch (j.getJogada()){
            case 0:
                lblUsuario.setText("Usuario: Pedra");
                break;
            case 1:
                lblUsuario.setText("Usuario: Papel");
                break;
            case 2:
                lblUsuario.setText("Usuario: Tesoura");
                break;
            default:
                lblUsuario.setText("Usuario: Deu ruim!");
        }
        
        lblResultado.setText(j.resultado(jogadaBot));
    }
    
    
    private void btnPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedraActionPerformed
        Jogada j = new Jogada(0);
        comparaBot(j);
        placar(lblResultado.getText());
    }//GEN-LAST:event_btnPedraActionPerformed

    private void btnTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTesouraActionPerformed
        Jogada j = new Jogada(2);
        comparaBot(j);
        placar(lblResultado.getText());
    }//GEN-LAST:event_btnTesouraActionPerformed

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        Jogada j = new Jogada(1);
        comparaBot(j);
        placar(lblResultado.getText());
    }//GEN-LAST:event_btnPapelActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPedra;
    private javax.swing.JButton btnTesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBot;
    private javax.swing.JLabel lblDerrota;
    private javax.swing.JLabel lblEmpate;
    private javax.swing.JLabel lblPlacarDerrota;
    private javax.swing.JLabel lblPlacarEmpate;
    private javax.swing.JLabel lblPlacarVitoria;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVitoria;
    // End of variables declaration//GEN-END:variables
}