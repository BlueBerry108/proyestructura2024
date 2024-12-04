package Vista;

import Controlador.*;
import javax.swing.table.DefaultTableModel;
import proyectofinal.ProyectoFinal;

/**
 *
 * @author Esther SJ
 */
public class EditarNotasXCurso extends javax.swing.JFrame {
    DefaultTableModel m = new DefaultTableModel();

    Lista<Alumno> allstudents = new Lista<>();
    Lista<Alumno> materiabiologia = new Lista<>();
    Lista<Alumno> materiamate = new Lista<>();
    Lista<Alumno> materiacoms = new Lista<>();
    Lista<Alumno> materiaalge = new Lista<>();

    Curso newcourse = new Curso("Biologia", materiabiologia);
    Curso newcourse2 = new Curso("Matematicas", materiamate);
    Curso newcourse3 = new Curso("Comunicacion", materiacoms);
    Curso newcourse4 = new Curso("Algebra", materiaalge);

    Alumno alumno1 = new Alumno("Juan", "Perez", "Lopez", 1001);
    Alumno alumno2 = new Alumno("Maria", "Garcia", "Martinez", 1002);
    Alumno alumno3 = new Alumno("Diana", "Gomez", "Rodriguez", 1003);
    Alumno alumno4 = new Alumno("Carlos", "Sanchez", "Fernandez", 1004);
    Alumno alumno5 = new Alumno("Laura", "Martinez", "Hernandez", 1005);
    Alumno alumno6 = new Alumno("Pedro", "Lopez", "Gonzalez", 1006);
    Alumno alumno7 = new Alumno("Ana", "Morales", "Torres", 1007);
    Alumno alumno8 = new Alumno("David", "Fernandez", "Diaz", 1008);
    Alumno alumno9 = new Alumno("Sofia", "Ruiz", "Sanchez", 1009);
    Alumno alumno10 = new Alumno("Luis", "Ramirez", "Pérez", 1010);
    Alumno alumno11 = new Alumno("Jorge", "Lopez", "Gomez", 1011);
    Alumno alumno12 = new Alumno("Elena", "Mendez", "Ruiz", 1012);
    Alumno alumno13 = new Alumno("Felipe", "Santos", "Rodriguez", 1013);
    Alumno alumno14 = new Alumno("Carmen", "Martinez", "Paredes", 1014);
    Alumno alumno15 = new Alumno("Pablo", "Hernandez", "Lopez", 1015);
    Alumno alumno16 = new Alumno("Raul", "Garcia", "Martinez", 1016);
    Alumno alumno17 = new Alumno("Sofia", "Perez", "Gonzalez", 1017);
    Alumno alumno18 = new Alumno("Victor", "Fernandez", "Lopez", 1018);
    Alumno alumno19 = new Alumno("Ines", "Romero", "Jimenez", 1019);
    Alumno alumno20 = new Alumno("Oscar", "Ruiz", "Torres", 1020);

    
    public EditarNotasXCurso() {
        initComponents();
        mostrarCabecera();
         this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Inicialización de cursos y alumnos
        if (ProyectoFinal.cursitos.inicio == null) {
            ProyectoFinal.cursitos.InsertarFinal(newcourse);
            ProyectoFinal.cursitos.InsertarFinal(newcourse2);
            ProyectoFinal.cursitos.InsertarFinal(newcourse3);
            ProyectoFinal.cursitos.InsertarFinal(newcourse4);
        }

        nodo<Curso> Actual = ProyectoFinal.cursitos.inicio;//clase generica toncs necesita q el nodo sea de esa clase

        while (Actual != null) {
            cbxCurso.addItem(Actual.dato.getCursos());//obtener el nombre
            //ProyectoFinal.cursitos.Mostrar();
            //System.out.println("curso: " + Actual.dato.getCursos());
            Actual = Actual.siguiente;//avanza                       
        }

        // Agregar alumnos y asignar notas iniciales
        ProyectoFinal.alumnos.InsertarFinal(alumno1);
        ProyectoFinal.alumnos.InsertarFinal(alumno2);
        ProyectoFinal.alumnos.InsertarFinal(alumno3);
        ProyectoFinal.alumnos.InsertarFinal(alumno4);
        ProyectoFinal.alumnos.InsertarFinal(alumno5);
        ProyectoFinal.alumnos.InsertarFinal(alumno6);
        ProyectoFinal.alumnos.InsertarFinal(alumno7);
        ProyectoFinal.alumnos.InsertarFinal(alumno8);
        ProyectoFinal.alumnos.InsertarFinal(alumno9);
        ProyectoFinal.alumnos.InsertarFinal(alumno10);
        ProyectoFinal.alumnos.InsertarFinal(alumno11);
        ProyectoFinal.alumnos.InsertarFinal(alumno12);
        ProyectoFinal.alumnos.InsertarFinal(alumno13);
        ProyectoFinal.alumnos.InsertarFinal(alumno14);
        ProyectoFinal.alumnos.InsertarFinal(alumno15);
        ProyectoFinal.alumnos.InsertarFinal(alumno16);
        ProyectoFinal.alumnos.InsertarFinal(alumno17);
        ProyectoFinal.alumnos.InsertarFinal(alumno18);
        ProyectoFinal.alumnos.InsertarFinal(alumno19);
        ProyectoFinal.alumnos.InsertarFinal(alumno20);

        int[] notas1 = {12, 15, 16, 17};
        int[] notas2 = {18, 20, 19, 14};
        int[] notas3 = {10, 11, 13, 15};
        int[] notas4 = {14, 15, 16, 17};
        int[] notas5 = {18, 19, 16, 20};
        int[] notas6 = {12, 15, 14, 16};
        int[] notas7 = {17, 14, 18, 19};
        int[] notas8 = {20, 19, 18, 16};
        int[] notas9 = {16, 14, 15, 17};
        int[] notas10 = {15, 14, 18, 16};
        int[] notas11 = {16, 18, 15, 19};
        int[] notas12 = {14, 17, 18, 20};
        int[] notas13 = {19, 16, 14, 18};
        int[] notas14 = {15, 17, 19, 16};
        int[] notas15 = {18, 20, 17, 15};
        int[] notas16 = {20, 18, 17, 19};
        int[] notas17 = {16, 14, 18, 15};
        int[] notas18 = {15, 19, 20, 18};
        int[] notas19 = {17, 16, 14, 20};
        int[] notas20 = {19, 18, 17, 16};

        alumno1.setNotas(notas1);
        alumno2.setNotas(notas2);
        alumno3.setNotas(notas3);
        alumno4.setNotas(notas4);
        alumno5.setNotas(notas5);
        alumno6.setNotas(notas6);
        alumno7.setNotas(notas7);
        alumno8.setNotas(notas8);
        alumno9.setNotas(notas9);
        alumno10.setNotas(notas10);
        alumno11.setNotas(notas11);
        alumno12.setNotas(notas12);
        alumno13.setNotas(notas13);
        alumno14.setNotas(notas14);
        alumno15.setNotas(notas15);
        
        materiabiologia.InsertarFinal(alumno1);
        materiabiologia.InsertarFinal(alumno2);
        materiabiologia.InsertarFinal(alumno3);
        materiabiologia.InsertarFinal(alumno4);
        materiabiologia.InsertarFinal(alumno5);

        materiamate.InsertarFinal(alumno6);
        materiamate.InsertarFinal(alumno7);
        materiamate.InsertarFinal(alumno8);
        materiamate.InsertarFinal(alumno9);
        materiamate.InsertarFinal(alumno10);
        
        materiacoms.InsertarFinal(alumno11);
        materiacoms.InsertarFinal(alumno12);
        materiacoms.InsertarFinal(alumno13);
        materiacoms.InsertarFinal(alumno14);
        materiacoms.InsertarFinal(alumno15);
        
        materiaalge.InsertarFinal(alumno16);
        materiaalge.InsertarFinal(alumno17);
        materiaalge.InsertarFinal(alumno18);
        materiaalge.InsertarFinal(alumno19);
        materiaalge.InsertarFinal(alumno20);

        cbxCurso.addActionListener(evt -> actualizarTabla());
        btnBuscar.addActionListener(evt -> buscarAlumno());
        btnEditar.addActionListener(evt -> editarNotas());

    }
    
