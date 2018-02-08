/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta.pkg20;

/**
 *
 * @author 53253095e
 */
public class Futbolista extends Deportista{
    private int golesTotales;
    private int kilometrosCorridos;

    public Futbolista(int golesTotales, String nombre, int numeroFederado) {
        super(nombre, numeroFederado);
        this.golesTotales = golesTotales;
    }

    

    public int getGolesTotales() {
        return golesTotales;
    }

    public int getKilometrosCorridos() {
        return kilometrosCorridos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroFederado() {
        return numeroFederado;
    }

    public void setGolesTotales(int golesTotales) {
        this.golesTotales = golesTotales;
    }

    public void setKilometrosCorridos(int kilometrosCorridos) {
        this.kilometrosCorridos = kilometrosCorridos;
    }
    
    
    
    
     public String datos() {
        String mensaje = "";
        mensaje = this.getNombre()+" Hace la accion: " +this.accion()+ " su Codigo federado es: " + this.getNumeroFederado();

        return mensaje;
    }
    
     @Override
    public String accion() {
       String mensaje="Saltar";
       return mensaje;
    }
    
}
