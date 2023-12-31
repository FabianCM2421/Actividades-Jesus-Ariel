/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.EstadoCrontroller;
import Controller.Paiscontroller;
import Model.Entity.Continentes;
import Model.Entity.Estado;
import Model.Entity.Pais;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author supap
 */
public class Ventana5 extends javax.swing.JInternalFrame {

    EstadoCrontroller EsC = new EstadoCrontroller();
    Estado estadi = new Estado();
    DefaultTableModel modelo;

    public Ventana5() {
        initComponents();
        ListarContinentes();
        this.ComboBoxPais();
    }

    private void ComboBoxPais() {
        Pais control = new Pais();
        ComboxPaises.removeAllItems();
        for (int i = 0; i < control.ListarPaises().size(); i++) {
            ComboxPaises.addItem(control.ListarPaises().set(i, control).getDescripcion());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaesatdos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtpaisid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboxPaises = new javax.swing.JComboBox<>();
        TxtBucar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tablaesatdos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "DESCRIPCION", "PAIS"
            }
        ));
        tablaesatdos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaesatdosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaesatdos);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Codigo");

        jLabel3.setText("Descripcio");

        jLabel4.setText("ID Pais:");

        ComboxPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboxPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboxPaisesActionPerformed(evt);
            }
        });

        TxtBucar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBucarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpaisid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBucar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ComboxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(txtpaisid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(TxtBucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(btnGuardar))
                        .addGap(63, 63, 63)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String codigo_postal;
        String descripcion;
        String valorSeleccionado = (String) ComboxPaises.getSelectedItem();

        if (!"".equals(txtid.getText()) || !"".equals(txtCodigo.getText()) || !"".equals(txtdescripcion.getText()) || !"".equals(ComboxPaises.getSelectedItem())) {

            codigo_postal = txtCodigo.getText();
            descripcion = txtdescripcion.getText();

            valorSeleccionado = (String) ComboxPaises.getSelectedItem();
            System.out.println("view valor que manda" + valorSeleccionado);
            EsC.GuardarRegistro(WIDTH, codigo_postal, descripcion, valorSeleccionado);
            ListarContinentes();
            LimpiarTable();
            Limpiar();
             ListarContinentes();

            JOptionPane.showMessageDialog(null, "Cliente Registrado", "title", JOptionPane.ERROR_MESSAGE);

            btnGuardar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ComboxPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboxPaisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboxPaisesActionPerformed

    private void tablaesatdosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaesatdosMouseClicked

        btnGuardar.setEnabled(false);
        int fila = tablaesatdos.rowAtPoint(evt.getPoint());
        txtid.setText(tablaesatdos.getValueAt(fila, 0).toString());
        txtCodigo.setText(tablaesatdos.getValueAt(fila, 1).toString());
        txtdescripcion.setText(tablaesatdos.getValueAt(fila, 2).toString());
        txtpaisid.setText(tablaesatdos.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tablaesatdosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int id;
        String codigo_postal;
        String descripcion;
        String pais_id;

        if ("".equals(txtid.getText())) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            id = Integer.parseInt(txtid.getText());
            codigo_postal = txtCodigo.getText();
            descripcion = txtdescripcion.getText();
            pais_id = txtpaisid.getText();

            if (!"".equals(codigo_postal) || !"".equals(descripcion) || !"".equals(pais_id)) {
                EsC.Modificar(id, codigo_postal, descripcion, pais_id);
                System.out.println("view dato vista " + descripcion);
                JOptionPane.showMessageDialog(null, "Modificado");
                LimpiarTable();
                Limpiar();
                ListarContinentes();

                // btnmodifica.setEnabled(false); // Este botón no está presente en el código proporcionado
                btnGuardar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo hacer el cambio");
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         int Id;

        if (!txtid.getText().isEmpty()) {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?" ,"title", JOptionPane.YES_NO_OPTION);
            if (pregunta == 0) {
                Id = Integer.parseInt(txtid.getText());
                EsC.EliminarRegistroF(Id);
                LimpiarTable();
                Limpiar();
                ListarContinentes();

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila." , "", JOptionPane.WARNING_MESSAGE);
        }
 
        
    }//GEN-LAST:event_jButton1ActionPerformed
TableRowSorter trs;

    private void TxtBucarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBucarKeyTyped
        trs = new TableRowSorter(modelo);
        tablaesatdos.setRowSorter(trs);

        TxtBucar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(TxtBucar.getText(), 2));
            }
        });
    }//GEN-LAST:event_TxtBucarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboxPaises;
    private javax.swing.JTextField TxtBucar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaesatdos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtpaisid;
    // End of variables declaration//GEN-END:variables

    public void ListarContinentes() {
        List<Estado> listarEstado = estadi.ListarPaises();
        modelo = (DefaultTableModel) tablaesatdos.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < listarEstado.size(); i++) {
            ob[0] = listarEstado.get(i).getId();
            ob[1] = listarEstado.get(i).getCodigo_postal();
            ob[2] = listarEstado.get(i).getDescripcion();
            ob[3] = listarEstado.get(i).getDescipcionPais();

            modelo.addRow(ob);
        }
        tablaesatdos.setModel(modelo);
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void Limpiar() {
        txtid.setText("");
        txtCodigo.setText("");
        txtdescripcion.setText("");

    }

}
