/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePadre;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10/06/2021
 *
 */
public class Bebidas {

    private static int ID = 1; //Es estatica por que esta variable la compartiran todas las clases
    private int Id = 0;
    private double cantidadLitros;
    private double precio;
    private String marca;

    public Bebidas(double cantidadLitros, double precio, String marca) {
        Id = ID++;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

    public void setCantidadLitros(double cantidadLitros) {
        this.cantidadLitros = cantidadLitros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ID: " + Id + "\nCantidad De Litros: " + cantidadLitros + "\nPrecio:" + precio + "\nMarca: " + marca;
    }

}
