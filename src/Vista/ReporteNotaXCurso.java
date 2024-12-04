/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Alumno;
import Controlador.Curso;

import Controlador.nodo;
import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import javax.swing.table.DefaultTableModel;
import proyectofinal.ProyectoFinal;

/**
 *
 * @author rubigutierrezcedano
 */
public class ReporteNotaXCurso extends javax.swing.JFrame {

    /**
     * Creates new form ReporteNotaXCurso
     */
    public ReporteNotaXCurso() {
        
    ProyectoFinal.inicializarDatos(); 
    initComponents();
     this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       nodo<Curso> actual = ProyectoFinal.cursitos.inicio;
         while (actual != null) {
        
        comboBoxCurso.addItem(actual.dato.getCursos());
        actual = actual.siguiente;
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNotas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxCurso = new javax.swing.JComboBox<>();
        btnMostrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 450));

        jPanel1.setBackground(new java.awt.Color(168, 136, 181));

        TablaNotas.setBackground(new java.awt.Color(255, 210, 160));
        TablaNotas.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        TablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Alumno", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(TablaNotas);

        jPanel2.setBackground(new java.awt.Color(239, 182, 200));

        jLabel1.setFont(new java.awt.Font("Kokonor", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Reporte De Notas Por Curso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Kokonor", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Curso:");

        comboBoxCurso.setBackground(new java.awt.Color(129, 116, 160));
        comboBoxCurso.setFont(new java.awt.Font("Lava Devanagari", 0, 14)); // NOI18N
        comboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCursoActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(129, 116, 160));
        btnMostrar.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar Reporte");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(129, 116, 160));
        jButton1.setFont(new java.awt.Font("Lava Kannada", 0, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnMostrar)
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void mostrarReportePorCurso() {
    
    String cursoSeleccionado = (String) comboBoxCurso.getSelectedItem();
    if (cursoSeleccionado == null || cursoSeleccionado.isEmpty()) {
        System.out.println("Debe seleccionar un curso.");
        return;
    }

    nodo<Curso> cursoActual = ProyectoFinal.cursitos.inicio;
    while (cursoActual != null && !cursoActual.dato.getCursos().equals(cursoSeleccionado)) {
        cursoActual = cursoActual.siguiente;
    }

    if (cursoActual == null) {
        System.out.println("Curso no encontrado.");
        return;
    }

    nodo<Alumno> alumnosCurso = cursoActual.dato.getAlumnosdelcurso().inicio;

    DefaultTableModel modelo = (DefaultTableModel) TablaNotas.getModel();
    modelo.setRowCount(0);

  
    while (alumnosCurso != null) {
        Alumno alumno = alumnosCurso.dato;
        int[] notas = alumno.getNotas(); 
        double promedio = calcularPromedio(notas); 

      
        modelo.addRow(new Object[]{
            alumno.getNombres(), 
            notas[0], 
            notas[1], 
            notas[2], 
            notas[3], 
            promedio
        });

        
        alumnosCurso = alumnosCurso.siguiente;
    }
}

private double calcularPromedio(int[] notas) {
    double suma = 0;
    for (int nota : notas) {
        suma += nota;
    }
    return suma / notas.length;
}


    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (comboBoxCurso.getSelectedItem() == null || comboBoxCurso.getSelectedItem().toString().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un curso antes de mostrar el reporte.");
        return;
    }
     mostrarReportePorCurso();

    
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void limpiarTabla() {
    DefaultTableModel model = (DefaultTableModel) TablaNotas.getModel();
    model.setRowCount(0); 
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
    javax.swing.JOptionPane.showMessageDialog(this, "La tabla ha sido limpiada.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCursoActionPerformed
        String cursoSeleccionado = (String) comboBoxCurso.getSelectedItem();
        comboBoxCurso.addActionListener(e -> mostrarReportePorCurso());


    }//GEN-LAST:event_comboBoxCursoActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteNotaXCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteNotaXCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteNotaXCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteNotaXCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteNotaXCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaNotas;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> comboBoxCurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private Curso buscarCursoPorNombre(String cursoSeleccionado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class cursos {

        public cursos() {
        }
    }
}
