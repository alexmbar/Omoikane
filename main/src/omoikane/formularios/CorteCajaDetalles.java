/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Articulo.java
 *
 * Created on 22/08/2008, 07:40:21 PM
 */

package omoikane.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import omoikane.sistema.*;

/**
 *
 * @author Octavio
 */
public class CorteCajaDetalles extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    public int ID;
    /** Creates new form Articulo */
    public CorteCajaDetalles() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);

        Herramientas.centrarVentana(this);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDCorte = new javax.swing.JTextField();
        txtIDCaja = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroVenta = new javax.swing.JTextField();
        txtHasta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIDAlmacen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtImpuestos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        txtDesde = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtRetiro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setForeground(java.awt.Color.white);
        setTitle("Corte de Caja");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 28px; }</style></head>\n<body>\nCorte de Caja\n</body></html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 80, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID Corte:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("ID Caja:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 20));

        txtIDCorte.setEditable(false);
        txtIDCorte.setBackground(new java.awt.Color(51, 51, 51));
        txtIDCorte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIDCorte.setForeground(new java.awt.Color(255, 255, 255));
        txtIDCorte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIDCorte.setBorder(null);
        txtIDCorte.setFocusable(false);
        getContentPane().add(txtIDCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 30));

        txtIDCaja.setEditable(false);
        txtIDCaja.setBackground(new java.awt.Color(51, 51, 51));
        txtIDCaja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIDCaja.setForeground(new java.awt.Color(255, 255, 255));
        txtIDCaja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIDCaja.setBorder(null);
        txtIDCaja.setFocusable(false);
        getContentPane().add(txtIDCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("<html>N&uacute;mero de <br>Ventas:</html>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Subtotal:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Hasta:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, 20));

        txtNumeroVenta.setEditable(false);
        txtNumeroVenta.setBackground(new java.awt.Color(51, 51, 51));
        txtNumeroVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNumeroVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroVenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumeroVenta.setBorder(null);
        txtNumeroVenta.setFocusable(false);
        getContentPane().add(txtNumeroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 30));

        txtHasta.setEditable(false);
        txtHasta.setBackground(new java.awt.Color(51, 51, 51));
        txtHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHasta.setForeground(new java.awt.Color(255, 255, 255));
        txtHasta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHasta.setBorder(null);
        txtHasta.setFocusable(false);
        getContentPane().add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 160, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("ID Almacen:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 20));

        txtIDAlmacen.setEditable(false);
        txtIDAlmacen.setBackground(new java.awt.Color(51, 51, 51));
        txtIDAlmacen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIDAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        txtIDAlmacen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIDAlmacen.setBorder(null);
        txtIDAlmacen.setFocusable(false);
        txtIDAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(txtIDAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 110, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Impuesto:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        txtImpuestos.setEditable(false);
        txtImpuestos.setBackground(new java.awt.Color(51, 51, 51));
        txtImpuestos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImpuestos.setForeground(new java.awt.Color(255, 255, 255));
        txtImpuestos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtImpuestos.setBorder(null);
        txtImpuestos.setFocusable(false);
        getContentPane().add(txtImpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Venta Total:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(51, 51, 51));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setBorder(null);
        txtTotal.setFocusable(false);
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 250, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Descuento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        txtDescuento.setEditable(false);
        txtDescuento.setBackground(new java.awt.Color(51, 51, 51));
        txtDescuento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDescuento.setBorder(null);
        txtDescuento.setFocusable(false);
        getContentPane().add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 30));

        txtDesde.setEditable(false);
        txtDesde.setBackground(new java.awt.Color(51, 51, 51));
        txtDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDesde.setForeground(new java.awt.Color(255, 255, 255));
        txtDesde.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDesde.setBorder(null);
        txtDesde.setFocusable(false);
        getContentPane().add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 160, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Desde:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 10, 10));

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(51, 51, 51));
        txtSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubtotal.setBorder(null);
        txtSubtotal.setFocusable(false);
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 30));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Retiros:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));

        txtRetiro.setEditable(false);
        txtRetiro.setBackground(new java.awt.Color(51, 51, 51));
        txtRetiro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRetiro.setForeground(new java.awt.Color(255, 255, 255));
        txtRetiro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRetiro.setBorder(null);
        txtRetiro.setFocusable(false);
        getContentPane().add(txtRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 250, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Depositos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 20));

        txtDeposito.setEditable(false);
        txtDeposito.setBackground(new java.awt.Color(51, 51, 51));
        txtDeposito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDeposito.setForeground(new java.awt.Color(255, 255, 255));
        txtDeposito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDeposito.setBorder(null);
        txtDeposito.setFocusable(false);
        getContentPane().add(txtDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 250, 30));

        txtEfectivo.setEditable(false);
        txtEfectivo.setBackground(new java.awt.Color(51, 51, 51));
        txtEfectivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        txtEfectivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEfectivo.setBorder(null);
        txtEfectivo.setFocusable(false);
        getContentPane().add(txtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 250, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("<html>Efectivo<br> en caja:</html>");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFocusable(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_btnCerrarActionPerformed

    private void txtIDAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDAlmacenActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtIDAlmacenActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtHasta;
    public javax.swing.JTextField txtIDAlmacen;
    private javax.swing.JTextField txtIDCaja;
    private javax.swing.JTextField txtIDCorte;
    private javax.swing.JTextField txtImpuestos;
    private javax.swing.JTextField txtNumeroVenta;
    private javax.swing.JTextField txtRetiro;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables


    public String getTxtDescuento()   { return this.txtDescuento.getText(); }
    public String getTxtDesde()   { return this.txtDesde.getText(); }
    public String getTxthasta()   { return this.txtHasta.getText(); }
    public String getTxtIDAlmacen()   { return this.txtIDAlmacen.getText(); }
    public String getTxtIDCaja()   { return this.txtIDCaja.getText(); }
    public String getTxtIDCorte()   { return this.txtIDCorte.getText(); }
    public String getTxtImpuesto()   { return this.txtImpuestos.getText(); }
    public String getTxtNumeroVenta()   { return this.txtNumeroVenta.getText(); }
    public String getTxtSubtotal()   { return this.txtSubtotal.getText(); }
    public String getTxtRetiro()   { return this.txtRetiro.getText(); }
    public String getTxtDeposito()   { return this.txtDeposito.getText(); }
    public String getTxtEfectivo()   { return this.txtEfectivo.getText(); }
    public String getTxtTotal()   { return this.txtTotal.getText(); }

    public void setTxtDescuento     (String txt)     { txtDescuento.setText(txt); }
    public void setTxtDesde         (String txt)     { txtDesde.setText(txt); }
    public void setTxtHasta         (String txt)     { txtHasta.setText(txt); }
    public void setTxtIDAlmacen     (String txt)     { txtIDAlmacen.setText(txt); }
    public void setTxtIDCaja        (String txt)     { txtIDCaja.setText(txt); }
    public void setTxtIDCorte       (String txt)     { txtIDCorte.setText(txt); }
    public void setTxtImpuesto      (String txt)     { txtImpuestos.setText(txt); }
    public void setTxtNumeroVenta   (String txt)     { txtNumeroVenta.setText(txt); }
    public void setTxtSubtotal      (String txt)     { txtSubtotal.setText(txt); }
    public void setTxtRetiro        (String txt)     { txtRetiro.setText(txt); }
    public void setTxtDeposito      (String txt)     { txtDeposito.setText(txt); }
    public void setTxtEfectivo      (String txt)     { txtEfectivo.setText(txt); }
    public void setTxtTotal         (String txt)     { txtTotal.setText(txt); }

    public void paintComponent(Graphics g)
    {
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawImage(fondo, 0, 0, null);

    }
    public void generarFondo(Component componente)
    {
      Rectangle areaDibujo = this.getBounds();
      BufferedImage tmp;
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

      tmp = gc.createCompatibleImage(areaDibujo.width, areaDibujo.height,BufferedImage.TRANSLUCENT);
      Graphics2D g2d = (Graphics2D) tmp.getGraphics();
      g2d.setColor(new Color(0,0,0,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;
    }
}