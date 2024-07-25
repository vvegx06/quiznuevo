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
public class GestionSupermercado {

    public String nombreSuper;
    public int codigoSuper;
    public String nombreEmpleado;
    public int cedulaEmpleado;

    public void SolicitudInformacionSuper() {
        JOptionPane.showMessageDialog(null, "Se solicitarán los datos del super");
        nombreSuper = JOptionPane.showInputDialog(null, "Escriba el nombre: ");
        codigoSuper = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el codigo: "));
        nombreEmpleado = JOptionPane.showInputDialog(null, "Escriba el nombre del empleado: ");
        cedulaEmpleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cedula:"));
    }
}
