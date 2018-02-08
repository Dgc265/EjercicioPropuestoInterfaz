/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta.pkg20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dgc26
 */
public class Atleta20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List <Deportista> deportistas = new ArrayList <>();
    Atleta a1 = new Atleta("Luffy", 1, 3.78, 2.5);
    Atleta a2 = new Atleta("Junior", 2, 1.78, 3.5);
    Atleta a3 = new Atleta("Rodrigo diaz de vivar", 3, 0.78, 4.5);
    Atleta a4 = new Atleta("Carlos", 4, 5.78, 5.5);
    Futbolista f1 = new Futbolista (20, "roberto carlos", 5);
    Futbolista f2 = new Futbolista (50, "Ronaldo", 6);
    Futbolista f3 = new Futbolista (20, "Rodrigo diaz de vivar señor de valencia", 7);
    Futbolista f4 = new Futbolista (0, "Casillas", 8);
    Nadador n1 = new Nadador (100,"Mariposa", "Luis", 9);
    Nadador n2 = new Nadador (500,"Braza", "Alberto", 1);
    Nadador n3 = new Nadador (200,"Espalda", "Daniel", 52);
    Nadador n4 = new Nadador (1000,"4 Estilos", "Angel", 100);
   deportistas.add(a1);
   deportistas.add(a2);
   deportistas.add(a3);
   deportistas.add(a4);
   deportistas.add(f1);
   deportistas.add(f2);
   deportistas.add(f3);
   deportistas.add(f4);
   deportistas.add(n1);
   deportistas.add(n2);
   deportistas.add(n3);
   deportistas.add(n4);
   Collections.sort(deportistas , new OrdenPorNumeroFederacion());
        System.out.println("Los datos ordenados por numero de federacion: \n");
        for (Deportista deportista : deportistas) {
        if(deportista instanceof Atleta){
         Atleta atleta = (Atleta) deportista;
            System.out.println(atleta.datos());
            }
         if(deportista instanceof Nadador){
         Nadador nadador = (Nadador) deportista;
            System.out.println(nadador.datos());
            }
          if(deportista instanceof Futbolista){
         Futbolista futbolista = (Futbolista) deportista;
            System.out.println(futbolista.datos());
            }
        }
    
    
    
    }
    }
    

