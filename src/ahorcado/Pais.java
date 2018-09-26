/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * 
 */
public class Pais extends Juego {
    public String pais[]={"MEXICO","OAXACA","BRASIL","EUA","COLOMBIA","PERU","CHINA","JAPON","ITALIA","ALEMANIA",
        "PORTUGAL","EGIPTO","SUECIA","INDIA","ARGENTINA","CHILE","AUSTRALIA","FRANCIA","BELGICA","BOLIVIA","CANADA",
        "CUBA","FILIPINAS","GRECIA","IRLANDAPOLONIA","AUSTRIA","BAHAMAS","ANGOLA","BELICE","BULGARIA","CAMERUN",
        "CROACIA","DINAMARCA","ECUADOR","ESLOVAQUIA","ETIOPIA","FINLANDIA","GRANADA","GUATEMALA","HAITI","HONDURAS",
        "HUNGRIA","INDONESIA","IRAK","IRAN","ISLANDIA","ISRAEL","JAMAICA","JAPON","KENIA","LIBERIA","LUXEMBURGO",
        "MADAGASCAR","MALASIA","MARRUECOS","MONACO","NICARAGUA","NIGRIA","NORUEGA","PANAMA","PARAGUAY","RUSIA",
        "SIRIA","SUECIA","SUIZA", "TAILANDIA","TURQUIA","UCRANIA","URUGUAY","VENEZUELA"};
    
    public Pais(){
     
    }
    
    public String escogerPalabra()
    {
        int n=(int) (Math.random() * 70);
        return pais[n];
    }
    
    public boolean checar(String[] palabraEscogida, String letra)
    {
        boolean g=false;
        String p= this.escogerPalabra();
        
        for(int i=0;i<p.length();i++)
        {
            if(p=="a")
            {
                g=true;
            }
        }
        
        return g;
    }

   
}
