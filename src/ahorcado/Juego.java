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
public class Juego {
    public int Vidas;
    public int aciertos;
    public char letra;
    public char[] respuesta;
    public String palabra;
    public boolean correcto;
    
    public Juego()
    {
    }
    
    public String escogerPalabra()
    {
        return "";
    }
    
    public void resp()
    {
        respuesta= new char[palabra.length()];
        for(int i=0;i<palabra.length();i++)
        {
            respuesta[i]='_';
        }
    }
    
    public void verificar()
    {
        for(int i=0;i<palabra.length();i++)
        {
            if(letra==palabra.charAt(i))
            {
                respuesta[i]=letra;
                correcto=true;
                aciertos++;
            }
        }
    }

    public int getVidas() {
        return Vidas;
    }

    public void setVidas(int Vidas) {
        this.Vidas = Vidas;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(char[] respuesta) {
        this.respuesta = respuesta;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
    
}
