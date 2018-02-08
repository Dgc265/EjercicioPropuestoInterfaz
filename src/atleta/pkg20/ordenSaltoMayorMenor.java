/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta.pkg20;

import java.util.Comparator;

/**
 *
 * @author dgc26
 */
public class ordenSaltoMayorMenor implements Comparator <Atleta> {

    @Override
    public int compare(Atleta o1, Atleta o2) {
           int comparacion=0;
      if(o1.getMejorMarcaSalto() < o2.getMejorMarcaSalto()){
    comparacion=1;
    }
    if(o1.getMejorMarcaSalto() > o2.getMejorMarcaSalto()){
    comparacion=-1;
    }
    
    return comparacion;
    }
    
}
