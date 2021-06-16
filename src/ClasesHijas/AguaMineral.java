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
public class AguaMineral extends Bebidas {

    private String origen;

    public AguaMineral(String origen, double cantidadLitros, double precio, String marca) {
        super(cantidadLitros, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrigen: " + origen;
    }

}
