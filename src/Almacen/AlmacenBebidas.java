/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import ClasePadre.Bebidas;
import ClasesHijas.AguaMineral;
import ClasesHijas.BebidaAzucarada;
import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 10/06/2021
 *
 */
public class AlmacenBebidas {

    //Esta clase la usaremos como almecen de las bebidas
    Bebidas[][] matriz;

    //Constructor que le dara un tamaño por defecto a nuestro almacen
    public AlmacenBebidas() {
        matriz = new Bebidas[2][2];
    }

    public AlmacenBebidas(int fila, int columna) {
        matriz = new Bebidas[fila][columna];
    }

    //Metodo para rellenar una bebida azucarada
    public Bebidas rellenarBebidaAzucarada() {
        boolean promo = false;
        Bebidas c;
        String marca = JOptionPane.showInputDialog(null, "Introduce la marca de la bebida", "Introduciendo Marca", 1);
        double cantidadLitros = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la Cantidad De litros", "Introduciendo litros", 1));
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el precio de la Bebida", "Introduciendo precio", 1));
        double porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el porcentaje de Azucar", "Introduciendo porcentaje de azucar", 1));
        String promocion = JOptionPane.showInputDialog(null, "La Bebida cuenta con promosion?", "Promosion", 1);
        if (promocion.equalsIgnoreCase("SI")) {
            promo = true;
        } else {
            promo = false;
        }

        c = new BebidaAzucarada(porcentaje, promo, cantidadLitros, precio, marca);

        // c.verificarPromocion();
        return c;
    }

    //Metodo para rellenar una Agua Mineral
    public Bebidas rellenarAgua() {
       Bebidas a;
        String marca = JOptionPane.showInputDialog(null, "Introduce la marca de la bebida", "Introduciendo Marca", 1);
        double cantidadLitros = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la Cantidad De litros", "Introduciendo litros", 1));
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el precio de la Bebida", "Introduciendo precio", 1));
        String origen = JOptionPane.showInputDialog(null, "Introduce el origen de la Agua Mineral", "Introduciendo el origen de la agua Mineral", 1);
        a = new AguaMineral(origen, cantidadLitros, precio, marca);
        return a;
    }

    //Metodo para agregar una bebida azucarada
    public void agregarBebida(Bebidas b) {
        boolean encontrado = false;
        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[0].length && !encontrado; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = b;
                    encontrado = true;

                }
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "La bebida fue agregada correcta mente", "Agregado correctamente", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar agregar la Bebidas", "Error al Agregar la bebidas", 0);
        }

    }

    //Metodo para mostrar los productos del almacen
    public void mostrarAlmacen() {
        String cadena = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    cadena = "\nFila: " + i + "  Columna:" + j + "\n" + cadena + matriz[i][j].toString() + "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, cadena, "Mostrando el inventario", 1);

    }

    //Metodo para eliminar un producto por ID
    public void eliminarProducto(int id) {
        if (id > 0) {
            String cadena = "";
            boolean encontrado = false;
            for (int i = 0; i < matriz.length && !encontrado; i++) {
                for (int j = 0; j < matriz[0].length && !encontrado; j++) {
                    if (matriz[i][j] != null && matriz[i][j].getId() == id) {
                        cadena = matriz[i][j].getMarca();
                        matriz[i][j] = null;
                        encontrado = true;
                    }
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "La Bebida " + cadena + " fue eliminada", "Producto Eliminado", 0);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ningun producto en el ID", "NO existe ningun producto con ese ID", 1);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Introduce un valor correcto", "Valores Incorrectos", 0);
        }

    }

    //Metodo para calcular el precio Total de Tosas las bebidas}
    public double precioTotal() {
        double pF = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    pF += matriz[i][j].getPrecio();
                }
            }
        }
        return pF;
    }

    //Metodo para verificar si esta vacio
    public boolean isVacia() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != null) {
                    return false;
                }
            }
        }
        // if (c==matriz.length) {
        //JOptionPane.showMessageDialog(null, "El Almacen se encuentra Vacio", "Almacen Vacio", 2);
        return true;
        //  }
        // return false;
    }

    //Metodo para verificar si hay espacios diponibles para agregar productos
    public boolean ayEspacio() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }
}

  //Metodo para rellenar valores
   /* public BebidaAzucarada rellenar() {
 boolean promo = false;
 BebidaAzucarada c;
 double cantidadLitros = 0, precio = 0;

 String marca = "";
 rellenarValores(cantidadLitros, precio, marca);
 double porcentaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el porcentaje de Azucar", "Introduciendo porcentaje de azucar", 1));
 String promocion = JOptionPane.showInputDialog(null, "La Bebida cuenta con promosion?", "Promosion", 1);
 if (promocion.equalsIgnoreCase("SI".trim())) {
 promo = true;
 } else {
 promo = false;
 }
 c = new BebidaAzucarada(porcentaje, promo, cantidadLitros, precio, marca);
 return c;
 }

 //Metodo para rellenar los valores similares
 public void rellenarValores(double cantidadLitros, double precio, String marca) {
 marca = JOptionPane.showInputDialog(null, "Introduce la marca de la bebida", "Introduciendo Marca", 1);
 cantidadLitros = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la Cantidad De litros", "Introduciendo litros", 1));
 precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el precio de la Bebida", "Introduciendo precio", 1));
 }*/
