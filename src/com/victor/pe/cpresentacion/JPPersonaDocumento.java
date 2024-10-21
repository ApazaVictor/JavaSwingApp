/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.victor.pe.cpresentacion;

import com.victor.pe.cmodelo.TipoDocumento;
import com.victor.pe.cnegocio.TipoDocumentoBO;
import javax.swing.JOptionPane;

/**
 *
 * @author Soporte
 */
public class JPPersonaDocumento extends javax.swing.JPanel {

    /**
     * Creates new form JPPersonaDocumento
     */
    public JPPersonaDocumento() {
        initComponents();
        listarTipoDocumentoCombo();
    }
    
    private void listarTipoDocumentoCombo(){
        TipoDocumentoBO tdbo =new TipoDocumentoBO();
        
        for(TipoDocumento item : tdbo.listarTipoDocumentoCombo()){
            jCTipoDocumento.addItem(item.getIdTipoDocumento()+" "+item.getNombre());
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
        TxtPersona = new javax.swing.JTextField();
        btnGuardar2 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtEstadoPersona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCTipoDocumento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TxtNumeroDocumento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Registro Persona Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel2.setText("Estado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        TxtPersona.setBorder(null);
        TxtPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 270, 20));

        btnGuardar2.setBackground(new java.awt.Color(51, 255, 51));
        btnGuardar2.setText("Guardar");
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        btnLimpiar2.setBackground(new java.awt.Color(255, 0, 51));
        btnLimpiar2.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        jLabel3.setText("Tipo Documento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        TxtEstadoPersona.setBorder(null);
        TxtEstadoPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEstadoPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtEstadoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 270, 20));

        jLabel4.setText("Numero Documento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jCTipoDocumento.setBorder(null);
        jCTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(jCTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 270, -1));

        jLabel5.setText("Persona");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        TxtNumeroDocumento.setBorder(null);
        TxtNumeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNumeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 270, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 270, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 270, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 270, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPersonaActionPerformed

    private void TxtEstadoPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEstadoPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEstadoPersonaActionPerformed

    private void TxtNumeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroDocumentoActionPerformed

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        // Validar que todos los campos estén llenos
        String persona = TxtPersona.getText().trim();
        String estado = TxtEstadoPersona.getText().trim();
        String numeroDocumento = TxtNumeroDocumento.getText().trim();
        String tdSeleccionado = (String) jCTipoDocumento.getSelectedItem();

        // Verificar si los campos están vacíos o el tipo de documento no está seleccionado
        if (persona.isEmpty() || estado.isEmpty() || numeroDocumento.isEmpty() || tdSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return; // Salir del método si hay campos vacíos
        }

        String idTipoDocumento = tdSeleccionado.split(" ")[0]; // Extraer el ID del tipo de documento

        try {
            // Crear un nuevo objeto TipoDocumento y agregarlo a la base de datos
            TipoDocumentoBO tdbo = new TipoDocumentoBO();
            TipoDocumento td = new TipoDocumento();
            td.setNombre(persona);
            td.setEstado(estado);
            //td.setIdTipoDocumento(IdTipoDocumento); // Asegúrate de que el método setIdTipoDocumento esté en la clase TipoDocumento
            //td.setNumeroDocumento(numeroDocumento); // Asegúrate de que el método setNumeroDocumento esté en la clase TipoDocumento

            tdbo.agregarTipoDocumento(td); // Agregar a la base de datos

            JOptionPane.showMessageDialog(null, ":) Se guardó correctamente");
            //limpiarCampos(); // Limpiar los campos después de guardar
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: al guardar Tipo documento " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
    // Llamar a un método para limpiar todos los campos                                         
    // Método para limpiar los campos de texto
        TxtPersona.setText("");
        TxtEstadoPersona.setText("");
        TxtNumeroDocumento.setText("");
        jCTipoDocumento.setSelectedIndex(-1); // Reiniciar el combo box                                         
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void jCTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipoDocumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtEstadoPersona;
    private javax.swing.JTextField TxtNumeroDocumento;
    private javax.swing.JTextField TxtPersona;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JComboBox<String> jCTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
