/*
 * INSTITUTO TECNOLÓGICO SUPERIOR DE APATZINGÁN
 *          ANALIZADOR SINTÁCTICO
 */

/*
@authors Team LasChulis
MARÍA JOSÉ CARRILLO NÚÑEZ
OCIELA CELESTE CAUSOR SANTAMARÍA 
VERÓNICA GUADALUPE MARTÍNEZ MORA
JESSICA IBET PÉREZ CORTÉZ
*/

package proyectocompilador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Ventaniux extends javax.swing.JFrame {

    
    public Ventaniux() {
        initComponents();
        txtArchivoSeleccionado.setVisible(false);
    }
    public String rutaArchivo="";
    public String SalidaCodig="";
    public String SalidaToken="";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        abrir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SalidaConsola = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RunPrueba = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SalidaTokens = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        txtArchivoSeleccionado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalidaCodigo = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTANIUX \"LAS CHULIS\"");

        abrir.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        abrir.setForeground(new java.awt.Color(102, 0, 102));
        abrir.setText("SELECCIONA UN ARCHIVO");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        SalidaConsola.setEditable(false);
        SalidaConsola.setColumns(20);
        SalidaConsola.setRows(5);
        jScrollPane2.setViewportView(SalidaConsola);

        jLabel2.setBackground(new java.awt.Color(102, 0, 102));
        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOKENS:");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONSOLA:");

        RunPrueba.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        RunPrueba.setText("PÚLSAME, SIN MIEDO AL ÉXITO");
        RunPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunPruebaActionPerformed(evt);
            }
        });

        SalidaTokens.setEditable(false);
        SalidaTokens.setColumns(20);
        SalidaTokens.setRows(5);
        jScrollPane3.setViewportView(SalidaTokens);

        jButton2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton2.setText("LIMPIA, ASÍ COMO TU CONCIENCIA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtArchivoSeleccionado.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        txtArchivoSeleccionado.setForeground(new java.awt.Color(255, 255, 255));
        txtArchivoSeleccionado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtArchivoSeleccionado.setText("...");

        SalidaCodigo.setEditable(false);
        SalidaCodigo.setColumns(20);
        SalidaCodigo.setRows(5);
        jScrollPane1.setViewportView(SalidaCodigo);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CÓDIGO:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ANALIZADOR SINTÁCTICO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RunPrueba)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtArchivoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(abrir)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addComponent(abrir)
                .addGap(18, 18, 18)
                .addComponent(txtArchivoSeleccionado)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(RunPrueba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        Scanner analiza = null, analiza2 = null;
  
        try {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        txtArchivoSeleccionado.setVisible(true);
        txtArchivoSeleccionado.setText("Archivo seleccionado: " + fileChooser.getSelectedFile().getName());
        rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath(); 
        File f = new File(rutaArchivo);       
        analiza = new Scanner(f);
        analiza2 = new Scanner(f);
        while (analiza.hasNext()) {
            SalidaToken += analiza.nextLine() + " ";
            
        }
        while (analiza2.hasNext()) {
            SalidaCodig += analiza2.nextLine() + "\n";
        }
              
           } 
           catch (FileNotFoundException e) {
               SalidaConsola.setText(SalidaConsola.getText() + "\n" + e.getMessage());
           } 
           catch (NullPointerException e) {
               SalidaConsola.setText(SalidaConsola.getText() + "\n" +  "No se seleccionó el archivo.");
           } 
           catch (Exception e) {
               SalidaConsola.setText(SalidaConsola.getText() + "\n" + e.getMessage());
           } 
                             
           SalidaCodigo.setText(SalidaCodig);
           if (analiza != null && analiza2 != null) {analiza.close(); 
           analiza2.close();}
    }//GEN-LAST:event_abrirActionPerformed

    private void RunPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunPruebaActionPerformed
                StringTokenizer Tokens = new StringTokenizer(SalidaToken);
		int i=0;
                while(Tokens.hasMoreTokens())
                {
                    EjecutaSalidaTokens(Tokens.nextToken());
                    i++;
                }
                new ProyectoCompilador().compilar(SalidaConsola, rutaArchivo);
                new Analizar(SalidaConsola, SalidaCodig, "");
               
    }//GEN-LAST:event_RunPruebaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SalidaTokens.setText("");
        SalidaConsola.setText("");
        SalidaCodigo.setText("");
        txtArchivoSeleccionado.setText("");
        rutaArchivo="";
    SalidaCodig="";
    SalidaToken="";
    }//GEN-LAST:event_jButton2ActionPerformed

    public void EjecutaSalidaTokens(String Token){
        Pattern PReservada = Pattern.compile("import|package|class|static|void|main|return|new|null|extense|throw|throws" +
			"|break|continue|default|implements|super|this|super|abstract|interface|synchronized");
		Pattern PTipoAcceso=Pattern.compile("public|private|protected|finally");
		Pattern TCiclos =Pattern.compile("for|do|while|foreach");
		Pattern TCondiciones = Pattern.compile("if|else|ifelse|switch|case");
		Pattern TOperadoresLogicos = Pattern.compile(">|<|>=|<=|!=|==|&&");
		Pattern	TOperadorAritmeticos = Pattern.compile("\\+|\\-|\\/|\\%|\\*|\\++|\\--|\\^");
		Pattern TiposDatos = Pattern.compile("int|short|long|byte|double|float|String|chart|boolean");
		Pattern TBoleanos = Pattern.compile("true|false");
		Pattern TErrorsillos = Pattern.compile("try|catch");
                Pattern Numeritos = Pattern.compile("[0-9]* . [0-9]*");
		
		Pattern LLaveIni = Pattern.compile("\\{");
		Pattern LLaveFin = Pattern.compile("\\}");
		
		Pattern SignoIgual = Pattern.compile("\\=");
		Pattern TPuntoComa = Pattern.compile("\\;");
                Pattern DosPuntos = Pattern.compile("\\:");
		Pattern TComma = Pattern.compile("\\,");
		
		Pattern PARENIzq = Pattern.compile("\\(");
		Pattern PARENDer = Pattern.compile("\\)");
		
		Pattern CorcheIzq = Pattern.compile("\\[");
		Pattern CorcheDer = Pattern.compile("\\]");
		
		Pattern Comillas = Pattern.compile("\"");
		Pattern Comilla = Pattern.compile("\\'");
		
		Pattern PIdentificador = Pattern.compile("([a-zA-Z|_]+([0-9]|[a-zA-Z]|_)*)+"); 
		Pattern TNumber = Pattern.compile("[0-9]*");  
//***fin de los tokens***//
		
//***Comenzamos a marcar los tokens***//
		Matcher MatPR = PReservada.matcher(Token);
		Matcher MaTipoAcceso = PTipoAcceso.matcher(Token);
		Matcher MaCiclos = TCiclos.matcher(Token);
		Matcher MaCondiciones = TCondiciones.matcher(Token);
		Matcher MaOperadoresLogicos = TOperadoresLogicos.matcher(Token);
		Matcher MaOperadorAritmeticos = TOperadorAritmeticos.matcher(Token);
		Matcher MaTiposDatos = TiposDatos.matcher(Token);
		Matcher MaBoleanos = TBoleanos.matcher(Token);
		Matcher MaErrorsillos = TErrorsillos.matcher(Token);
		Matcher YaveIni = LLaveIni.matcher(Token);
		Matcher YaveFin = LLaveFin.matcher(Token);
		Matcher VarIdent = PIdentificador.matcher(Token);
                Matcher MaDosPuntos = DosPuntos.matcher(Token);
		Matcher MaSignoIgual = SignoIgual.matcher(Token);
		Matcher MaPuntoComa = TPuntoComa.matcher(Token);
		Matcher MaComma = TComma.matcher(Token);
		Matcher MaPARENIzq = PARENIzq.matcher(Token);
		Matcher MaPARENDer = PARENDer.matcher(Token);
		Matcher MaCorcheIzq  = CorcheIzq.matcher(Token);
		Matcher MaCorcheDer = CorcheDer.matcher(Token);
		Matcher MaNumber = TNumber.matcher(Token);
		Matcher MaComillas = Comillas.matcher(Token);
		Matcher MaComilla = Comilla.matcher(Token);
		Matcher MaNumeritos = Numeritos.matcher(Token);
		
                if(MatPR.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Palabra reservada " +  " - " + MatPR.group().toString() + "\n");
                }
		else if(MaTipoAcceso.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Tipo de acceso " +  " - " + MaTipoAcceso.group().toString() + "\n");
                }
			
		else if(MaCondiciones.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + " Sentencia de control " +  " - " + MaCondiciones.group().toString() + "\n");
                }
		
		else if(MaOperadoresLogicos.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Operador lógico " +  " - " + MaOperadoresLogicos.group().toString() + "\n");
                }
		
		else if(MaOperadorAritmeticos.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Operador aritmético " +  " - " + MaOperadorAritmeticos.group().toString() + "\n");
                }
		
		else if(MaTiposDatos.find()){
                     SalidaTokens.setText(SalidaTokens.getText().toString() + " Tipo de dato " +  " - " + MaTiposDatos.group().toString() + "\n");
                }
		
		else if(MaBoleanos.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Valor booleano " +  " - " + MaBoleanos.group().toString() + "\n");
                }
		
		else if(MaErrorsillos.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Errores " +  " - " + MaErrorsillos.group().toString() + "\n");
                }
			
		else if(MaSignoIgual.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Token de asignar " +  " - " + MaSignoIgual.group().toString() + "\n");
                }
			
		else if(MaPuntoComa.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Token de punto y coma " +  " - " + MaPuntoComa.group().toString() + "\n");
                }
		
		else if(MaComma.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Token de separación " +  " - " + MaComma.group().toString() + "\n");
                }
		
		else if(MaPARENIzq.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Paréntesis izquierdo " + " - " + MaPARENIzq.group().toString() + "\n");
                }
			
		else if(MaPARENDer.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Paréntesis derecho " + " - " + MaPARENDer.group().toString() + "\n");
                }
		
		else if(MaCorcheIzq.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Corchete izquierdo " + " - " + MaCorcheIzq.group().toString() + "\n");
                }
		
		else if(MaCorcheDer.find()){
                    	SalidaTokens.setText(SalidaTokens.getText().toString() + " Corcherte derecho " + " - " + MaCorcheDer.group().toString() + "\n");
                }
		
		else if(YaveIni.find()){
                    SalidaTokens.setText(SalidaTokens.getText().toString() + " Llave izquierda " + " - " + YaveIni.group().toString() + "\n");                      
                }
		  
		else if(YaveFin.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + " Llave derecha " + " - " + YaveFin.group().toString() + "\n");
                }
		  
		else if(VarIdent.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + " Identificador " + " - " + VarIdent.group().toString() + "\n");
                }
		
                else if(MaDosPuntos.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + " Finalizador " + " - " + MaDosPuntos.group().toString() + "\n");
                }
                
		else if(MaNumber.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + " Número entero " + " - " + MaNumber.group().toString() + "\n");
                }
                else if(MaNumeritos.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + " Números flotantes" + " - " + MaNumeritos.group().toString() + "\n");
                }
                else if(MaComillas.find()){
                        SalidaTokens.setText(SalidaTokens.getText().toString() + "Comillas" + " - " + MaComillas.group().toString() + "\n");
                }
    }
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
            java.util.logging.Logger.getLogger(Ventaniux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventaniux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventaniux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventaniux.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventaniux().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RunPrueba;
    private javax.swing.JTextArea SalidaCodigo;
    private javax.swing.JTextArea SalidaConsola;
    private javax.swing.JTextArea SalidaTokens;
    private javax.swing.JButton abrir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel txtArchivoSeleccionado;
    // End of variables declaration//GEN-END:variables
}
