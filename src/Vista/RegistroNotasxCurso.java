/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Alumno;
import Controlador.Curso;
import Controlador.nodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinal.ProyectoFinal;

/**
 *
 * @author lv248
 */
public class RegistroNotasxCurso extends javax.swing.JFrame {
    private ProyectoFinal proyectoFinal;  
    
    /**
     * Creates new form RegistroNotasxCurso
     */
    public RegistroNotasxCurso(){
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        nodo<Curso> actual = ProyectoFinal.cursitos.inicio;
         while (actual != null) {
        
        CBOnomcurso.addItem(actual.dato.getCursos());
        actual = actual.siguiente;
           BTNregistrarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarNota();
            }
        });
         }
    }
         
    public RegistroNotasxCurso(ProyectoFinal proyectoFinal) {
        initComponents();
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.proyectoFinal = proyectoFinal;
        nodo<Curso> actual = proyectoFinal.cursitos.inicio;
         while (actual != null) {
        
        CBOnomcurso.addItem(actual.dato.getCursos());
        actual = actual.siguiente;
    }

        initializeComponentsCustom();
    }

    
    
    private void initializeComponentsCustom(){
        BTNregistrarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarNota();
            }
        });
        
    }
    
    private void registrarNota(){
        String codigoAlumno = TXTnombrealum.getText();
        String cursoSeleccionado = (String) CBOnomcurso.getSelectedItem();
        String nota1Str = TXTnota1.getText();
        String nota2Str = TXTnota2.getText();
        String nota3Str = TXTnota3.getText();
        String nota4Str = TXTnota4.getText();

        // Validación de campos
        if (codigoAlumno.isEmpty() || cursoSeleccionado == null || nota1Str.isEmpty() || nota2Str.isEmpty() 
                ||nota3Str.isEmpty() || nota4Str.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos");
            return;
        }
        
        if(!ProyectoFinal.existeAlumno(String.valueOf(codigoAlumno))){
            return;
        }
        
        try {
            int nota1 = Integer.parseInt(nota1Str);
            int nota2 = Integer.parseInt(nota2Str);
            int nota3 = Integer.parseInt(nota3Str);
            int nota4 = Integer.parseInt(nota4Str);
            
            // Validación de rango de notas.
            if (nota1 < 0 || nota1 > 20 || nota2 < 0 || nota2 > 20 || 
                nota3 < 0 || nota3 > 20 || nota4 < 0 || nota4 > 20) {
                JOptionPane.showMessageDialog(this, "Las notas deben estar entre 0 y 20");
                return;
            }
            
             DefaultTableModel model = (DefaultTableModel) TBmostrarNotas.getModel();
             
            model.addRow(new Object[]{codigoAlumno, cursoSeleccionado, nota1, nota2, nota3, nota4});
            ProyectoFinal.agregarNotaAlumno(codigoAlumno, cursoSeleccionado, nota1, nota2, nota3, nota4);
            
            TXTnombrealum.setText("");
            TXTnota1.setText("");
            TXTnota2.setText("");
            TXTnota3.setText("");
            TXTnota4.setText("");
            
            } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Las notas deben ser números válidos");
        }
    }

            
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTnombrealum = new javax.swing.JTextField();
        TXTnota1 = new javax.swing.JTextField();
        CBOnomcurso = new javax.swing.JComboBox<>();
        BTNregistrarNota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBmostrarNotas = new javax.swing.JTable();
        TXTnota2 = new javax.swing.JTextField();
        TXTnota3 = new javax.swing.JTextField();
        TXTnota4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel1.setText("Codigo del alumno :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel2.setText("Nombre del curso : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jLabel3.setText("Ingrese las 4 notas : ");

        CBOnomcurso.setBackground(new java.awt.Color(204, 204, 204));
        CBOnomcurso.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N

        BTNregistrarNota.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BTNregistrarNota.setText("Guardar notas");
        BTNregistrarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregistrarNotaActionPerformed(evt);
            }
        });

        TBmostrarNotas.setBackground(new java.awt.Color(255, 153, 51));
        TBmostrarNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Curso", "Nota 1", "Nota 2", "Nota 3", "Nota 4"
            }
        ));
        jScrollPane1.setViewportView(TBmostrarNotas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("REGISTRO DE NOTAS");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        jLabel5.setText("Nota 1");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        jLabel6.setText("Nota 2");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        jLabel7.setText("Nota 3");

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 2, 14)); // NOI18N
        jLabel8.setText("Nota 4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNregistrarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTnombrealum, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBOnomcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TXTnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(TXTnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(TXTnota3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(TXTnota4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXTnombrealum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CBOnomcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 74, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTnota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTnota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNregistrarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNregistrarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregistrarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNregistrarNotaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        ProyectoFinal proyectoFinal = new ProyectoFinal();
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
            java.util.logging.Logger.getLogger(RegistroNotasxCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroNotasxCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroNotasxCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroNotasxCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroNotasxCurso(proyectoFinal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNregistrarNota;
    private javax.swing.JComboBox<String> CBOnomcurso;
    private javax.swing.JTable TBmostrarNotas;
    private javax.swing.JTextField TXTnombrealum;
    private javax.swing.JTextField TXTnota1;
    private javax.swing.JTextField TXTnota2;
    private javax.swing.JTextField TXTnota3;
    private javax.swing.JTextField TXTnota4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
