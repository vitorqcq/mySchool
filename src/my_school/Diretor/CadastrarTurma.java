
package my_school.Diretor;

import java.util.ArrayList;
import my_school.Aluno;
import my_school.Disciplina;
import my_school.SalaAula;
import my_school.Turma;


public class CadastrarTurma extends javax.swing.JFrame {
    
    Turma turma = new Turma();
    ArrayList<SalaAula> salas = new ArrayList<SalaAula>();
    ArrayList<Disciplina> disciplinas = new  ArrayList<Disciplina>();
    ArrayList<Aluno> alunos =  new ArrayList<Aluno>();
    ArrayList<Turma> turmasEscola =  new ArrayList<Turma>();
    
    public CadastrarTurma() {
        initComponents();
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNomeTurma = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSalas = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTurno = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome  da Turma");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jNomeTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeTurmaActionPerformed(evt);
            }
        });
        jPanel1.add(jNomeTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 390, -1));

        jToggleButton1.setText("Próximo");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 129, 131));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Criar Turma");

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
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(142, 142, 142)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 460, 60));

        jLabel9.setText("Sala");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalasActionPerformed(evt);
            }
        });
        jPanel1.add(jSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 390, -1));

        jLabel12.setText("Turno");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTurnoActionPerformed(evt);
            }
        });
        jPanel1.add(jTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeTurmaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        turma.setNome(jNomeTurma.getText());
        turma.setTurno(jTurno.getSelectedItem().toString());
        turma.setSala(getSalaPeloNome(jSalas.getSelectedItem().toString()));

        jNomeTurma.setText("");
        jSalas.removeAllItems();
        jTurno.removeAllItems();
        this.setVisible(false);
        
        SelecionaDisciplinas selecaoDisciplinas = new SelecionaDisciplinas();
        selecaoDisciplinas.setDisciplinas(this.disciplinas);
        selecaoDisciplinas.turma = this.turma;  
        selecaoDisciplinas.turmasEscola = this.turmasEscola;
        selecaoDisciplinas.alunos = this.alunos;
        selecaoDisciplinas.setVisible(true);   
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(int i=0; i<salas.size(); i++){
            jSalas.addItem(salas.get(i).getCodigoSala());
        }
        
        jTurno.addItem("Manhã");
        jTurno.addItem("Tarde");
        jTurno.addItem("Noite");
    }//GEN-LAST:event_formWindowOpened

    private void jSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalasActionPerformed

    }//GEN-LAST:event_jSalasActionPerformed

    private void jTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTurnoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTurma().setVisible(true);
            }
        });
    }
    
    private SalaAula getSalaPeloNome(String nome){
        SalaAula sala = new SalaAula();
        for(int i=0; i<salas.size(); i++){
            if(salas.get(i).getCodigoSala() == nome){
                sala = salas.get(i);
            }
        }
        return sala;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeTurma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jSalas;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jTurno;
    // End of variables declaration//GEN-END:variables
}
