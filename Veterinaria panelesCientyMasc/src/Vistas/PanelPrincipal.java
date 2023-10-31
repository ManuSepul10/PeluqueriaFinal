/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Entidades.Cliente;
import Entidades.Mascota;
import java.awt.Color;
import java.awt.event.ActionEvent;




public class PanelPrincipal extends javax.swing.JFrame {
Cliente cliente=new Cliente();
Mascota mascota=new Mascota();

  
    public PanelPrincipal() {
        initComponents();
  cargarPanelFondo();
  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBConsulta = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBVisita = new javax.swing.JButton();
        jBCliente = new javax.swing.JButton();
        jBMascota = new javax.swing.JButton();
        jBTratamiento = new javax.swing.JButton();
        PanelCambio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 225));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("La Vete de Gaston");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        jBConsulta.setBackground(new java.awt.Color(0, 0, 204));
        jBConsulta.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jBConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jBConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBConsulta.setText("Consultas");
        jBConsulta.setBorder(null);
        jBConsulta.setBorderPainted(false);
        jBConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBConsultaMouseExited(evt);
            }
        });
        jBConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultaActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(0, 0, 204));
        jBSalir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBSalir.setText("Salir ");
        jBSalir.setBorder(null);
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBVisita.setBackground(new java.awt.Color(0, 0, 204));
        jBVisita.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jBVisita.setForeground(new java.awt.Color(255, 255, 255));
        jBVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBVisita.setText("Visita");
        jBVisita.setBorder(null);
        jBVisita.setBorderPainted(false);
        jBVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBVisitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBVisitaMouseExited(evt);
            }
        });
        jBVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisitaActionPerformed(evt);
            }
        });

        jBCliente.setBackground(new java.awt.Color(0, 0, 204));
        jBCliente.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jBCliente.setForeground(new java.awt.Color(255, 255, 255));
        jBCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBCliente.setText("Cliente");
        jBCliente.setBorder(null);
        jBCliente.setBorderPainted(false);
        jBCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBClienteMouseExited(evt);
            }
        });
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });

        jBMascota.setBackground(new java.awt.Color(0, 0, 204));
        jBMascota.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jBMascota.setForeground(new java.awt.Color(255, 255, 255));
        jBMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBMascota.setText("Mascota");
        jBMascota.setBorder(null);
        jBMascota.setBorderPainted(false);
        jBMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBMascotaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBMascotaMouseExited(evt);
            }
        });
        jBMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMascotaActionPerformed(evt);
            }
        });

        jBTratamiento.setBackground(new java.awt.Color(0, 0, 204));
        jBTratamiento.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jBTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        jBTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono patitas.png"))); // NOI18N
        jBTratamiento.setText("Tratamientos");
        jBTratamiento.setBorder(null);
        jBTratamiento.setBorderPainted(false);
        jBTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBTratamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBTratamientoMouseExited(evt);
            }
        });
        jBTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        PanelCambio.setBackground(new java.awt.Color(51, 255, 255));
        PanelCambio.setPreferredSize(new java.awt.Dimension(880, 750));

        javax.swing.GroupLayout PanelCambioLayout = new javax.swing.GroupLayout(PanelCambio);
        PanelCambio.setLayout(PanelCambioLayout);
        PanelCambioLayout.setHorizontalGroup(
            PanelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        PanelCambioLayout.setVerticalGroup(
            PanelCambioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsultaMouseEntered
    jBConsulta.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jBConsultaMouseEntered

    private void jBConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBConsultaMouseExited
        jBConsulta.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jBConsultaMouseExited

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      dispose();
      PanelUsuario panelUsuario=new PanelUsuario();
      panelUsuario.setVisible(true);
      panelUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        jBSalir.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        jBSalir.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jBSalirMouseExited

    private void jBVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisitaActionPerformed
         PanelCambio.removeAll();
        PanelVisita panelVisita=new PanelVisita(PanelCambio);
       panelVisita.setBounds(0, 0, 880, 750);
       panelVisita.setVisible(true);
       PanelCambio.add(panelVisita);
       panelVisita.revalidate();
    }//GEN-LAST:event_jBVisitaActionPerformed

    private void jBVisitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisitaMouseEntered
       jBVisita.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jBVisitaMouseEntered

    private void jBVisitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBVisitaMouseExited
       jBVisita.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jBVisitaMouseExited

    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
      PanelCambio.removeAll();
       PanelCliente panelCliente=new PanelCliente(PanelCambio);
       panelCliente.setBounds(0, 0, 880, 750);
       panelCliente.setVisible(true);
       PanelCambio.add(panelCliente);
       panelCliente.revalidate();
    }//GEN-LAST:event_jBClienteActionPerformed

    private void jBClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClienteMouseEntered
        jBCliente.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jBClienteMouseEntered

    private void jBClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClienteMouseExited
        jBCliente.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jBClienteMouseExited

    private void jBMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMascotaActionPerformed
         PanelCambio.removeAll();
        PanelMascota panelMascota=new PanelMascota(PanelCambio);
       panelMascota.setBounds(0, 0, 880, 750);
       panelMascota.setVisible(true);
       PanelCambio.add(panelMascota);
       panelMascota.revalidate();
    }//GEN-LAST:event_jBMascotaActionPerformed

    private void jBMascotaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMascotaMouseEntered
        jBMascota.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jBMascotaMouseEntered

    private void jBMascotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMascotaMouseExited
jBMascota.setBackground(new Color(0,0,204));       
    }//GEN-LAST:event_jBMascotaMouseExited

    private void jBTratamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTratamientoMouseEntered
        jBTratamiento.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jBTratamientoMouseEntered

    private void jBTratamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBTratamientoMouseExited
        jBTratamiento.setBackground(new Color(0,0,204)); 
    }//GEN-LAST:event_jBTratamientoMouseExited

    private void jBTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTratamientoActionPerformed
  PanelCambio.removeAll();
        PanelTratamiento panelTratamiento=new PanelTratamiento(PanelCambio);
       panelTratamiento.setBounds(0, 0, 880, 750);
       panelTratamiento.setVisible(true);
       PanelCambio.add(panelTratamiento);
       panelTratamiento.revalidate();
        
    }//GEN-LAST:event_jBTratamientoActionPerformed

    private void jBConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultaActionPerformed
        PanelCambio.removeAll();
        PanelConsulta panelConsulta=new PanelConsulta(PanelCambio);
       panelConsulta.setBounds(0, 0, 880, 750);
       panelConsulta.setVisible(true);
       PanelCambio.add(panelConsulta);
       panelConsulta.revalidate();
    }//GEN-LAST:event_jBConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCambio;
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBConsulta;
    private javax.swing.JButton jBMascota;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBTratamiento;
    private javax.swing.JButton jBVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private void cargarPanelFondo(){
      PanelCambio.removeAll();
       PanelFondo panelFondo=new PanelFondo();
       panelFondo.setBounds(0, 0, 880, 750);
       panelFondo.setVisible(true);
       PanelCambio.add(panelFondo);
       panelFondo.revalidate();
}

}
