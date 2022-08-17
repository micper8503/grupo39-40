/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto1;

/**
 *
 * @author MICHAEL
 */
public class Solution {
    public static int[] reporte(double[] listaNotas) {
              
        double notaMayor = listaNotas[0];
        double notaMenor = listaNotas[0];
        double suma = 0;
        double promedio =0;
        
        for(int i = 0; i < listaNotas.length; i++){
            suma += listaNotas[i];
            
        if(listaNotas[i] > notaMayor){
            notaMayor = listaNotas[i];      
        }else if (listaNotas[i] < notaMenor){
                notaMenor = listaNotas[i]; 
             }
        
        }
        promedio = suma / listaNotas.length;
        double [] reporte = {promedio, notaMenor, notaMayor};
        //return reporte;
    }
}
