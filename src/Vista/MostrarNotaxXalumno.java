
package Vista;

import Controlador.Alumno;
import Controlador.nodo;
import proyectofinal.ProyectoFinal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charisse Livia
 */
public class MostrarNotaxXalumno extends javax.swing.JFrame {

    public MostrarNotaxXalumno() {
    ProyectoFinal.inicializarDatos(); // Inicializar datos si no están cargados
    initComponents();
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IDalum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaregistro = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Notas por Curso");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(823, 521));
        setPreferredSize(new java.awt.Dimension(823, 521));

        jPanel1.setBackground(new java.awt.Color(255, 206, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 204));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 2, 36)); // NOI18N
        jLabel2.setText("Mostrar notas por alumno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 110));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel3.setText("ID Alumno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        IDalum.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        IDalum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDalumActionPerformed(evt);
            }
        });
        jPanel1.add(IDalum, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 160, 40));

        jButton1.setBackground(new java.awt.Color(255, 153, 204));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jButton1.setText("Mostrar registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 210, 40));

        tablaregistro.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        tablaregistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Curso", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(tablaregistro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 780, 270));

        limpiar.setBackground(new java.awt.Color(255, 153, 204));
        limpiar.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String idAlumnoStr = IDalum.getText();
    
    // Validar entrada del ID
    if (idAlumnoStr.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del alumno.");
        return;
    }

    int idAlumno;
    try {
        idAlumno = Integer.parseInt(idAlumnoStr);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
        return;
    }

    // Buscar al alumno
    nodo<Alumno> actual = ProyectoFinal.alumnos.inicio;
    Alumno alumnoEncontrado = null;

    while (actual != null) {
        if (actual.dato.getCodigo() == idAlumno) {
            alumnoEncontrado = actual.dato;
            break;
        }
        actual = actual.siguiente;
    }

    // Si no se encuentra el alumno
    if (alumnoEncontrado == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un alumno con el ID ingresado.");
        return;
    }

    // Limpiar la tabla antes de cargar nuevos datos
    limpiarTabla();

    // Mostrar cursos, notas y promedio
    DefaultTableModel model = (DefaultTableModel) tablaregistro.getModel();
    int[] notas = alumnoEncontrado.getNotas();
    float promedio = 0;
    int totalNotas = 0;

    // Calcular promedio y rellenar datos
    for (int nota : notas) {
        if (nota > 0) {
            promedio += nota;
            totalNotas++;
        }
    }
    promedio = totalNotas > 0 ? promedio / totalNotas : 0;

    // Agregar fila para el curso y las notas
    String curso = "Ejemplo de curso"; // Reemplaza con la lógica adecuada para obtener el curso
    model.addRow(new Object[]{
        curso, 
        notas.length > 0 ? notas[0] : "-", 
        notas.length > 1 ? notas[1] : "-", 
        notas.length > 2 ? notas[2] : "-", 
        notas.length > 3 ? notas[3] : "-", 
        promedio
    });

    javax.swing.JOptionPane.showMessageDialog(this, "Datos del alumno cargados con éxito.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarTabla() {
    DefaultTableModel model = (DefaultTableModel) tablaregistro.getModel();
    model.setRowCount(0); // Establece el número de filas en 0, lo que limpia la tabla.
}
    
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    limpiarTabla();
    javax.swing.JOptionPane.showMessageDialog(this, "La tabla ha sido limpiada.");
    }//GEN-LAST:event_limpiarActionPerformed

    private void IDalumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDalumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDalumActionPerformed
    
    
    

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarNotaxXalumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDalum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tablaregistro;
    // End of variables declaration//GEN-END:variables
}
