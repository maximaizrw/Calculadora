
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxim
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        precioSteamBox = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mercadopago_png2 = new javax.swing.JLabel();
        totalValenMpBox = new javax.swing.JTextField();
        mercadopago_png = new javax.swing.JLabel();
        Mercadolibre_png = new javax.swing.JLabel();
        Mercadolibre_png1 = new javax.swing.JLabel();
        totalValenMlBox = new javax.swing.JTextField();
        totalMaxiMlBox = new javax.swing.JTextField();
        totalMaxiMpBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setName("asd"); // NOI18N

        jpanel.setBackground(new java.awt.Color(255, 255, 255));
        jpanel.setForeground(new java.awt.Color(255, 255, 255));
        jpanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MAXI");
        jLabel1.setToolTipText("");
        jpanel.add(jLabel1);
        jLabel1.setBounds(310, 220, 70, 20);

        precioSteamBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioSteamBoxActionPerformed(evt);
            }
        });
        precioSteamBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioSteamBoxKeyPressed(evt);
            }
        });
        jpanel.add(precioSteamBox);
        precioSteamBox.setBounds(230, 80, 80, 29);

        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        botonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonAceptarKeyPressed(evt);
            }
        });
        jpanel.add(botonAceptar);
        botonAceptar.setBounds(220, 120, 100, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inserte precio del juego");
        jLabel2.setToolTipText("");
        jpanel.add(jLabel2);
        jLabel2.setBounds(160, 50, 230, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("VALEN");
        jLabel3.setToolTipText("");
        jpanel.add(jLabel3);
        jLabel3.setBounds(30, 220, 70, 20);

        mercadopago_png2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercado-pago copia.png"))); // NOI18N
        mercadopago_png2.setText("jLabel5");
        jpanel.add(mercadopago_png2);
        mercadopago_png2.setBounds(300, 250, 100, 50);

        totalValenMpBox.setEditable(false);
        totalValenMpBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalValenMpBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalValenMpBoxActionPerformed(evt);
            }
        });
        jpanel.add(totalValenMpBox);
        totalValenMpBox.setBounds(130, 260, 80, 30);

        mercadopago_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mercado-pago copia.png"))); // NOI18N
        mercadopago_png.setText("jLabel5");
        jpanel.add(mercadopago_png);
        mercadopago_png.setBounds(20, 250, 100, 50);

        Mercadolibre_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1200px-MercadoLibre.png"))); // NOI18N
        Mercadolibre_png.setText("jLabel7");
        jpanel.add(Mercadolibre_png);
        Mercadolibre_png.setBounds(300, 320, 110, 40);

        Mercadolibre_png1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1200px-MercadoLibre.png"))); // NOI18N
        Mercadolibre_png1.setText("jLabel7");
        jpanel.add(Mercadolibre_png1);
        Mercadolibre_png1.setBounds(20, 330, 110, 40);

        totalValenMlBox.setEditable(false);
        totalValenMlBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpanel.add(totalValenMlBox);
        totalValenMlBox.setBounds(130, 340, 80, 30);

        totalMaxiMlBox.setEditable(false);
        totalMaxiMlBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalMaxiMlBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMaxiMlBoxActionPerformed(evt);
            }
        });
        jpanel.add(totalMaxiMlBox);
        totalMaxiMlBox.setBounds(410, 320, 90, 30);

        totalMaxiMpBox.setEditable(false);
        totalMaxiMpBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalMaxiMpBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMaxiMpBoxActionPerformed(evt);
            }
        });
        jpanel.add(totalMaxiMpBox);
        totalMaxiMpBox.setBounds(410, 260, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borde.jpg"))); // NOI18N
        jpanel.add(jLabel4);
        jLabel4.setBounds(0, -10, 540, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        int totalMaxiMl, totalMaxiMp, totalValenMl, totalValenMp;

        totalValenMl = valenMl();
        totalMaxiMl = maxiMl();
        totalValenMp = valenMp();
        totalMaxiMp = maxiMp();
        

        totalValenMlBox.setText(String.valueOf(totalValenMl));
        totalMaxiMlBox.setText(String.valueOf(totalMaxiMl));
        totalValenMpBox.setText(String.valueOf(totalValenMp));
        totalMaxiMpBox.setText(String.valueOf(totalMaxiMp));
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void totalValenMpBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalValenMpBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalValenMpBoxActionPerformed

    private void precioSteamBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioSteamBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioSteamBoxActionPerformed

    private void totalMaxiMlBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMaxiMlBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMaxiMlBoxActionPerformed

    private void totalMaxiMpBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMaxiMpBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMaxiMpBoxActionPerformed

    private void botonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAceptarKeyPressed
      
    }//GEN-LAST:event_botonAceptarKeyPressed

    private void precioSteamBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioSteamBoxKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        int totalMaxiMl, totalMaxiMp, totalValenMl, totalValenMp;

        totalValenMl = valenMl();
        totalMaxiMl = maxiMl();
        totalValenMp = valenMp();
        totalMaxiMp = maxiMp();
        

        totalValenMlBox.setText(String.valueOf(totalValenMl));
        totalMaxiMlBox.setText(String.valueOf(totalMaxiMl));
        totalValenMpBox.setText(String.valueOf(totalValenMp));
        totalMaxiMpBox.setText(String.valueOf(totalMaxiMp));
        }
    }//GEN-LAST:event_precioSteamBoxKeyPressed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mercadolibre_png;
    private javax.swing.JLabel Mercadolibre_png1;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpanel;
    private javax.swing.JLabel mercadopago_png;
    private javax.swing.JLabel mercadopago_png2;
    private javax.swing.JTextField precioSteamBox;
    private javax.swing.JTextField totalMaxiMlBox;
    private javax.swing.JTextField totalMaxiMpBox;
    private javax.swing.JTextField totalValenMlBox;
    private javax.swing.JTextField totalValenMpBox;
    // End of variables declaration//GEN-END:variables

    private int valenMl() {
        int precioSteam, precioSteamDolar, porcentajeGanancia = 0, precioVenta, clasica, ganancia, uno, suma, unidad, porcentajeClasica;
        unidad = 22;
        porcentajeClasica = 11;

        precioSteam = Integer.parseInt(precioSteamBox.getText());

        // Se calcula el precio con el impuesto pais + dolar 65%
        precioSteamDolar = (precioSteam + ((precioSteam * 65) / 100));

        if (precioSteam <= 500) {
            porcentajeGanancia = ((precioSteam * 25) / 100);
        } else if (precioSteam > 500 && precioSteam <= 799) {
            porcentajeGanancia = ((precioSteam * 22) / 100);
        } else if (precioSteam >= 800 && precioSteam <= 1999) {
            porcentajeGanancia = ((precioSteam * 20) / 100);
        } else if (precioSteam > 2000) {
            porcentajeGanancia = ((precioSteam * 10) / 100);
        }

        //*********************************************************
        precioVenta = precioSteamDolar + porcentajeGanancia;
        clasica = ((precioVenta * 13) / 100) + unidad;
        precioVenta += clasica;

        uno = ((precioVenta * porcentajeClasica) / 100) + unidad; //clasica
        ganancia = precioVenta - uno - precioSteamDolar;
        suma = porcentajeGanancia - ganancia;
        precioVenta += suma;

        for (int i = 0; i < 10; i++) {	// REPITO HASTA TENER LA GANANCIA ESPERADA
            if (suma != 0) {

                uno = ((precioVenta * porcentajeClasica) / 100) + unidad; //clasica
                ganancia = precioVenta - uno - precioSteamDolar;
                suma = porcentajeGanancia - ganancia;
                precioVenta += suma;

            }
        }
        return precioVenta;

    }

    private int maxiMl() {
        int precioSteam, precioSteamDolar, porcentajeGanancia = 0, precioVenta, clasica, ganancia, impuesto, impuesto2, uno, dos, tres, suma;
        int unidad = 22;
        int impuestoGanancia = 2;
        int impuestoValorAgregado = 11;
        int porcentajeClasica = 13;

        precioSteam = Integer.parseInt(precioSteamBox.getText());

        // Se calcula el precio con el impuesto pais + dolar 65%
        precioSteamDolar = (precioSteam + ((precioSteam * 65) / 100));

        //**********************************************************
        // Se calcula el porcentaje de la ganancia que espero
        if (precioSteam <= 500) {
            porcentajeGanancia = ((precioSteam * 25) / 100);
        } else if (precioSteam > 500 && precioSteam < 800) {
            porcentajeGanancia = ((precioSteam * 22) / 100);
        } else if (precioSteam > 800 && precioSteam < 1999) {
            porcentajeGanancia = ((precioSteam * 15) / 100);
        } else if (precioSteam >= 2000) {
            porcentajeGanancia = ((precioSteam * 10) / 100);
        }
        //*********************************************************

        precioVenta = precioSteamDolar + porcentajeGanancia;
        clasica = ((precioVenta * porcentajeClasica) / 100) + unidad;
        precioVenta += clasica;
        impuesto = ((precioVenta * impuestoGanancia) / 100);
        precioVenta += impuesto;
        impuesto2 = ((precioVenta * impuestoValorAgregado) / 100);
        precioVenta += impuesto2;

        uno = ((precioVenta * porcentajeClasica) / 100) + unidad; //clasica
        dos = ((precioVenta * 2) / 100); //impuesto
        tres = ((precioVenta * 11) / 100); //impuesto2
        ganancia = precioVenta - uno - dos - tres - precioSteamDolar;
        suma = porcentajeGanancia - ganancia;
        precioVenta += suma;

        for (int i = 0; i < 10; i++) {	// REPITO HASTA TENER LA GANANCIA ESPERADA
            if (suma != 0) {

                uno = ((precioVenta * porcentajeClasica) / 100) + unidad; //clasica
                dos = ((precioVenta * 2) / 100); //impuesto
                tres = ((precioVenta * 11) / 100); //impuesto2
                ganancia = precioVenta - uno - dos - tres - precioSteamDolar;
                suma = porcentajeGanancia - ganancia;
                precioVenta += suma;

            }
        }

        return precioVenta;
    }

    private int valenMp() {
        int precioSteam, precioSteamDolar, porcentajeGanancia=0, precioVenta, clasica, ganancia, uno, suma;
        int unidad = 22;

        precioSteam = Integer.parseInt(precioSteamBox.getText());

        // Se calcula el precio con el impuesto pais + dolar 65%
        precioSteamDolar = (precioSteam + ((precioSteam * 65) / 100));

        //**********************************************************
        // Se calcula el porcentaje de la ganancia que espero
        if (precioSteam <= 500) {
            porcentajeGanancia = ((precioSteam * 25) / 100);
        } else if (precioSteam > 500 && precioSteam < 800) {
            porcentajeGanancia = ((precioSteam * 22) / 100);
        } else if (precioSteam > 800 && precioSteam < 1999) {
            porcentajeGanancia = ((precioSteam * 15) / 100);
        } else if (precioSteam > 2000) {
            porcentajeGanancia = ((precioSteam * 10) / 100);
        }

        //*********************************************************
        precioVenta = precioSteamDolar + porcentajeGanancia;
        clasica = ((precioVenta * 6) / 100) + unidad;
        precioVenta += clasica;
        //ganancia = (precioVenta-clasica)-precioSteamDolar;

        uno = ((precioVenta * 6) / 100) + unidad; //clasica
        ganancia = precioVenta - uno - precioSteamDolar;
        suma = porcentajeGanancia - ganancia;
        precioVenta += suma;

        for (int i = 0; i < 10; i++) {	// REPITO HASTA TENER LA GANANCIA ESPERADA
            if (suma != 0) {

                uno = ((precioVenta * 6) / 100) + unidad; //clasica
                ganancia = precioVenta - uno - precioSteamDolar;
                suma = porcentajeGanancia - ganancia;
                precioVenta += suma;

            }
        }
        return precioVenta;
    }

    private int maxiMp() {
        int precioSteam, precioSteamDolar, porcentajeGanancia = 0, precioVenta, clasica, ganancia, impuesto, impuesto2, uno, dos, tres, suma;
        int unidad = 22;
        int impuestoGanancia = 2;
        int impuestoValorAgregado = 11;
        int porcentajeClasica = 6;

        precioSteam = Integer.parseInt(precioSteamBox.getText());

        // Se calcula el precio con el impuesto pais + dolar 65%
        precioSteamDolar = (precioSteam + ((precioSteam * 65) / 100));

        //**********************************************************
        // Se calcula el porcentaje de la ganancia que espero
        if (precioSteam <= 500) {
            porcentajeGanancia = ((precioSteam * 25) / 100);
        } else if (precioSteam > 500 && precioSteam < 800) {
            porcentajeGanancia = ((precioSteam * 22) / 100);
        } else if (precioSteam > 800 && precioSteam < 1999) {
            porcentajeGanancia = ((precioSteam * 15) / 100);
        } else if (precioSteam >= 2000) {
            porcentajeGanancia = ((precioSteam * 10) / 100);
        }
        //*********************************************************

        precioVenta = precioSteamDolar + porcentajeGanancia;
        clasica = ((precioVenta * porcentajeClasica) / 100) + unidad;
        precioVenta += clasica;
        impuesto = ((precioVenta * impuestoGanancia) / 100);
        precioVenta += impuesto;
        impuesto2 = ((precioVenta * impuestoValorAgregado) / 100);
        precioVenta += impuesto2;

        uno = ((precioVenta * porcentajeClasica) / 100) + unidad; //clasica
        dos = ((precioVenta * 2) / 100); //impuesto
        tres = ((precioVenta * 11) / 100); //impuesto2
        ganancia = precioVenta - uno - dos - tres - precioSteamDolar;
        suma = porcentajeGanancia - ganancia;
        precioVenta += suma;

        for (int i = 0; i < 10; i++) {	// REPITO HASTA TENER LA GANANCIA ESPERADA
            if (suma != 0) {

                uno = ((precioVenta * porcentajeClasica) / 100) + unidad; //clasica
                dos = ((precioVenta * 2) / 100); //impuesto
                tres = ((precioVenta * 11) / 100); //impuesto2
                ganancia = precioVenta - uno - dos - tres - precioSteamDolar;
                suma = porcentajeGanancia - ganancia;
                precioVenta += suma;

            }
        }

        return precioVenta;
    }

}