    public void mostrarCabecera() {
        m.addColumn("Codigo");
        m.addColumn("Nombre");
        m.addColumn("Nota 1");
        m.addColumn("Nota 2");
        m.addColumn("Nota 3");
        m.addColumn("Nota 4");
        tblListar.setModel(m);
    }

    private void actualizarTabla() {
        String cursoSeleccionado = (String) cbxCurso.getSelectedItem();
        if (cursoSeleccionado.equals("Seleccionar Curso")) {
            return;
        }

        nodo<Curso> cursoActual = ProyectoFinal.cursitos.inicio;
        while (cursoActual != null && !cursoActual.dato.getCursos().equals(cursoSeleccionado)) {
            cursoActual = cursoActual.siguiente;
        }
        if (cursoActual == null) {
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) tblListar.getModel();
        modelo.setRowCount(0);

        nodo<Alumno> alumnosCurso = cursoActual.dato.getAlumnosdelcurso().inicio;
        while (alumnosCurso != null) {
            Alumno alumno = alumnosCurso.dato;
            int[] notas = alumno.getNotas(); // Usamos el getter para obtener las notas
            String[] fila = {
                String.valueOf(alumno.getCodigo()),
                alumno.getNombres() + " " + alumno.getApellidop() + " " + alumno.getApellidom(),
                String.valueOf(notas[0]),
                String.valueOf(notas[1]),
                String.valueOf(notas[2]),
                String.valueOf(notas[3]),
            };
            modelo.addRow(fila);
            alumnosCurso = alumnosCurso.siguiente;
        }
    }

