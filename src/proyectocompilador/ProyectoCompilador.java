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
            salida.setText(salida.getText() + " Compilación con éxito. " + "\n");
        } catch (ParseException e) {
            salida.setText(salida.getText() + e.getMessage() + "\n");
        } catch (FileNotFoundException e) {
            salida.setText(salida.getText() + "Error al leer el archivo." + "\n");
        } catch(TokenMgrError e){
            salida.setText(salida.getText() + e.getMessage() + "\n");
        }
    }
    
}
