package Vistas;

import Entidades.Cliente;
import Entidades.Consulta;
import Entidades.Visita;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Vistas.PanelFondo;
import com.toedter.calendar.JDateChooser;
import conexion.ClienteData;
import conexion.ConsultaData;
import conexion.VisitaData;
import conexion.MascotaData;
import static conexion.MascotaData.listarMascotasPorCliente;
import conexion.TratamientoData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PanelConsulta extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    private DefaultTableModel tablaConsultaVisitas = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    JPanel panel = null;
    Mascota mascota = null;
    Tratamiento tratamiento = null;
//    private JDateChooser campoInicio;
//private JDateChooser campoFin;

    public PanelConsulta(JPanel panelCambio) {
        initComponents();
        panel = panelCambio;
        cargacombotratamiento();
//        cargaComboMascota();
        armarCabecera1();
//        armarCabecera2();
        armarCabecera3();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBSalir1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCBTratamiento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCBMascota = new javax.swing.JComboBox<>();
        jBLimpiar1 = new javax.swing.JButton();
        jBSalir2 = new javax.swing.JButton();
        jBLimpiar3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTVisitas2 = new javax.swing.JTable();
        jBSeleccionar = new javax.swing.JButton();
        jBSeleccionar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTMascota = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jBSalir1.setBackground(new java.awt.Color(51, 153, 255));
        jBSalir1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBSalir1.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBSalir1.setText("Salir");
        jBSalir1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBSalir1.setBorderPainted(false);
        jBSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir1ActionPerformed(evt);
            }
        });

        setPreferredSize(new java.awt.Dimension(880, 750));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Consulta Por Tratamiento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione un tratamiento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Consulta Por Mascota");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccione una mascota");

        jBLimpiar1.setText("Limpiar");
        jBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar1ActionPerformed(evt);
            }
        });

        jBSalir2.setBackground(new java.awt.Color(51, 153, 255));
        jBSalir2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBSalir2.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBSalir2.setText("Salir");
        jBSalir2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBSalir2.setBorderPainted(false);
        jBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir2ActionPerformed(evt);
            }
        });

        jBLimpiar3.setText("Limpiar");
        jBLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar3ActionPerformed(evt);
            }
        });

        jTVisitas2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTVisitas2);

        jBSeleccionar.setText("Seleccionar");
        jBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionarActionPerformed(evt);
            }
        });

        jBSeleccionar1.setText("Seleccionar");
        jBSeleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionar1ActionPerformed(evt);
            }
        });

        jTMascota.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTMascota);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el Dni del Dueño");

        jTDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDniKeyTyped(evt);
            }
        });

        jBBuscar.setBackground(new java.awt.Color(51, 153, 255));
        jBBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jCBMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(175, 175, 175)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBBuscar))))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBLimpiar3)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSeleccionar1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(jBSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBLimpiar1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBSeleccionar))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(578, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(706, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(136, 136, 136)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSeleccionar)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jBLimpiar1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBSeleccionar1)
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBBuscar))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBLimpiar3)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jBSalir2)
                                                .addGap(57, 57, 57))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(jLabel4)
                    .addContainerGap(596, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(575, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar1ActionPerformed
        jCBTratamiento.setSelectedIndex(0);
        modelo.setRowCount(0);

    }//GEN-LAST:event_jBLimpiar1ActionPerformed

    private void jBLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar3ActionPerformed
        jCBMascota.setSelectedIndex(0);
        tablaConsultaVisitas.setRowCount(0);
    }//GEN-LAST:event_jBLimpiar3ActionPerformed

    private void jBSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir1ActionPerformed
        this.setVisible(false);
        panel.removeAll();
        PanelFondo panelFondo = new PanelFondo();
        panelFondo.setBounds(0, 0, 880, 750);
        panelFondo.setVisible(true);
        panel.add(panelFondo);
        panelFondo.revalidate();
    }//GEN-LAST:event_jBSalir1ActionPerformed

    private void jBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir2ActionPerformed
        this.setVisible(false);
        panel.removeAll();
        PanelFondo panelFondo = new PanelFondo();
        panelFondo.setBounds(0, 0, 880, 750);
        panelFondo.setVisible(true);
        panel.add(panelFondo);
        panelFondo.revalidate();
    }//GEN-LAST:event_jBSalir2ActionPerformed

    private void jBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionarActionPerformed
        modelo.setRowCount(0);
        if (jCBTratamiento.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "debe seleccionar un tratamiento");
        } else {
            Tratamiento tratamiento = (Tratamiento) jCBTratamiento.getSelectedItem();

            ArrayList<Mascota> mascotas = new ArrayList<>();

            mascotas = ConsultaData.buscarMascotasPorTratamiento(tratamiento);

            armarTabla1(mascotas);
        }

    }//GEN-LAST:event_jBSeleccionarActionPerformed

    private void jBSeleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionar1ActionPerformed

        tablaConsultaVisitas.setRowCount(0);
        if (jCBMascota.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "debe seleccionar una mascota");
        } else {
            Mascota mascota = (Mascota) jCBMascota.getSelectedItem();

            armarTabla3(ConsultaData.buscarVisitasPorMascota(mascota));
        }

    }//GEN-LAST:event_jBSeleccionar1ActionPerformed

    private void jTDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDniKeyTyped
        char caracter = evt.getKeyChar();

        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTDniKeyTyped

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
     
        if (jTDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El documento está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            
        }else{
jCBMascota.removeAllItems();
        try {
            int documento = Integer.parseInt(jTDni.getText());
            Cliente clienteEncontrado = ClienteData.buscarClientePorDocumento(documento);

            if (clienteEncontrado != null) {
                ArrayList<Mascota> mascotas = new ArrayList<>();
                mascotas = MascotaData.listarMascotasPorCliente(documento);
                cargarcombo(mascotas);
              

            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El documento no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }}
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar3;
    private javax.swing.JButton jBSalir1;
    private javax.swing.JButton jBSalir2;
    private javax.swing.JButton jBSeleccionar;
    private javax.swing.JButton jBSeleccionar1;
    private javax.swing.JComboBox<Mascota> jCBMascota;
    private javax.swing.JComboBox<Tratamiento> jCBTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTable jTMascota;
    private javax.swing.JTable jTVisitas2;
    // End of variables declaration//GEN-END:variables
private void cargacombotratamiento() {
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();
        tratamientos = TratamientoData.listarTratamiento();
        jCBTratamiento.addItem(null);
        for (Tratamiento tratamiento : tratamientos) {
            jCBTratamiento.addItem(tratamiento);
        }

    }

    private void armarCabecera1() {
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Sexo");
        modelo.addColumn("Fecha de nacim");
        modelo.addColumn("Peso Actual");

        jTMascota.setModel(modelo);

    }

    private void armarCabecera3() {
        tablaConsultaVisitas.addColumn("Fecha");
        tablaConsultaVisitas.addColumn("Tipo");
        tablaConsultaVisitas.addColumn("Descripción");
        tablaConsultaVisitas.addColumn("Costo");

        jTVisitas2.setModel(tablaConsultaVisitas);

    }

//    private void cargaComboMascota() {
//        ArrayList<Mascota> mascotas = new ArrayList<>();
//        mascotas = MascotaData.listarMascota();
//        jCBMascota.addItem(null);
//        for (Mascota mascota : mascotas) {
//            jCBMascota.addItem(mascota);
//        }
//
//    }

    private void armarTabla1(ArrayList<Mascota> listado) {

        for (Mascota mascota : listado) {
            System.out.println(mascota.toString());
            modelo.addRow(new Object[]{mascota.getEspecie(), mascota.getRaza(), mascota.getSexo(), mascota.getFechaNacimiento(), mascota.getPesoActual()});

        }
    }

    private void armarTabla3(ArrayList<Consulta> listado) {

        for (Consulta consulta : listado) {

            tablaConsultaVisitas.addRow(new Object[]{consulta.getFechaVisita(), consulta.getTipo(), consulta.getDescripcion(), consulta.getCostoTotal()});

        }
    }
    private void cargarcombo(ArrayList<Mascota> mascotas) {

        jCBMascota.addItem(null);
        for (Mascota mascota1 : mascotas) {
            jCBMascota.addItem(mascota1);
        }
    }

}
