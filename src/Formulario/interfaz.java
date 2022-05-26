package Formulario;

import Controlador.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMuestra = new javax.swing.JTextField();
        txtProm = new javax.swing.JTextField();
        txtDesviacionEstandar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        cbNivelConfianza = new javax.swing.JComboBox<>();
        lbMuestra = new javax.swing.JLabel();
        lbPromedio = new javax.swing.JLabel();
        lbDesviacionEstandar = new javax.swing.JLabel();
        lbNivelDeConfianza = new javax.swing.JLabel();
        lbAlfa = new javax.swing.JLabel();
        lbZ = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbImage = new javax.swing.JLabel();
        intAGrafico = new javax.swing.JLabel();
        intBgrafico = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        interpretacion = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        conf1 = new javax.swing.JLabel();
        conf2 = new javax.swing.JLabel();
        txts = new javax.swing.JLabel();
        lbformula = new javax.swing.JLabel();
        txts2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbalfa = new javax.swing.JLabel();
        lbubiz = new javax.swing.JLabel();
        lbresulz = new javax.swing.JLabel();
        lbTablaz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso de datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Muestra (n) :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Promedio X̅ :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Desviación estandar:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nivel de Confianza:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Datos");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Muestra (n) :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Promedio X̅ :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Desviación estandar σ :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nivel de Confianza:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Alfa (α):");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Z α/2: ");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        cbNivelConfianza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "50%", "60%", "70%", "80%", "90%", "95%", "98%", "99%" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProm, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCalcular)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbNivelConfianza, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(44, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbPromedio)
                    .addComponent(lbMuestra)
                    .addComponent(lbNivelDeConfianza)
                    .addComponent(lbAlfa)
                    .addComponent(lbZ)
                    .addComponent(lbDesviacionEstandar))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesviacionEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNivelConfianza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbMuestra))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbPromedio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbDesviacionEstandar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbNivelDeConfianza))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbAlfa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbZ))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Gráfico");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 16, 124, -1));

        jButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        jButton2.setText("Reiniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 501, -1, -1));
        jPanel2.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 6, 347, 126));
        jPanel2.add(intAGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 138, 100, 25));
        jPanel2.add(intBgrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 138, 101, 25));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Procedimiento");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 183, 124, -1));

        interpretacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(interpretacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 436, 691, 24));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Confianza");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 183, -1, -1));
        jPanel2.add(conf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 212, 71, 22));
        jPanel2.add(conf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 242, 88, 31));

        txts.setText("paso1");
        jPanel2.add(txts, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 298, 290, 24));
        jPanel2.add(lbformula, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 212, 200, 37));

        txts2.setText("paso2");
        jPanel2.add(txts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Interpretación");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 413, -1, -1));
        jPanel2.add(lbalfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 322, 50, 20));
        jPanel2.add(lbubiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 328, 60, 20));
        jPanel2.add(lbresulz, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 50, 20));
        jPanel2.add(lbTablaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 307, 55));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        int muestra = Integer.parseInt(txtMuestra.getText());
        double promedio = Double.parseDouble(txtProm.getText());
        double DesviacionEstandar = Double.parseDouble(txtDesviacionEstandar.getText());
        int nivelC = cbNivelConfianza.getSelectedIndex();
        int nc = 0;
        double div = 0;

        switch (nivelC) {
            case 1:
            nc = 50;
            div = 0.5;
            break;
            case 2:
            nc = 60;
            div = 0.6;
            break;
            case 3:
            nc = 70;
            div = 0.7;
            break;
            case 4:
            nc = 80;
            div = 0.8;
            break;
            case 5:
            nc = 90;
            div = 0.9;
            break;
            case 6:
            nc = 95;
            div = 0.95;
            break;
            case 7:
            nc = 98;
            div = 0.98;
            break;
            case 8:
            nc = 99;
            div = 0.99;
            break;
        }

        Tabla_z c = new Tabla_z(muestra, promedio, nc, DesviacionEstandar);

        //Dar formato a los numeros
        double inta = c.intervaloA();
        double intb = c.intervaloB();
        double alfa = c.alfa();
        //fin

        //Imprimir valores
        String Mmuestra = String.valueOf(c.getMuestra());
        lbMuestra.setText(Mmuestra);

        String Mpromedio = String.valueOf(c.getPromedio());
        lbPromedio.setText(Mpromedio);

        String MdesviacionE = String.valueOf(c.getDesviacionE());
        lbDesviacionEstandar.setText(MdesviacionE);

        String MnivelC = String.valueOf(c.getnConfianza());
        lbNivelDeConfianza.setText(MnivelC);

        conf1.setText("1 - 𝛼 = "+div);
        conf2.setText("𝛼 = "+alfa);

        lbAlfa.setText(Double.toString(alfa));
        lbubiz.setText(Double.toString(c.ubiTablaZ()));
        lbresulz.setText(Double.toString(c.NumeroZ()));

        String MZ = String.valueOf(c.NumeroZ());
        lbZ.setText(MZ);

        intAGrafico.setText(Double.toString(inta));
        intBgrafico.setText(Double.toString(intb));

        //Imagen
        ImageIcon img1 = new ImageIcon(getClass().getResource("/Imagen/Intervalo.png"));
        //la imagen lo adapta al control de la etiqueta
        Image imgesc = img1.getImage().getScaledInstance(lbImage.getWidth(),
            lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbImage.setIcon(new ImageIcon(imgesc));
        
        //Imagen tabla z
        ImageIcon img3 = new ImageIcon(getClass().getResource("/Imagen/tabla_Z.jpg"));
        //la imagen lo adapta al control de la etiqueta
        Image imgesc3 = img3.getImage().getScaledInstance(lbTablaz.getWidth(),
            lbTablaz.getHeight(), Image.SCALE_SMOOTH);
        lbTablaz.setIcon(new ImageIcon(imgesc3));
        lbalfa.setText(Double.toString(alfa));

        //Procedimiento
        //formula
        ImageIcon img2 = new ImageIcon(getClass().getResource("/Imagen/formula.jpeg"));
        //la imagen lo adapta al control de la etiqueta
        Image imgesc2 = img2.getImage().getScaledInstance(lbformula.getWidth(),
            lbformula.getHeight(), Image.SCALE_SMOOTH);
        lbformula.setIcon(new ImageIcon(imgesc2));
        txts.setText("");
        txts.setText(c.paso1());
        txts2.setText(c.paso2());

        //interpretacion
        interpretacion.setText("Con un " + nc + "% de confianza se puede decir que la variable a analizar esta comprendida entre los valores " + Double.toString(inta) + " y " + Double.toString(intb) + ".");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        txtMuestra.setText("");
        txtProm.setText("");
        txtDesviacionEstandar.setText("");
        interpretacion.setText("");
        intAGrafico.setText("");
        intBgrafico.setText("");
        lbAlfa.setText("");
        lbDesviacionEstandar.setText("");
        lbMuestra.setText("");
        lbNivelDeConfianza.setText("");
        cbNivelConfianza.setSelectedIndex(0);
        lbImage.setIcon(null);
        lbformula.setIcon(null);
        lbTablaz.setIcon(null);
        conf1.setText("");
        conf2.setText("");
        lbPromedio.setText("");
        lbZ.setText("");
        txts.setText("");
        txts2.setText("");
        lbalfa.setText("");
        lbubiz.setText("");
        lbresulz.setText("");
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbNivelConfianza;
    private javax.swing.JLabel conf1;
    private javax.swing.JLabel conf2;
    private javax.swing.JLabel intAGrafico;
    private javax.swing.JLabel intBgrafico;
    private javax.swing.JLabel interpretacion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAlfa;
    private javax.swing.JLabel lbDesviacionEstandar;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbMuestra;
    private javax.swing.JLabel lbNivelDeConfianza;
    private javax.swing.JLabel lbPromedio;
    private javax.swing.JLabel lbTablaz;
    private javax.swing.JLabel lbZ;
    private javax.swing.JLabel lbalfa;
    private javax.swing.JLabel lbformula;
    private javax.swing.JLabel lbresulz;
    private javax.swing.JLabel lbubiz;
    private javax.swing.JTextField txtDesviacionEstandar;
    private javax.swing.JTextField txtMuestra;
    private javax.swing.JTextField txtProm;
    private javax.swing.JLabel txts;
    private javax.swing.JLabel txts2;
    // End of variables declaration//GEN-END:variables
}
