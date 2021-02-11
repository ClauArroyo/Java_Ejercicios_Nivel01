/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

import java.util.Arrays;

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
     * 
     * método para quitar los espacios en blanco a un String
     */
    private String   quitaEspaciosEnBlanco(String cadena){
        //"Acaso hubo buhos aca"
        //Acasohubobuhosaca
        String auxiliar = "";
         for (int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' ' && cadena.charAt(i) != ','){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }
    /**
     * 
     * @param cadena el string a limpiar
     * @return el string sin acentos
     */
    public String quitaAcentos ( String cadena){
        // pájaro
        // pajaro
       // cadena = cadena.toLowerCase();
        cadena = cadena.replace('á', 'a');
        cadena = cadena.replace('é', 'e');
        cadena = cadena.replace('í', 'i');
        cadena = cadena.replace('ó', 'o');
        cadena = cadena.replace('ú', 'u');
        cadena = cadena.replace('ü', 'u');
        
        cadena = cadena.replace('Á', 'A');
        cadena = cadena.replace('É', 'E');
        cadena = cadena.replace('Í', 'I');
        cadena = cadena.replace('Ó', 'O');
        cadena = cadena.replace('Ú', 'U');
        cadena = cadena.replace('Ü', 'U');
        
        return cadena;
        
    }
    
    public String quitaAcentosV2(String cadena){
        String auxiliar = "";
        for (int i=0; i < cadena.length(); i++){
            if (cadena.charAt(i)== 'á'){auxiliar = auxiliar + 'a'; }
            else if (cadena.charAt(i)== 'é'){auxiliar = auxiliar + 'e'; }
            else if (cadena.charAt(i)== 'í'){auxiliar = auxiliar + 'i'; }
            else if (cadena.charAt(i)== 'ó'){auxiliar = auxiliar + 'o'; }
            else if (cadena.charAt(i)== 'ú'){auxiliar = auxiliar + 'u'; }
            else if (cadena.charAt(i)== 'ü'){auxiliar = auxiliar + 'u'; }
            
            else if (cadena.charAt(i)== 'Á'){auxiliar = auxiliar + 'A'; }
            else if (cadena.charAt(i)== 'É'){auxiliar = auxiliar + 'E'; }
            else if (cadena.charAt(i)== 'Í'){auxiliar = auxiliar + 'I'; }
            else if (cadena.charAt(i)== 'Ó'){auxiliar = auxiliar + 'O'; }
            else if (cadena.charAt(i)== 'Ú'){auxiliar = auxiliar + 'U'; }
            else if (cadena.charAt(i)== 'Ü'){auxiliar = auxiliar + 'U'; }
            else {
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }
    
    public boolean esPalindromo ( String frase ){
        //este programa devuelve verdadero si la frase tiene los mismos caracteres de izquierda a derecha
        //que de derecha a izquierda y si no devuelve faso
        
        //"Acaso hubo buhos aca"
        //Acasohubobuhosaca
        
        //1º primera fase: quitar los espacios en blanco de la cadena
        String auxiliar2 = quitaEspaciosEnBlanco(frase);
        //2º Pasamos a minúsculas toda la frase
        auxiliar2 = auxiliar2.toLowerCase();
        //3º Voy a usar el método de los dos índices
        auxiliar2 = quitaAcentos(auxiliar2);
        int indiceIzquierdo = 0;
        int indiceDerecho = auxiliar2.length() - 1;
        
        while (auxiliar2.charAt(indiceIzquierdo) == auxiliar2.charAt(indiceDerecho) 
                && indiceIzquierdo <= indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if(indiceIzquierdo < indiceDerecho){ //se ha salido antes de llegar al medio, luego no es palíndromo
            
            return false; //no son palíndromos
        }
        else{
           return true; //si que es plaíndromo porque los índices se han cruzado 
        }
        
    }
    
    public boolean esIsograma ( String palabra){
        //Este método devuelve true si la palabra no tiene ninguna letra repetida
        //y false si se repite alguna.
        palabra = palabra.toUpperCase();
        palabra = quitaAcentos(palabra);
        for (int i=0; i< palabra.length(); i++){
            for (int j=i+1; j< palabra.length(); j++){
                if( palabra.charAt(i) == palabra.charAt(j)){
                    return false;
                }
            }
        }
        //Si ha recorrido los dos bucles sin salir en el return false,
        //es porque la palabra no tiene letras repetidas
        return true;
    }
    //EJERCICIOS JAVA NIVEL 01 PARTE 2: ACRÓNIMO
    
    /**
    * Este método recibe un string formado por varias palabras
    * por ejemplo "Alta Velocidad Española"
    * y devuleve un array de Strings por ejemplo
    * ("Alta" + "Velocidad" + "Española")
    * ESTA VERSIÓN SOLO SE USARÁ EN LAS PRÁCTICAS
    * NO EN LA VIDA REAL
    */
    public String[] divideFrase( String frase){
        frase = frase + " ";
        String auxiliar = "";
        //1º Averiguamos cuántos espacios en blanco tiene la frase
        int numeroEspaciosEnBlanco = 0;
        for (int i=0; i< frase.length(); i++){
            if (frase.charAt(i) == ' '){
                numeroEspaciosEnBlanco++;
            }
        }
        //+1 en número de espacios para que me coja la última palabra
        String[] dividido = new String[numeroEspaciosEnBlanco];
        int contadorPalabra = 0;
        for (int i=0; i< frase.length(); i++){
            if (frase.charAt(i) == ' '){
               dividido[contadorPalabra] = auxiliar;
                auxiliar = "";
                contadorPalabra++;
            }
            else{
                auxiliar = auxiliar + frase.charAt(i);
            }
        }
        return dividido;
    }
    
    /*
    *recibe una frase y devuelve su acrónimo (la primera letra
    * de cada palabra que forma la frase)
    * 
    */
    public String acronimo (String frase) {
        frase = frase.toUpperCase();
        String [] palabras = frase.split(" ");
        //String [] palabras = divideFrase(frase);
        String auxiliar = "";
        for (int i=0; i< palabras.length; i++){
            if (palabras[i].length() > 0){ //para evitar el problema de las palabras vacías
            if (!(palabras[i].equals("Y") || palabras[i].equals("E") || palabras[i].equals("DE") || palabras[i].equals("LA") || palabras[i].equals("LAS"))){
               auxiliar = auxiliar + palabras[i].charAt(0);
            }
            }
        }
        return auxiliar;
    }
    /**
     * Recibe dos strings y devuelve true si todas las letras del primero están
     * en el segundo(sin repetirse), por ejemplo amor y roma
     * @param palabra1
     * @param palabra2
     * @return 
     */
    
    public boolean esAnagrama ( String palabra1, String palabra2){
        palabra1 = quitaEspaciosEnBlanco(palabra1);
        palabra2 = quitaEspaciosEnBlanco(palabra2);
        palabra1 = quitaAcentosV2(palabra1);
        palabra2 = quitaAcentosV2(palabra2);
        palabra1 = palabra1.toUpperCase();
        palabra2 = palabra2.toUpperCase();
        
        if (palabra1.length() != palabra2.length()){
            return false; //no tienen el mismo número de letras, luego no son anagramas
        }
        if (palabra1.length() == 0){
            return false; //no tienen caracteres
        }
       
        for (int i=0; i < palabra1.length(); i++){
            if (palabra2.contains("" + palabra1.charAt(i)) ){
                //busco dónde está la letra y luego hago algo oon ella
                palabra2 = palabra2.replaceFirst("" + palabra1.charAt(i), "*");
            }
            else{
                return false;
            }
        }
        
        return true;
    }
    
    
    /**
     * 
     * @param diasIniciales son los días con XX que hay que poner al principio
     */
    public void calendario (int diasIniciales){
        //primera parte imprimir las XX
        for (int i=0; i < diasIniciales; i++){
            System.out.print("XX ");
        }
        
        //segunda fase: imprimir los números del 1 al 31
        for (int i=1; i<5; i++){
            System.out.print(i + " ");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01_2021 ejercicio = new EjerciciosNivel01_2021();
        System.out.println("El máximo es: " + ejercicio.maximo(ejercicio.listaNumeros));
        
        //segundo ejercicio: Palíndromo
        
        
        System.out.println("palindromo: " + ejercicio.esPalindromo("Acaso hubo buhos aca"));
        System.out.println("palindromo: " + ejercicio.esPalindromo("estonoes"));
        System.out.println("isograma: " + ejercicio.esIsograma("murcielago"));
        System.out.println("isograma: " + ejercicio.esIsograma("diccionario"));
        
        System.out.println( Arrays.toString ( ejercicio.divideFrase("Alta Velocidad Española")));
        ejercicio.esAnagrama("roma", "amor");
        ejercicio.calendario(3);
        
    }
    
}
