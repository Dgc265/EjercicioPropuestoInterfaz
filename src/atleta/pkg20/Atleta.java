package atleta.pkg20;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dgc26
 */
public class Atleta extends Deportista {

    public double mejorMarca100m;
    public double mejorMarcaSalto;

    public Atleta(String nombre, int numeroFederado, double mejorMarca100m, double mejorMarcaSalto) {
        super(nombre, numeroFederado);
        this.mejorMarca100m = mejorMarca100m;
        this.mejorMarcaSalto = mejorMarcaSalto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroFederado() {
        return numeroFederado;
    }

    public double getMejorMarca100m() {
        return mejorMarca100m;
    }

    public double getMejorMarcaSalto() {
        return mejorMarcaSalto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMejorMarca100m(double mejorMarca100m) {
        this.mejorMarca100m = mejorMarca100m;
    }

    public void setMejorMarcaSalto(double mejorMarcaSalto) {
        this.mejorMarcaSalto = mejorMarcaSalto;
    }

    public String datos() {
        String mensaje = "";
        mensaje = this.getNombre()+" su accion es: "+this.accion() + " Mejor marca 100m: " + this.getMejorMarca100m() + " Marca de salto: " + this.getMejorMarcaSalto() + " Codigo federado: " + this.getNumeroFederado();

        return mensaje;
    }

    @Override
    public String accion() {
       String mensaje="Saltar";
       return mensaje;
    }

}
