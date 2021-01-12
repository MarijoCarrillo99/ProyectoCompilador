

package proyectocompilador;

import javax.swing.JTextArea;


/*
@authors Team LasChulis
MARÍA JOSÉ CARRILLO NÚÑEZ
OCIELA CELESTE CAUSOR SANTAMARÍA 
VERÓNICA GUADALUPE MARTÍNEZ MORA
JESSICA IBET PÉREZ CORTÉZ
*/

public class Analizar {
    public String RecibirTexto= "";
    public String RecibirDireccion= "";
    
    String[] guardarString; //arreglos
    String[] guardarInt;
    String[] guardarFloat;
    String[] guardarChar;
    String[] guardarBoolean;
    
  JTextArea Imprimir;
  
  public Analizar(JTextArea Imprimir, String RecibirTexto, String RecibirDireccion)
  {
      this.Imprimir=Imprimir;
      RecibirTexto=RecibirTexto;
      RecibirDireccion=RecibirDireccion;
      
      String[] revisarTexto=RecibirTexto.split("\\s");
      
     EncontrarDeclaraciones(revisarTexto);
     IdentificarImpresiones(revisarTexto);
  }

    private void EncontrarDeclaraciones(String[] Texto) {
        int indice=0, inicio=0, fin=0;
        boolean fInt=false, fString=false, fChar=false, fFloat=false, fBoolean=false;
        String enteros="", cadenas="", letra="", flotante="", booleanos="";
        
        while(indice<Texto.length){
            if(Texto[indice].equals("int")){
                inicio=indice+1;
                fInt=true;
            }
            else if(Texto[indice].equals("float")){
                inicio=indice+1;
                fFloat=true;
            }
            else if(Texto[indice].equals("String")){
                inicio=indice+1;
                fString=true;
            }
            else if(Texto[indice].equals("boolean")){
                inicio=indice+1;
                fBoolean=true;
            }
            else if(Texto[indice].equals("char")){
                inicio=indice+1;
                fChar=true;
            }
    /////////////////////////////////////////////////////////////
            if(fInt==true && Texto[indice].equals(":")){
               fin=indice;
               
               for(int i=inicio; i<=fin; i++){
                   enteros=enteros+Texto[i];
               }
               fInt=false;
            }
            else if(fString==true && Texto[indice].equals(":")){
               fin=indice;
               
               for(int e=inicio; e<=fin; e++){
                   cadenas=cadenas+Texto[e];
               }
               fString=false;
            }
           else if(fChar==true && Texto[indice].equals(":")){
               fin=indice;
               
               for(int a=inicio; a<=fin; a++){
                   letra=letra+Texto[a];
               }
               fChar=false;
            }
           else if(fFloat==true && Texto[indice].equals(":")){
               fin=indice;
               
               for(int o=inicio; o<=fin; o++){
                   flotante=flotante+Texto[o];
               }
               fFloat=false;
            }
           else if(fBoolean==true && Texto[indice].equals(":")){
               fin=indice;
               
               for(int u=inicio; u<=fin; u++){
                   booleanos=booleanos+Texto[u];
               }
               fBoolean=false;
            }
          indice++;  
        }
        guardarInt=enteros.split(",|:|=");
        guardarString=cadenas.split(",|:|=");
        guardarChar=letra.split(",|:|=");
        guardarBoolean=booleanos.split(",|:|=");
        guardarFloat=flotante.split(",|:|="); 
    }
    public void IdentificarImpresiones(String[] Texto){
     int inicio=0, fin=0, indice=0;
     boolean banderaInt=false, banderaString=false, banderaChar=false, banderaFloat=false, banderaBoolean=false;
     String impresionesInt="", impresionesString="", impresionesChar="", impresionesBoolean="", impresionesFloat="";
     
     while(indice<Texto.length){
       if(Texto[indice].equals("PrintInt")){
        inicio=indice;
        banderaInt=true;
        
       }
       else if(Texto[indice].equals("PrintString")){
        inicio=indice;
        banderaString=true;
       }
       else if(Texto[indice].equals("PrintChar")){
        inicio=indice;
        banderaChar=true;
       }
       else if(Texto[indice].equals("PrintBoolean")){
        inicio=indice;
        banderaBoolean=true;
       }
       else if(Texto[indice].equals("PrintFloat")){
        inicio=indice;
        banderaFloat=true;
       }
       ///////////////////////////////
       if(banderaInt==true && Texto[indice].equals(":")){
         fin=indice;
         for(int e=inicio; e<fin; e++){
           impresionesInt=impresionesInt+Texto[e];
         }
         banderaInt=false;
       }
       if(banderaString==true && Texto[indice].equals(":")){
         fin=indice;
         for(int e=inicio; e<fin; e++){
           impresionesString=impresionesString+Texto[e];
         }
         banderaString=false;
       }
       if(banderaFloat==true && Texto[indice].equals(":")){
         fin=indice;
         for(int e=inicio; e<fin; e++){
           impresionesFloat=impresionesFloat+Texto[e];
         }
         banderaFloat=false;
       }
       if(banderaChar==true && Texto[indice].equals(":")){
         fin=indice;
         for(int e=inicio; e<fin; e++){
           impresionesChar=impresionesChar+Texto[e];
         }
         banderaChar=false;
       }
       if(banderaBoolean==true && Texto[indice].equals(":")){
         fin=indice;
         for(int e=inicio; e<fin; e++){
           impresionesBoolean=impresionesBoolean+Texto[e];
         }
         banderaBoolean=false;
       }
       indice++;       
       }
      String[] impriInt=impresionesInt.split("PrintInt");
      String[] impriBoolean=impresionesBoolean.split("PrintBoolean");
      String[] impriChar=impresionesChar.split("PrintChar");
      String[] impriFloat=impresionesFloat.split("PrintFloat");
      String[] impriString=impresionesString.split("PrintString");
      IdentificarValor(impriInt, impriBoolean, impriChar, impriFloat, impriString);
       }
    public void IdentificarValor(String[] impriInt, String[] impriBoolean, String[] impriChar, String[] impriFloat, String[] impriString){
       for(int i=0; i<impriInt.length; i++){
           for(int e=0; e<guardarInt.length; e++){
               if(impriInt[i].equals(guardarInt[e])){
                 String contenidoConsola=guardarInt[e+1]+"\n";
                 Imprimir.append(contenidoConsola);
               }
           }
       } 
    }
 }
    

