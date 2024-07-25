/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg3;

/**
 *
 * @author andre
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionSupermercado gestion = new GestionSupermercado();
        gestion.SolicitudInformacionSuper();
        System.out.println("1");
        Productos p = new Productos();
        System.out.println("2");
        p.SolicitudInformacionSuper();
        System.out.println("3");
        p.getPrecioBruto();
        System.out.println("4");
        p.calculoGanancia();
        System.out.println("5");
        p.MuestraDeInformacion();
        System.out.println("6");

    }

}
