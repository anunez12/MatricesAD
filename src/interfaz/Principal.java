/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anunez12
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAuto = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 18)); // NOI18N
        jLabel1.setText("Operaciones Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tunga", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Filas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, -1));

        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, -1));

        jLabel3.setFont(new java.awt.Font("Tunga", 2, 14)); // NOI18N
        jLabel3.setText("Columnas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, -1));

        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 150, 100));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Matriz"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(153, 0, 51));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        cmdManual.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdManual.setForeground(new java.awt.Color(0, 102, 153));
        cmdManual.setText("Manual");
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        cmdAuto.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdAuto.setForeground(new java.awt.Color(0, 204, 204));
        cmdAuto.setText("Automatico");
        cmdAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmdOperacion.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdOperacion.setForeground(new java.awt.Color(255, 153, 0));
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 110, -1));

        cmdBorrar.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(153, 0, 153));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        cmdSalir.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 270));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 460, 140));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 460, 140));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cant.Num.Pares ", "Numeros Pares ", "Letra C ", "Diagonal Principal", "Letra H" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 153, 0));
        jPanel4.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 430, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 460, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(756, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
      int numcolumnas,numfilas;                               
      numcolumnas=tblTablaInicial.getColumnCount(); 
      numfilas=tblTablaInicial.getRowCount(); 
      DefaultTableModel tm,tm2;
       txtFilas.setText(""); 
       txtColumnas.setText(""); 
       txtFilas.requestFocusInWindow();  
       cmbOperaciones.setSelectedIndex(0); 
       txtResultado.setText(""); 
       tblTablaInicial.getModel(); 
       
       tm=(DefaultTableModel)tblTablaInicial.getModel(); 
       tm2=(DefaultTableModel)tblTablaResultado.getModel(); 
       
       tm.setRowCount(0); 
       tm.setColumnCount(0); 
       
       tm2.setRowCount(0); 
       tm2.setColumnCount(0);
       /* for (int i = 0; i <numfilas; i++) { 
            
            for (int j = 0; j <numcolumnas; j++) {
              tblTablaInicial.setValueAt("",i,j);
              tblTablaResultado.setValueAt("", i,j);
                
            }
          
            
        }*/
      
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
       int numfilas,numcolumnas; 
       
       DefaultTableModel tm,tm2;
       numfilas=Integer.parseInt(txtFilas.getText()); 
       numcolumnas=Integer.parseInt(txtColumnas.getText());   
       
       tm=(DefaultTableModel)tblTablaInicial.getModel(); 
       tm2=(DefaultTableModel)tblTablaResultado.getModel(); 
       
       tm.setRowCount(numfilas); 
       tm.setColumnCount(numcolumnas); 
       
       tm2.setRowCount(numfilas); 
       tm2.setColumnCount(numcolumnas);
       
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutoActionPerformed
     int numfilas,numcolumnas,n; 
     
     numcolumnas=tblTablaInicial.getColumnCount(); 
     numfilas=tblTablaInicial.getRowCount(); 
     
        for (int i = 0; i<numfilas; i++) {
           
            
        
     
        for (int j = 0; j <numcolumnas; j++) { 
           n=(int)(Math.random()* 50 + 1);
           tblTablaInicial.setValueAt(n, i, j);
            
        } 
        
        } 
    }//GEN-LAST:event_cmdAutoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
       int operacion,numfilas,numcolumnas,aux,cont=0; 
       
       operacion=cmbOperaciones.getSelectedIndex(); 
       numfilas=tblTablaInicial.getRowCount(); 
       numcolumnas=tblTablaInicial.getColumnCount();
       switch(operacion){ 
           case 0: 
               for (int i = 0; i <numfilas; i++) { 
                   for (int j = 0; j <numcolumnas; j++) { 
                      aux=(int)tblTablaInicial.getValueAt(i,j); 
                      if(aux %2 ==0){ 
                       cont=cont +1;
                       
                      }
                   }
               } 
               txtResultado.setText("La cantidad de numeros pares es: "+cont);
               break; 
                case 1: 
               for (int i = 0; i <numfilas; i++) { 
                   for (int j = 0; j <numcolumnas; j++) { 
                      aux=(int)tblTablaInicial.getValueAt(i,j); 
                      if(aux %2 ==0){ 
                       tblTablaResultado.setValueAt(aux, i,j);
                   
                                                                                                                       
                   
               
       } 
                   } 
               } 
             break; 
                case 2: 
               for (int i = 0; i <numfilas; i++) { 
                   for (int j = 0; j <numcolumnas; j++) { 
                      aux=(int)tblTablaInicial.getValueAt(i,j); 
                      if(i ==0 || i==numfilas-1 || j==0){ 
                       tblTablaResultado.setValueAt(aux, i,j);
       } 
                   } 
               } 
              break; 
                case 3: 
                for (int i = 0; i <numfilas; i++) { 
                   for (int j = 0; j <numcolumnas; j++) { 
                      aux=(int)tblTablaInicial.getValueAt(i,j); 
                      if(i==j){ 
                       tblTablaResultado.setValueAt(aux, i,j);
       } 
                   } 
                } 
              break; 
                case 4: 
                  for (int i = 0; i <numfilas; i++) { 
                   for (int j = 0; j <numcolumnas; j++) { 
                      aux=(int)tblTablaInicial.getValueAt(i,j); 
                      if(j==0 || j==numcolumnas-1 || i==(numfilas-1)/2){ 
                       tblTablaResultado.setValueAt(aux, i,j);
                    
                    
       } 
                   } 
                  } 
               break;
       } 
       
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        char c=evt.getKeyChar(); 
       if(Character.isLetter(c)||Character.isSpaceChar(c)||!Character.isDigit(c)){ 
         getToolkit(); 
        evt.consume();
       }
    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        char c=evt.getKeyChar(); 
       if(Character.isLetter(c)||Character.isSpaceChar(c)||!Character.isDigit(c)){ 
         getToolkit(); 
        evt.consume();      
       }         
    }//GEN-LAST:event_txtColumnasKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdAuto;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}




