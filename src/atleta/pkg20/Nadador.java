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
public class Nadador extends Deportista {
private int metrosANadar;
private String estilo;

    public Nadador(int metrosANadar, String estilo, String nombre, int numeroFederado) {
        super(nombre, numeroFederado);
        this.metrosANadar = metrosANadar;
        this.estilo = estilo;
    }

    public int getMetrosANadar() {
        return metrosANadar;
    }

    public String getEstilo() {
        return estilo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroFederado() {
        return numeroFederado;
    }

    public void setMetrosANadar(int metrosANadar) {
        this.metrosANadar = metrosANadar;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    
  public String datos() {
        String mensaje = "";
        mensaje = this.getNombre()+" Hace la accion: " +this.accion()+ " su Codigo federado es: " + this.getNumeroFederado();

        return mensaje;
    }

  @Override
    public String accion() {
       String mensaje="Nadar";
       return mensaje;
    }

}
