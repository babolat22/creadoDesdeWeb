package p2ejercicio2;

public class numero {
    int valor;
    String color="rojo";
    int docena; // y centena
    
    
    
    // HOLA GIT
    
    public numero(int n, int docena) {
        this.valor = n;
        this.docena = docena;
        setColor();
    }
    public numero() {    //para el cero
        valor = 0;
        docena = 1;
        color = "Verde";
    }   
   boolean esPar(){
       return (valor%2==0);  //13%2 = 1 
   }
      private void setColor(){
   // la suma de sus cifras da un resultado impar: el 12 es compuesto de 1 y 2 que sumados dan 3 que es impar.   
    int n=valor,dig1, dig2;
    System.out.println("cifras sumadas: "+ (n%10+n/10));
        do {
             dig1=n/10;
             dig2=n%10;
             n=dig1+dig2;   // proximo desglose
             if ((n%2==0) || (valor==10)|| (valor==28))// excepciones NEGRO
                if (valor==19)  // excepcion ROJO
                   this.color = "ROJO";
                else 
                   this.color = "negro";
            
       } while (n>9); // hasta un digito
       
   }           
   String getColor(){
       return this.color;
   }
   int ladocena(int n){
       return docena;
   }  
            
}
