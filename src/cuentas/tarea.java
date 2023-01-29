
package cuentas;
import java.io.*;

public class tarea {
 private int numero;
 private  int clave;
 private String nombre;
 private double saldo;

    public tarea(int numero, int clave, String nombre, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.nombre = nombre;
        this.saldo = saldo;
    }
 
 public void consultarSaldo(){
     System.out.println("Su saldo es " + saldo);  
 }
 public void consignarDinero (double valorConsignacion){
     saldo = saldo +  valorConsignacion;
     System.out.println("Consignacion exitosa");
      consultarSaldo();
      
 }
  public void retirDinero (double valorRetiro){
      if(saldo>valorRetiro){
          saldo = saldo- valorRetiro;
          System.out.println("Retiro Exitoso");
          consultarSaldo ();
      }
      else{
          System.out.println("Fondos insuficiente");
          
      }
  }
      public void cambiarClave (int nuevaClave){
          clave = nuevaClave;
          System.out.println("La clase ha sido cambiada con exito");
      }
  }
  
  

