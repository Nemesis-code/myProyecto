
package com.umg.proyectofisica;

import javax.swing.JOptionPane;


public class Calculadora extends javax.swing.JFrame {

   
    public Calculadora() {
        initComponents();
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Longitud", "Masa", "Tiempo"}));
        actualizarMedidas(); //Se llama para llenar las opciones al inicio
        cbCategoria.addActionListener(e -> actualizarMedidas()); //Se actualizan las opciones al cambiar la categoría
        

    }
    
    private double convertirLongitud(double valor, String desde, String hasta){
        double metros = 0;
        
        switch (desde){
            case "Metros": metros = valor; break;
            case "Kilometros": metros = valor * 1000; break;
            case "Millas": metros = valor * 1609.34; break;
            case "Pies": metros = valor * 0.3048; break;
            case "Centimetros": metros = valor * 0.01; break;
            case "Pulgadas": metros = valor * 0.0254; break;
        }
        
        switch (hasta){
            case "Metros": return metros;
            case "Kilometros": return metros / 1000;
            case "Millas": return metros / 1609.34;
            case "Pies": return metros / 0.3048; 
            case "Centimetros": return metros / 0.01;
            case "Pulgadas": return metros / 0.0254;
        
        }
        
        return 0;
    
    }
    private double convertirMasa(double valor, String desde, String hasta){
        double kilogramos = 0;

        // Convertir desde la unidad seleccionada a kilogramos
        switch (desde) {
            case "Kilogramo": kilogramos = valor; break;
            case "Gramo": kilogramos = valor / 1000; break;
            case "Libra": kilogramos = valor / 2.20462; break;
            case "Onzas": kilogramos = valor / 35.274; break;
        }

        // Convertir de kilogramos a la unidad deseada
        switch (hasta) {
            case "Kilogramo": return kilogramos;
            case "Gramo": return kilogramos * 1000;
            case "Libra": return kilogramos * 2.20462;
            case "Onzas": return kilogramos * 35.274;
        }

        return 0; // Si hay un error, devuelve 0
    }
    private double convertirTiempo(double valor, String desde, String hasta){
        double segundos = 0;

        // Convertir desde la unidad seleccionada a segundos
        switch (desde) {
            case "Segundos": segundos = valor; break;
            case "Minutos": segundos = valor * 60; break;
            case "Horas": segundos = valor * 3600; break;
            case "Dias": segundos = valor * 86400; break;
            case "Anios": segundos = valor * 31536000; break;
        }

        // Convertir de segundos a la unidad deseada
        switch (hasta) {
            case "Segundos": return segundos;
            case "Minutos": return segundos / 60;
            case "Horas": return segundos / 3600;
            case "Dias": return segundos / 86400;
            case "Anios": return segundos / 31536000;
        }

        return 0; // Si hay un error, devuelve 0
    }
    private void actualizarMedidas() {
        String seleccion = cbCategoria.getSelectedItem().toString();
        cbDesde.removeAllItems();
        cbHasta.removeAllItems();

        String[] medidas;
        if (seleccion.equals("Longitud")) {
            medidas = new String[]{"Metros", "Kilometros", "Millas", "Pies", "Centimetros", "Pulgadas"};
        } else if (seleccion.equals("Masa")) {
            medidas = new String[]{"Kilogramo", "Gramo", "Libra", "Onzas"};
        } else {
            medidas = new String[]{"Segundos", "Minutos", "Horas", "Dias", "Anios"};
        }

        for (String medida : medidas) {
            cbDesde.addItem(medida);
            cbHasta.addItem(medida);
        }
    }




    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbDesde = new javax.swing.JComboBox<>();
        cbHasta = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbDesde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbHasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Seleccione la conversión de Longitud, Masa o Tiempo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConvertir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
        try{
            double valor = Double.parseDouble(txtValor.getText());
            String desde = cbDesde.getSelectedItem().toString();
            String hasta = cbHasta.getSelectedItem().toString();
            String categoria = cbCategoria.getSelectedItem().toString();
            double resultado = 0;
            if (categoria.equals("Longitud")) {
                resultado = convertirLongitud(valor, desde, hasta);
            } else if (categoria.equals("Masa")) {
                resultado = convertirMasa(valor, desde, hasta);
            } else if (categoria.equals("Tiempo")) {
                resultado = convertirTiempo(valor, desde, hasta);
            }

            txtResultado.setText(String.format("%.4f", resultado));

        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido");
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

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
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbDesde;
    private javax.swing.JComboBox<String> cbHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
