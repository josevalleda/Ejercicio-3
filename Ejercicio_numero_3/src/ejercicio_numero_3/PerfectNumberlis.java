
package ejercicio_numero_3;

import java.util.Scanner;

public class PerfectNumberlis {

    public static void main(String[] args) {

        int num = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduzca el numero hasta donde desea conocer, recuerde que debe ser positivo: ");
        num = ent.nextInt();
        Isperfect(num);
        NDef(num); 
    }

    private static void Isperfect(int num) {
         int c = 0;
        float prom;
        int p[]= new int[num];
        for(int i=1; i <=  num; i++){ 
            int div = 0;
            for(int j=1; j<i; j++){  
                    if(i % j == 0){ 
                    div = div + j;
                    }
               
            }
           if(i == div){
              p[c] = i;
              c++;
            }
        }
        System.out.println("Los numeros eficientes son: ");
            for(int k=0; k<c; k++){
            System.out.println(p[k]);
            }
        prom=(num*c)/100;
        System.out.println("Los numeros eficientes encontrados son: " +c+ "("+prom+"%)");
       
    } 

    private static void NDef(int num) {
     
        int Nod[]  = new int [num];
        int c = 0, div;
        float prom=0;
        for(int i=1; i<=num ;i++){
             div=0;
            for(int j=1; j<i-1; j++){
                    if(i % j == 0){ 
                     div=div+j;
                }
            }
           if(div > i){
              Nod[c]=i;
              c++;
            }
        }
        System.out.println("Numeros que no son ni deficientes ni eficientes: ");
            for(int k = 0; k < c; k++){
            System.out.println(Nod[k]);
            }
        prom=(num*c)/100;
        System.out.println("Numeros ni deficientes ni eficientes encontrados: " +c+ "("+prom+"%)");
        
        
        
        
    }        
        
        
        
        
        
    }
    


//Jose David De la valle Acuña - 2015114083
//John Steven Rubio Castellanos - 2015214126