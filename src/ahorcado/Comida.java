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
public class Comida extends Juego {
    public String comida[]={"TACOS","BIRRIA","HAMBURGESA","HOTDOG","SOPA"
        ,"POZOLE","TAMALES","BURROS","GORDITAS","PIZZA","QUESADILLA","TOSTADAS"
        ,"SPAGHETTI","SANDWICH","MOLE","ENCHILADA","GUACAMOLE","CHILAQUILES","PASTEL"
        ,"ESQUITES","PICADILLO","FRIJOLES","TORTA","ENFRIJOLADAS","TLACOYOS","CARNITAS"
        ,"PAMBAZOS","HUARACHE","HUEVO","TINGA","MENUDO","ROMERITOS","CAPIROTADA","CREMA"
        ,"CHALUPAS","PIPIAN","PAN","GRINGAS","NACHOS","ARROZ","MOLLETES","ARRACHERA"
        ,"ENSALADA","LASAÑA","MACARRONES","SALAMI","RAVIOLI","SOPE","GELATINA","SALSA"};
    
    public Comida(){
        
    }
    
    public String escogerPalabra()
    {
        int n=(int) (Math.random() * 49);
        return comida[n];
    }
}
