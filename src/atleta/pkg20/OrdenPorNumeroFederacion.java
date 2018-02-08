/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta.pkg20;

import java.util.Comparator;

/**
 *
 * @author 53253095e
 */
public class OrdenPorNumeroFederacion implements Comparator<Deportista> {

    @Override
    public int compare(Deportista o1, Deportista o2) {
        int comparacion = 0;
        if (o1.getNumeroFederado() < o2.getNumeroFederado()) {
            comparacion = -1;
        }
        if (o1.getNumeroFederado() > o2.getNumeroFederado()) {
            comparacion = 1;
        }

        return comparacion;
    }
}
