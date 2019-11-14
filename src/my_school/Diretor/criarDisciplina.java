package my_school.Diretor;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import my_school.Avaliacao;
import my_school.Disciplina;
import my_school.Professor;

public class criarDisciplina extends javax.swing.JFrame {

    public criarDisciplina() {
        initComponents();
    }

    Disciplina disciplina = new Disciplina();
    ArrayList<Professor> professores = new ArrayList<Professor>();
    ArrayList<Disciplina> disciplinasEscola =  new ArrayList<Disciplina>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNivel = new javax.swing.JTextField();
        jAva1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLivro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jHoraIni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jHoraFim = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jListaProfessores = new javax.swing.JComboBox<>();
        jAva2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jAva3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jAva4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome  da disciplina");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });
        jPanel1.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 390, -1));

        jLabel2.setText("Professor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNivelActionPerformed(evt);
            }
        });
        jPanel1.add(jNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 390, -1));

        jAva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAva1ActionPerformed(evt);
            }
        });
        jPanel1.add(jAva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 140, -1));

        jLabel3.setText("Data Avaliação 1º Bimestre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLivroActionPerformed(evt);
            }
        });
        jPanel1.add(jLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 390, -1));

        jLabel4.setText("Livro");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jToggleButton1.setText("Cadastrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, -1));

        jHoraIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoraIniActionPerformed(evt);
            }
        });
        jPanel1.add(jHoraIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, -1));

        jLabel7.setText("Horario inicial de aula");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jHoraFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoraFimActionPerformed(evt);
            }
        });
        jPanel1.add(jHoraFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, -1));

        jLabel8.setText("Horario final de aula");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 129, 131));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Criar Disciplina");

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
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(111, 111, 111)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 460, 60));

        jLabel9.setText("Nivel");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jListaProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListaProfessoresActionPerformed(evt);
            }
        });
        jPanel1.add(jListaProfessores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 390, -1));

        jAva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAva2ActionPerformed(evt);
            }
        });
        jPanel1.add(jAva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 140, -1));

        jLabel5.setText("Data Avaliação 2º Bimestre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jAva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAva3ActionPerformed(evt);
            }
        });
        jPanel1.add(jAva3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 140, -1));

        jLabel10.setText("Data Avaliação 3º Bimestre");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jAva4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAva4ActionPerformed(evt);
            }
        });
        jPanel1.add(jAva4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 140, -1));

        jLabel11.setText("Data Avaliação 4º Bimestre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed

    private void jNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNivelActionPerformed

    private void jAva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAva1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAva1ActionPerformed

    private void jLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLivroActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     
            disciplina.setNome(jNome.getText());
            disciplina.setNivel(jNivel.getText());
            disciplina.setHorarioInicio(jHoraIni.getText());
            disciplina.setHorarioTermino(jHoraFim.getText());
            disciplina.setLivro(jLivro.getText());

            Avaliacao ava1 = new Avaliacao();
            Avaliacao ava2 = new Avaliacao();
            Avaliacao ava3 = new Avaliacao();
            Avaliacao ava4 = new Avaliacao();

            ava1.setData(jAva1.getText());
            ava2.setData(jAva2.getText());
            ava3.setData(jAva3.getText());
            ava4.setData(jAva4.getText());

            disciplina.addAvaliacao(ava1);
            disciplina.addAvaliacao(ava2);
            disciplina.addAvaliacao(ava3);
            disciplina.addAvaliacao(ava4);

            Professor selectedProf = getProfPeloNome((jListaProfessores.getSelectedItem().toString()));
            disciplina.setProfessor(selectedProf);
            
            disciplina.setId("d" + String.valueOf(disciplinasEscola.size() + 1));
            disciplinasEscola.add(disciplina);

            jNome.setText("");
            jNivel.setText("");
            jLivro.setText("");
            jHoraIni.setText("");
            jHoraFim.setText("");
            jAva1.setText("");
            jAva2.setText("");
            jAva3.setText("");
            jAva4.setText("");

            jListaProfessores.removeAllItems();
            

            this.setVisible(false);
         
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jHoraIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoraIniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoraIniActionPerformed

    private void jHoraFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoraFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHoraFimActionPerformed

    private void jListaProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListaProfessoresActionPerformed

    }//GEN-LAST:event_jListaProfessoresActionPerformed

    private void jAva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAva2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAva2ActionPerformed

    private void jAva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAva3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAva3ActionPerformed

    private void jAva4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAva4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAva4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (int i = 0; i < professores.size(); i++) {
            jListaProfessores.addItem(professores.get(i).getNome());
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(criarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(criarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(criarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(criarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new criarDisciplina().setVisible(true);
            }
        });
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public Professor getProfPeloNome(String nome) {
        Professor prof = new Professor();
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getNome() == nome) {
                prof = professores.get(i);
            }
        }
        return prof;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAva1;
    private javax.swing.JTextField jAva2;
    private javax.swing.JTextField jAva3;
    private javax.swing.JTextField jAva4;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jHoraFim;
    private javax.swing.JTextField jHoraIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jListaProfessores;
    private javax.swing.JTextField jLivro;
    private javax.swing.JTextField jNivel;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
