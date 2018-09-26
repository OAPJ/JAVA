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
public class Nombre extends Juego{
     String nombre[]={"JUAN","ONDER","RAUL","KARLA","ANTONIO","JESSICA","FERNANDO"
        ,"CARLOS","MIGUEL","VALERIA","ANDREA","JAVIER","PAOLA","DORA","FABIOLA"
        ,"YOLANDA","SANDRA","KARINA","PAULINA","MARIO","SOFIA","CAMILA","VALENTINA"
        ,"ISABELA","DANIELA","MARIANA","SARA","VICTORIA","GABRIELA","XIMENA","MIA"
        ,"MARTINA","LUCIA","SAMANTHA","MARIA","FERNANDA","NICOLE","ALEJANDRA","PAULA"
        ,"EMILY","JOSE","JOE","ANA","MELANI","REGINA","RENATA","EMMA","JUANITA"
        ,"VANESSA","ANTONIA","LAURA","MONSERRAT","PAULIN","ISABEL","ARMANDO","ADRIANA"
        ,"NAOMI","AMANDA","ARIANA","LOLA","ZOE","CAROLINA","JULIIA","KARINA","SANDRA"
        ,"CLAUIDA","ELENA","SANTIAGO","SEBASTIAN","DIEGO","NICOLAS","SAMUEL","DANIEL"
        ,"ANGEL","MATIAS","GABRIEL","TOMAS","MANUEL","JESUS","DAVID","EMILIANO","ANDRES"
        ,"JOAQUIN","ALEXANDER","LUCAS","CARLOS","FELIPE","FRANCISCO","ISAAC","PABLO"
        ,"EDUARDO","ERICK","LUIS","LUISA","KEVIN","AGUSTIN","BRUNO","IVAN","GAEL","THIAGO"
        ,"ESTEFANIA"};
     
    public Nombre(){
        
    }
    
    public String escogerPalabra()
    {
        int n=(int) (Math.random() * 100);
        return nombre[n];
    }
}
