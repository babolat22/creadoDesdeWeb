package p2ejercicio2;

import java.util.ArrayList;
/**
 *
 * @author juanj
 */
public class P2ejercicio2 {

    public static void main(String[] args) {
        ArrayList <numero> tablero = new ArrayList();
        int docena=3, i=1;
        numero cero = new numero();  tablero.add(cero); 
        while (i<37){
            if(i<=12) docena=1;
            else if (i<=24) docena=2;  
            else docena=3;  
            numero num = new numero(i, docena);
            tablero.add(num);
            i++;
        }
        for(numero nro: tablero){
             System.out.printf("El %s ¿es par? %s, y de color %s\n",nro.valor, nro.esPar(), nro.getColor());
        }
    }
    
}
