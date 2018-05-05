package main;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Data;
import model.Dia_semana;
import model.Hilo_comprobar;
import model.Serie;

public class App extends javax.swing.JFrame {
    private Data d;
    private List<Dia_semana> listaDias;
    
    public App() {
        initComponents();
        
        try {
            d = new Data();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        init();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_agregar_recordatorio = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreSerie = new javax.swing.JTextField();
        btn_agregar_serie = new javax.swing.JButton();
        cbo_dia_emision = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        ventana_administrar_recordatorios = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btn_agregar_recordatorio = new javax.swing.JButton();
        btn_administrar_recordatorios = new javax.swing.JButton();

        ventana_agregar_recordatorio.setResizable(false);
        ventana_agregar_recordatorio.setSize(new java.awt.Dimension(268, 211));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Recordatorio"));
        jPanel2.setName(""); // NOI18N

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dia emisión:");

        btn_agregar_serie.setText("Agregar");
        btn_agregar_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_serieActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar_serie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreSerie))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_dia_emision, 0, 149, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_dia_emision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar_serie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventana_agregar_recordatorioLayout = new javax.swing.GroupLayout(ventana_agregar_recordatorio.getContentPane());
        ventana_agregar_recordatorio.getContentPane().setLayout(ventana_agregar_recordatorioLayout);
        ventana_agregar_recordatorioLayout.setHorizontalGroup(
            ventana_agregar_recordatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_agregar_recordatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventana_agregar_recordatorioLayout.setVerticalGroup(
            ventana_agregar_recordatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_agregar_recordatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventana_administrar_recordatoriosLayout = new javax.swing.GroupLayout(ventana_administrar_recordatorios.getContentPane());
        ventana_administrar_recordatorios.getContentPane().setLayout(ventana_administrar_recordatoriosLayout);
        ventana_administrar_recordatoriosLayout.setHorizontalGroup(
            ventana_administrar_recordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ventana_administrar_recordatoriosLayout.setVerticalGroup(
            ventana_administrar_recordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notificator V.0.1");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_agregar_recordatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregar.png"))); // NOI18N
        btn_agregar_recordatorio.setText("Agregar Recordatorio");
        btn_agregar_recordatorio.setToolTipText("");
        btn_agregar_recordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_recordatorioActionPerformed(evt);
            }
        });

        btn_administrar_recordatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/administrar.png"))); // NOI18N
        btn_administrar_recordatorios.setText("Administrar Recordatorios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_administrar_recordatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_administrar_recordatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_recordatorioActionPerformed
        this.setVisible(false);
        ventana_agregar_recordatorio.setVisible(true);
    }//GEN-LAST:event_btn_agregar_recordatorioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(true);
        ventana_agregar_recordatorio.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_agregar_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_serieActionPerformed
        String nombreSerie;
        int diaCapitulo;
        
        nombreSerie = txtNombreSerie.getText();
        diaCapitulo = cbo_dia_emision.getSelectedIndex() + 1;
        
        Serie nueva = new Serie();
        
        nueva.setNombre(nombreSerie);
        nueva.setDia_capitulo(diaCapitulo);
        
        try {
            d.ingresarSerie(nueva);
            txtNombreSerie.setText(null);
            JOptionPane.showMessageDialog(this, "Se agregó la serie exitosamente!", "Serie agregada!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_agregar_serieActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_administrar_recordatorios;
    private javax.swing.JButton btn_agregar_recordatorio;
    private javax.swing.JButton btn_agregar_serie;
    private javax.swing.JComboBox cbo_dia_emision;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNombreSerie;
    private javax.swing.JFrame ventana_administrar_recordatorios;
    private javax.swing.JFrame ventana_agregar_recordatorio;
    // End of variables declaration//GEN-END:variables

    private void init() {
        try {
            Hilo_comprobar h = new Hilo_comprobar();
            h.start();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            listaDias = d.getDiasSemana();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (Dia_semana dia : listaDias) {
            cbo_dia_emision.addItem(dia);
        }
        this.setLocationRelativeTo(null);
        ventana_agregar_recordatorio.setLocationRelativeTo(null);
    }
}
