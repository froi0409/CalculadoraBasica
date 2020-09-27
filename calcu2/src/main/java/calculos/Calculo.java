/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

/**
 *
 * @author froi-pc
 */
public class Calculo {
    
    private int num1, num2;
    
    public Calculo(int num1, int num2){
        
        this.num1 = num1;
        this.num2 = num2;
        
    }
    
    public double suma(){
        return num1+num2;
    }
    
    public double multiplicacion(){
        return num1*num2;
    }
    
    public double mayor(){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }
    
    public double potencia(){
        return Math.pow(num1, num2);
    }
    
    public String mostrarBinario(){
        return "<br>Numero 1: " + binario(num1) + "<br>Numero 2: " + binario(num2);
    }
    
    private String binario(int num){
        String cadena = "";
        String cadenaD = "";
        
        while(num >= 1){
            if(num % 2 == 0){
                cadena += "0";
            } else {
                cadena += "1";
            }
            num=num/2;
        }
        
        for(int i = cadena.length()-1; i >= 0; i--){
            cadenaD += cadena.charAt(i);
        }
        
        return cadenaD;
    }
}