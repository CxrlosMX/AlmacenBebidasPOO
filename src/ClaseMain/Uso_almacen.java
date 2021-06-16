/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import Almacen.AlmacenBebidas;
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
public class Uso_almacen {

    public static void main(String[] args) {
        int op = 0, op2 = 0, id;
        //Iniciamos nuestro almacen
        AlmacenBebidas almacen = new AlmacenBebidas();
        BebidaAzucarada a;
        Bebidas bb;
        AguaMineral b;
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "--ALMACEN DE BEBIDAS--"
                        + "\n1.-Agregar Bebidas"
                        + "\n2.-Eliminar Bebida"
                        + "\n3.-Mostrar Informacion"
                        + "\n4.-Calcular Precio de Todas las Bebidas"
                        + "\n5.-Salir\n¿Que desea realizar?", "MENU", 1));
                switch (op) {
                    case 1: {

                        do {
                            try {
                                op2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "-BEBIDAS--"
                                        + "\n1.-Agregar Bebida Azucarada"
                                        + "\n2.-Agregar Agua Mineral"
                                        + "\n3.-Salir al Menu Principal\n¿Que desea agregar?", "AGREGANDO", 3));
                                switch (op2) {
                                    case 1: {
                                        if (almacen.ayEspacio()) {
                                           bb=almacen.rellenarBebidaAzucarada();
                                            almacen.agregarBebida(bb);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No puedes agregar mas Bebidas", "Almacen Lleno", 2);
                                        }

                                        break;
                                    }
                                    case 2: {
                                        if (almacen.ayEspacio()) {
                                            bb = almacen.rellenarAgua();
                                            almacen.agregarBebida(bb);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No puedes agregar mas Bebidas", "Almacen Lleno", 2);
                                        }

                                        break;
                                    }
                                    case 3: {
                                        JOptionPane.showMessageDialog(null, "Saliendo al menu Principal", "Menu principal", 1);
                                        break;
                                    }
                                    default: {
                                        JOptionPane.showMessageDialog(null, "Elige una opcion correcta", "Opcion incorrecta", 0);
                                        break;
                                    }
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
                            }
                        } while (op2 != 3);
                        break;
                    }
                    case 2: {
                        if (!almacen.isVacia()) {
                            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el ID del producto a eliminar", "Eliminando un producto", 1));
                            almacen.eliminarProducto(id);
                        } else {
                            JOptionPane.showMessageDialog(null, "El almacen se encuentra vacio", "Almacen Vacio", 2);
                        }
                        break;
                    }
                    case 3: {
                        if (!almacen.isVacia()) {
                            almacen.mostrarAlmacen();
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "El almacen se encuentra vacio", "Almacen Vacio", 2);
                        }
                        break;
                    }
                    case 4: {
                        JOptionPane.showMessageDialog(null, "Precio Total: " + almacen.precioTotal(), "Precio total de los producto", 1);
                        break;
                    }
                    case 5: {
                        JOptionPane.showMessageDialog(null, "Cerrando Programa", "Saliendo", 1);

                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Elige una opcion correcta", "Opcion incorrecta", 0);

                        break;
                    }

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 5);

        /*   AlmacenBebidas almacen = new AlmacenBebidas();
         BebidaAzucarada a;
         AguaMineral b;
         a = almacen.rellenarBebidaAzucarada();
         almacen.agregarBebida(a, null, 1);
         b = almacen.rellenarAgua();
         almacen.agregarBebida(null, b, 2);
         almacen.mostrarAlmacen();
         JOptionPane.showMessageDialog(null, "Precio Total: " + almacen.precioTotal(), "Precio total de los producto", 1);
         almacen.eliminarProducto(1);
         almacen.mostrarAlmacen();
         JOptionPane.showMessageDialog(null, "Precio Total: " + almacen.precioTotal(), "Precio total de los producto", 1);*/
    }
}
