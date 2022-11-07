/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author abiga
 */
public class SistemaATM {
    //Variables locales
    
    public static double saldoActual;
    
    
    public SistemaATM(){
     saldoActual =0;         
    }
    
    public void depositar(double deposito){
    
    saldoActual += deposito;
    }  
    public void retirar(double retiro){
        if(saldoActual>=retiro){
            saldoActual -= retiro;
            
        }
        else{
            JOptionPane.showMessageDialog(null, "[Error] -Saldo insuficiente-");
        }
    }
    
    public double obtenerSaldo(){
        return saldoActual;
    }
}