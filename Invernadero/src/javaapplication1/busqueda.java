/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.imageio.IIOException;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class busqueda extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public busqueda() {
        initComponents();
         cargar();
    }

     public void cargar(){
    
        String [] titulos = {"Sensor","Fecha","Hora","Tempeatura","Humedad","Nombre"};
        String [] registros = new String[50];
    //String sql = "select *from informe";
    
    model = new DefaultTableModel(null, titulos);
     conexion cn=new conexion();
     
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("SELECT C.nombre,G.id_sensor, G.humedad, G.temperatura, G.fecha, G.hora FROM catalogo C, invernadero I, sensor S, informe G WHERE (C.id_planta=I.id_planta AND I.id_invernadero= S.id_invernadero AND S.id_sensor= G.id_sensor);");
            while (rs.next()) {   
                // registros[0] = rs.getString("id_informe");  //// aline O.O aqui si quieres puedes comentar los datos que no quieres visualizar y cambias las posiciones del arreglo
                 registros[0] = rs.getString("id_sensor");
                 registros[1] = rs.getString("fecha");
                 registros[2] = rs.getString("hora"); 
                 registros[3] = rs.getString("temperatura");
                 registros[4] = rs.getString("humedad");
                 registros[5] = rs.getString("nombre");
         model.addRow(registros);
        
        } 
       t.setModel(model);
        }catch (Exception e) {
        }
    
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buscartodo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sensor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fecha_in = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        temperatura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        humedad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t.setModel(new javax.swing.table.DefaultTableModel(
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
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t);

        jLabel1.setText("Invernadero");

        buscartodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscartodoKeyPressed(evt);
            }
        });

        jLabel2.setText("Busqueda");

        jLabel4.setText("Sensor");

        sensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha ");

        jLabel6.setText("Hora");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.jpg"))); // NOI18N
        jButton1.setText("Generar informe");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Temperatura");

        jLabel8.setText("Humedad");

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(area)
                                .addComponent(jLabel4)
                                .addComponent(sensor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(95, 95, 95)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(buscartodo, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_in, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(humedad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fecha_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(humedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sensorActionPerformed

    private void buscartodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscartodoKeyPressed
        // TODO add your handling code here:
        String titulos[]={"Sensor","Fecha","Hora","Temperatura","Humedad"};
        String[] registros= new String[50];
        
            String sql="SELECT * FROM informe WHERE id_informe LIKE '%"+ buscartodo.getText()+"%'"
                    +"OR id_sensor LIKE '%"+buscartodo.getText()+"%'"
                    +"OR fecha LIKE '%"+buscartodo.getText()+"%'"
                    +"OR hora LIKE '%"+buscartodo.getText()+"%'"
                    +"OR temperatura LIKE '%"+buscartodo.getText()+"%'"
                    +"OR humedad LIKE '%"+buscartodo.getText()+"%'";
            model = new DefaultTableModel(null,titulos);
            conexion cn=new conexion();
            
            
            try {
                Statement st=cn.con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    registros[0] = rs.getString("id_sensor");
                    registros[1] = rs.getString("fecha");
                    registros[2] = rs.getString("hora"); 
                    registros[3] = rs.getString("temperatura");
                    registros[4] = rs.getString("humedad");
                    model.addRow(registros);
                }
                t.setModel(model);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }//GEN-LAST:event_buscartodoKeyPressed

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked
        // TODO add your handling code here
        limpiar();
        bloquear();
        int col = t.getSelectedRow();
        area.setText(t.getModel().getValueAt(col, 0).toString());
        sensor.setText(t.getModel().getValueAt(col, 0).toString());
     
        fecha_in.setText(t.getModel().getValueAt(col, 1).toString());
        hora.setText(t.getModel().getValueAt(col, 2).toString());
        temperatura.setText(t.getModel().getValueAt(col, 3).toString());
        humedad.setText(t.getModel().getValueAt(col, 4).toString());
//        ffin.setText(t_evento.getModel().getValueAt(col, 5).toString());
    }//GEN-LAST:event_tMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Document documento = new Document();

        try {

            String ruta = System.getProperty("user.home");
            //System.out.println(ruta);

            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte.pdf"));
            
            Image header = Image.getInstance("src/imagenes/encabezado.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte Invernadero \n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Datos Obtenidos \n\n");
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(7);
            tabla.addCell("Nombre de la planta");
            tabla.addCell("Area");
            tabla.addCell("Sensor");
            tabla.addCell("Humedad");
            tabla.addCell("Temperatura");
            tabla.addCell("Fecha");
            tabla.addCell("Hora");

            try {

                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/esp32", "root", "123456789");
                PreparedStatement pst = con.prepareStatement("SELECT C.nombre, I.id_invernadero, S.id_sensor, G.humedad, G.temperatura, G.fecha, G.hora FROM catalogo C, invernadero I, sensor S, informe G WHERE (C.id_planta=I.id_planta AND I.id_invernadero= S.id_invernadero AND S.id_sensor= G.id_sensor) AND (I.id_invernadero=1);");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));

                    } while (rs.next());
                    documento.add(tabla);
                }

            } catch (DocumentException | SQLException e) {
                System.out.println("Error en conexión " + e);
            }

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");

        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error en PDF " + e);
        } catch (IOException e){
            System.out.println("Error en la imagen " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  Principal boton_regreso = new Principal();
        boton_regreso.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField area;
    private javax.swing.JTextField buscartodo;
    private javax.swing.JTextField fecha_in;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField humedad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sensor;
    private javax.swing.JTable t;
    private javax.swing.JTextField temperatura;
    // End of variables declaration//GEN-END:variables
public void limpiar(){
area.setText("");
//planta.setText("");
sensor.setText("");
fecha_in.setText("");
hora.setText("");
temperatura.setText("");
humedad.setText("");
}
public void bloquear(){
    area.setEnabled(false);
    //planta.setEnabled(false);
    sensor.setEnabled(false);
    fecha_in.setEnabled(false);
    hora.setEnabled(false);
    temperatura.setEnabled(false);
    humedad.setEnabled(false);
}
}
