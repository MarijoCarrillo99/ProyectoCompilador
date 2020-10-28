/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
@author Team theChulis
*/
package proyectocompilador;
import comp.compilador;
import comp.ParseException;
import comp.TokenMgrError;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
public class ProyectoCompilador {

   
    public void compilar(JTextArea salida, String ruta) {
         try {
            compilador sintaxis = new compilador(new BufferedReader(new FileReader(ruta)));
            sintaxis.Principal();
            salida.setText(salida.getText() + " Compilación con éxito " + "\n");
        } catch (ParseException e) {
            salida.setText(salida.getText() + e.getMessage() + "\n");
        } catch (FileNotFoundException e) {
            salida.setText(salida.getText() + "Error al leer el archivo." + "\n");
        } catch(TokenMgrError e){
            salida.setText(salida.getText() + e.getMessage() + "\n");
        }
    }
    
}
