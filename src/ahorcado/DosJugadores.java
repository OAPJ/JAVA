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
public class DosJugadores extends Juego{
    public String p, p2;
    public DosJugadores()
    {
        respuesta=null;
    }
    
    public void resp1()
    {
        respuesta= new char[p.length()];
        Vidas=0;
        for(int i=0;i<p.length();i++)
        {
            respuesta[i]='_';
        }
    }
    
    public void resp2()
    {
        respuesta= new char[p2.length()];
        Vidas=0;
        for(int i=0;i<p2.length();i++)
        {
            respuesta[i]='_';
        }
    }
    
    public void verificar(char l)
    {
        
        for(int i=0;i<p.length();i++)
        {
            if(l==p.charAt(i))
            {
                respuesta[i]=l;
                correcto=true;
                aciertos++;
            }
        }
        
    }
    
    public void verificar2()
    {
        for(int i=0;i<p2.length();i++)
        {
            if(letra==p2.charAt(i))
            {
                respuesta[i]=letra;
                correcto=true;
                aciertos++;
            }
        }
    }
    
    public String evaluarPalabra(String pa)
    {
        String e="";
        char le;
        int nu;
        pa.trim();
        pa=pa.toUpperCase();
        for(int i=0;i<pa.length();i++)
        {
            nu=pa.charAt(i);
            if(nu>=65 && nu<=90)
            {
                le=(char)nu;
                e+=""+le;
            }
        }
        return e;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
