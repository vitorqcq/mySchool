
package my_school.Diretor;

import java.time.LocalTime;
import java.util.ArrayList;
import my_school.Funcionario;

public class CadastraFuncionarios extends javax.swing.JFrame{

    Funcionario funcionario =  new Funcionario();
    ArrayList<Funcionario> funcionarioEscola = new ArrayList<Funcionario>();
    
    public CadastraFuncionarios() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDocumento = new javax.swing.JTextField();
        jEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDataNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSalario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jHoraIni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jHoraFim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 390, -1));

        jLabel2.setText("Documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 390, -1));

        jEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(jEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 390, -1));

        jLabel3.setText("Endereço");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDataNascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(jDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));

        jLabel4.setText("Data Nascimento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalarioActionPerformed(evt);
            }
        });
        jPanel1.add(jSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 150, -1));

        jLabel5.setText("Cargo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        jToggleButton1.setText("Cadastrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jHoraIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoraIniActionPerformed(evt);
            }
        });
        jPanel1.add(jHoraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, -1));

        jLabel7.setText("Horario Inicial Trabalho");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jHoraFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoraFimActionPerformed(evt);
            }
        });
        jPanel1.add(jHoraFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, -1));

        jLabel8.setText("Horario Final Trabalho");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 129, 131));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cadastrar Funcionário");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vitor\\Documents\\NetBeansProjects\\My_School\\src\\imagens\\close.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(79, 79, 79)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 460, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diretor", "Professor", "Bibliotecária", "Gerente de Estoque" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 170, -1));

        jLabel9.setText("Salário");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed

    private void jDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDocumentoActionPerformed

    private void jEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEnderecoActionPerformed

    private void jDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDataNascimentoActionPerformed

    private void jSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalarioActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        funcionario.setNome(jNome.getText());
        funcionario.setDocumento(jDocumento.getText());
        funcionario.setDataNascimento(jDataNascimento.getText());
        funcionario.setHoraInicioServico(jHoraIni.getText());
        funcionario.setHoraFimServico(jHoraFim.getText());
        funcionario.setSalario(jSalario.getText());
        funcionario.cargo = jComboBox1.getSelectedItem().toString();
        funcionario.setEndereco(jEndereco.getText());
        
        funcionario.setId("f" + String.valueOf(funcionarioEscola.size() + 1));
        funcionarioEscola.add(funcionario);

        jNome.setText("");
        jDocumento.setText("");
        jDataNascimento.setText("");
        jHoraIni.setText("");
        jHoraFim.setText("");
        jSalario.setText("");

        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jHoraIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoraIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoraIniActionPerformed

    private void jHoraFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoraFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoraFimActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jDataNascimento;
    private javax.swing.JTextField jDocumento;
    private javax.swing.JTextField jEndereco;
    private javax.swing.JTextField jHoraFim;
    private javax.swing.JTextField jHoraIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jSalario;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
