/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Productos {

    public String nombreProducto;
    public int codigoProducto;
    public int cantidad;
    public double precioBase;
    public int tipo;
    public double precioBruto;
    public double ganancia;

    public Productos(String nombreProducto, int codigoProducto, int cantidad, double precioBase, int tipo, double precioBruto, double ganancia) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.precioBruto = precioBruto;
        this.ganancia = ganancia;
        
        
    }

    Productos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public void SolicitudInformacionSuper() {
        JOptionPane.showMessageDialog(null, "Se solicitarán los datos de los productos");
        nombreProducto = JOptionPane.showInputDialog(null, "Escriba el nombre: ");
        codigoProducto = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la codigo: "));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad: "));
        precioBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el precio base: "));
        tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tipo: /n 1. Alimentos /n 2. Bebidas /n 3. Higiene /n 4. Limpieza"));
        if (tipo < 1 || tipo > 4);
        precioBruto = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el precio bruto: "));
    }

    public void precioBruto() {
        switch (tipo) {
            case 1 ->
                precioBruto = precioBase * 0.20 + precioBase;
            case 2 ->
                precioBruto = precioBase * 0.30 + precioBase;
            case 3 ->
                precioBruto = precioBase * 0.25 + precioBase;
            case 4 ->
                precioBruto = precioBase * 0.19 + precioBase;
        }

    }

    public void calculoGanancia() {
        ganancia = (precioBruto + precioBase) * cantidad;
    }

    public void MuestraDeInformacion() {
        JOptionPane.showMessageDialog(null, "Se agrego el producto: "+ nombreProducto+"/n" + "El codigo del producto es: "+ codigoProducto +"/n" + "La cantidad es: "+ cantidad +"/n" + "El tipo es" + tipo +"/n"+ "El precio es: "+precioBruto+"/n"+ "La ganancia es de"+ ganancia);
        
         }
}
