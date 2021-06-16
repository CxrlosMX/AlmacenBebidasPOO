/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesHijas;

import ClasePadre.Bebidas;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10/06/2021
 *
 */
public class BebidaAzucarada extends Bebidas {

    private double porcentajeAzucar;
    private boolean promocion;

    public BebidaAzucarada(double porcentajeAzucar, boolean promosion, double cantidadLitros, double precio, String marca) {
        super(cantidadLitros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promosion;
    }

    public boolean isPromosion() {
        return promocion;
    }

    public void setPromosion(boolean promosion) {
        this.promocion = promosion;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    //Promosion

    /* public void verificarPromocion() {
     if (this.promocion) {
     double n= super.getPrecio()*0.9;
     super.setPrecio(n);
     }

     }*/
    @Override
    public double getPrecio() {
        if (this.promocion) {
            return super.getPrecio()*0.9;
        }
        return super.getPrecio();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "\nPorcentaje Azucar: " + porcentajeAzucar + "%";
    }

}
