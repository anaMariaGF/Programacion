
import enumeracion.Continentes;
import enumeracion.Dias;
import static java.time.Instant.now;
import static java.time.Instant.now;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana
 */

//recibe un número y dice el día de la semana

public class Principal {
    static Scanner dato = new Scanner(System.in);
    static int num;
    static Dias d;
    
    public static void main(String[] args) {
         /*System.out.println("Ingrese un numero para saber a que día corresponde 1(Lunes) al 7(Domingo)");
         num = dato.nextInt();
         d = Dias.values()[num-1];
         System.out.println(d);*/
         
         
         System.out.println("Mi primer dia de la semana es: " + Dias.LUNES);
         diaSemana(Dias.MARTES);
         
         //Asignación directa a través de enum
         Dias miDia =   Dias.JUEVES;
         
         //Asignación de un día en base a un string a través de valueOf
         Dias miSegundoDia = Dias.valueOf("VIERNES");
         
         //Declaracion de un listado de días inicializado con los values de mi Enum
         Dias[] todosMisDias = Dias.values();
         for (Dias d : todosMisDias) {
             System.out.println("d - " + d.name());
        }
         
         //Visualizando un país
         System.out.println("Continente ... " + Continentes.AMERICA);
    }
         
    public static void diaSemana (Dias dia){
        switch(dia){
            
             case LUNES:
                 System.out.println("Primer día de la semana");
                 break;
             case MARTES:
                 System.out.println("Primer día de la semana");
                 break;
             case MIERCOLES:
                 System.out.println("Primer día de la semana");
                 break;
             case JUEVES:
                 System.out.println("Primer día de la semana");
                 break;
             case VIERNES:
                 System.out.println("Primer día de la semana");
                 break;
             case SABADO:
                 System.out.println("Primer día de la semana");
                 break;
             case DOMINGO:
                 System.out.println("Primer día de la semana");
                 break;
             default:
              
             
         }
    }
                 
                 
    }
    




                                                                                                      