    private void buscarAlumno() {
        String codigoTexto = txtCodigo.getText();
        if (codigoTexto.isEmpty()) {
            return;
        }

        int codigo;
        try {
            codigo = Integer.parseInt(codigoTexto);
        } catch (NumberFormatException e) {
            System.out.println("El código debe ser un número.");
            return;
        }

        String cursoSeleccionado = (String) cbxCurso.getSelectedItem();
        nodo<Curso> cursoActual = ProyectoFinal.cursitos.inicio;
        while (cursoActual != null && !cursoActual.dato.getCursos().equals(cursoSeleccionado)) {
            cursoActual = cursoActual.siguiente;
        }
        if (cursoActual == null) {
            return;
        }

        nodo<Alumno> alumnosCurso = cursoActual.dato.getAlumnosdelcurso().inicio;
        while (alumnosCurso != null) {
            if (alumnosCurso.dato.getCodigo() == codigo) {
                Alumno alumno = alumnosCurso.dato;
                int[] notas = alumno.getNotas(); // Usamos el getter para obtener las notas
                txtNota1.setText(String.valueOf(notas[0]));
                txtNota2.setText(String.valueOf(notas[1]));
                txtNota3.setText(String.valueOf(notas[2]));
                txtNota4.setText(String.valueOf(notas[3]));
                return;
            }
            alumnosCurso = alumnosCurso.siguiente;
        }

        System.out.println("Alumno no encontrado.");
    }

    private void editarNotas() {
        String codigoTexto = txtCodigo.getText();
        if (codigoTexto.isEmpty()) {
            return;
        }

        int codigo;
        try {
            codigo = Integer.parseInt(codigoTexto);
        } catch (NumberFormatException e) {
            System.out.println("El código debe ser un número.");
            return;
        }

        String cursoSeleccionado = (String) cbxCurso.getSelectedItem();
        nodo<Curso> cursoActual = ProyectoFinal.cursitos.inicio;
        while (cursoActual != null && !cursoActual.dato.getCursos().equals(cursoSeleccionado)) {
            cursoActual = cursoActual.siguiente;
        }
        if (cursoActual == null) {
            return;
        }

        nodo<Alumno> alumnosCurso = cursoActual.dato.getAlumnosdelcurso().inicio;
        while (alumnosCurso != null) {
            if (alumnosCurso.dato.getCodigo() == codigo) {
                Alumno alumno = alumnosCurso.dato;
                int[] notas = alumno.getNotas(); // Usamos el getter para obtener las notas
                try {
                    notas[0] = Integer.parseInt(txtNota1.getText());
                    notas[1] = Integer.parseInt(txtNota2.getText());
                    notas[2] = Integer.parseInt(txtNota4.getText());
                    notas[3] = Integer.parseInt(txtNota3.getText());
                    alumno.setNotas(notas); // Actualizamos las notas usando el setter
                } catch (NumberFormatException e) {
                    System.out.println("Las notas deben ser números.");
                    return;
                }

                actualizarTabla();
                
                // Limpiar los campos de texto después de actualizar las notas
                limpiarTxt();
                
                return;
            }
            alumnosCurso = alumnosCurso.siguiente;
        }

        System.out.println("Alumno no encontrado.");
        limpiarTxt();
        
    }
    
    public void limpiarTxt(){
        txtCodigo.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota4.setText("");
        txtNota3.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        Alumno4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Alumno2 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        Alumno = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        cbxCurso = new javax.swing.JComboBox<>();
        txtNota3 = new javax.swing.JTextField();
        Alumno3 = new javax.swing.JLabel();
        Alumno1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListar = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Notas por Curso");

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        Alumno4.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Alumno4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Alumno4.setText("Nota 3:");

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Curso:");

        Alumno2.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Alumno2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Alumno2.setText("Nota 2:");

        Alumno.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Alumno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Alumno.setText("Nota 1:");

        cbxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Curso" }));
        cbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursoActionPerformed(evt);
            }
        });

        Alumno3.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Alumno3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Alumno3.setText("Nota 4:");

        Alumno1.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Alumno1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Alumno1.setText("Id Alumno");

        btnEditar.setText("Guardar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tblListar.setBackground(new java.awt.Color(240, 255, 185));
        tblListar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblListar);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alumno1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Alumno2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alumno4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Alumno3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txtNota3)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(663, 663, 663)
                            .addComponent(btnEditar))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtNota1, txtNota2, txtNota3, txtNota4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Alumno1)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscar)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Alumno)
                                .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Alumno2)
                                .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno4)
                            .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumno3)
                            .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(17, 17, 17))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Alumno, Alumno1, Alumno2, Alumno3, Alumno4, cbxCurso, jLabel2, txtCodigo, txtNota1, txtNota2, txtNota3, txtNota4});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCursoActionPerformed

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
            java.util.logging.Logger.getLogger(EditarNotasXCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarNotasXCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarNotasXCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarNotasXCurso.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarNotasXCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alumno;
    private javax.swing.JLabel Alumno1;
    private javax.swing.JLabel Alumno2;
    private javax.swing.JLabel Alumno3;
    private javax.swing.JLabel Alumno4;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblListar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    // End of variables declaration//GEN-END:variables
}
