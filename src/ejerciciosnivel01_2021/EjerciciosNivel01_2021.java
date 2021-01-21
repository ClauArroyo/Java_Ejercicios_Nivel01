/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

/**
 *
 * @author xp
 */
public class EjerciciosNivel01_2021 {
    
    //declaro un array de integers para hacer pruebas
    int[] listaNumeros = {50, 31, 27, 2, 5, 99};
    
    public int maximo(int[] lista){
        int auxiliar = lista[0]; //el máximo va a ser el primer elemento del array 
                                 //(lo vamos a suponer y luego lo compararemos con 
                                 //el resto de los números de la lista
        for (int i=0; i< lista.length; i++){
            if (auxiliar < lista[i]){
                auxiliar = lista[i];
            }
        }
        return auxiliar;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01_2021 ejercicio = new EjerciciosNivel01_2021();
        System.out.println("El máximo es: " + ejercicio.maximo(ejercicio.listaNumeros));
        
        
    }
    
}
