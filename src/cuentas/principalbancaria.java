/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;
import java.io.*;
import java.util.Scanner;

public class principalbancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nuevaClave;
        
        tarea objeto1 = new tarea(  1012,1234,"Magdalena Sanchez",0);
        tarea objeto2 = new tarea (1013,9876,"Joselito Perez",50000);
        
        System.out.println("Digite la nueva clave");
        nuevaClave = entrada.nextInt();
        
        
        objeto1.consignarDinero(1000000);
        objeto2.cambiarClave(nuevaClave);
        objeto2.consultarSaldo();
        
        
        
    }
}
