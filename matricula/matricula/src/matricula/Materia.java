/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package matricula;

import javax.swing.JOptionPane;

/**
 *
 * @author Jimena
 */
public class Materia extends javax.swing.JFrame {
    //formMaterias materia;
    public Materia() {
        initComponents();
    }
    public Materia(Materias mat) {
        //Materias materia=new Materias();
        //materia.getNombreMat();
        //formMaterias formMat= new formMaterias();
        
        initComponents();
       
        //materia.setNombreMat("Calculo");
        
        titMatLB.setText(mat.getNombreMat());
      
    }
  
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titMatLB = new javax.swing.JLabel();
        numCredLB = new javax.swing.JLabel();
        codMatLB = new javax.swing.JLabel();
        horarioLB = new javax.swing.JLabel();
        horarioCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        horario2TF = new javax.swing.JTextArea();
        cupEstLB = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        horario1TF = new javax.swing.JTextArea();
        guardarBT = new javax.swing.JButton();
        codMatLB2 = new javax.swing.JLabel();
        numCredLB2 = new javax.swing.JLabel();
        cupEstLB2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titMatLB.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        titMatLB.setText("Materia");

        numCredLB.setText("Número de créditos Materia: ");

        codMatLB.setText("Código Materia: ");

        horarioLB.setText(" Horario: ");

        horarioCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "" }));

        horario2TF.setColumns(20);
        horario2TF.setRows(5);
        horario2TF.setText("Horario 2: \n\nMuestra el horario 2 de la materia");
        jScrollPane1.setViewportView(horario2TF);

        cupEstLB.setText("Cupo de estudiantes Materia: ");

        horario1TF.setColumns(20);
        horario1TF.setRows(5);
        horario1TF.setText("Horario 1: \n\nMuestra el horario 1 de la materia ");
        jScrollPane2.setViewportView(horario1TF);

        guardarBT.setText("Matricular Materia");
        guardarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBTActionPerformed(evt);
            }
        });

        codMatLB2.setText("cod");

        numCredLB2.setText("num");

        cupEstLB2.setText("cup");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cupEstLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cupEstLB2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codMatLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codMatLB2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numCredLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numCredLB2))
                    .addComponent(titMatLB)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(horarioLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(horarioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guardarBT)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titMatLB)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codMatLB)
                    .addComponent(codMatLB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numCredLB)
                    .addComponent(numCredLB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cupEstLB)
                    .addComponent(cupEstLB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horarioLB)
                    .addComponent(horarioCB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(guardarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBTActionPerformed
          boolean error=false, errorNoSelect=false;
        if(horarioCB.getSelectedItem()=="--"){      
          errorNoSelect=true;
          error=true;
        }
        if(error){
            if(errorNoSelect){
                JOptionPane.showMessageDialog(null, "No ha seleccionado el horario");
            }
        }
        
        
        formMaterias formMat=new formMaterias();
       this.setVisible(false);
       formMat.setVisible(true);
    }//GEN-LAST:event_guardarBTActionPerformed

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
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Materia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codMatLB;
    private javax.swing.JLabel codMatLB2;
    private javax.swing.JLabel cupEstLB;
    private javax.swing.JLabel cupEstLB2;
    private javax.swing.JButton guardarBT;
    private javax.swing.JTextArea horario1TF;
    private javax.swing.JTextArea horario2TF;
    private javax.swing.JComboBox<String> horarioCB;
    private javax.swing.JLabel horarioLB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numCredLB;
    private javax.swing.JLabel numCredLB2;
    private javax.swing.JLabel titMatLB;
    // End of variables declaration//GEN-END:variables
}
