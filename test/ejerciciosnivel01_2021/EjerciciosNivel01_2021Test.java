/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel01_2021;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xp
 */
public class EjerciciosNivel01_2021Test {
    
    public EjerciciosNivel01_2021Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of maximo method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int[] lista = null;
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        int expResult = 0;
        int result = instance.maximo(lista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esPalindromo method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        assertEquals(true, instance.esPalindromo("Acaso hubo buhos aca"));
        assertEquals(true, instance.esPalindromo("aca"));
        assertEquals(false, instance.esPalindromo("feo cara culo"));
        assertEquals(false, instance.esPalindromo("ligar es agil"));
        assertEquals(true, instance.esPalindromo("Allí ves a Sevilla"));
        
    }

    /**
     * Test of esIsograma method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testEsIsograma() {
        System.out.println("esIsograma");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        assertEquals(true, instance.esIsograma("murcielago"));
        assertEquals(false, instance.esIsograma("cocreta"));
        assertEquals(false, instance.esIsograma("casa"));
        assertEquals(false, instance.esIsograma("supercalifragilisticoespialidoso"));
        assertEquals(false, instance.esIsograma("Cocreta"));
        assertEquals(false, instance.esIsograma("isódroma"));
        assertEquals(true, instance.esIsograma("pita"));
        assertEquals(true, instance.esIsograma("MURCIELAGO"));
        assertEquals(false, instance.esIsograma("COCRETA"));
        assertEquals(true, instance.esIsograma("CETYS"));
        assertEquals(true, instance.esIsograma("UFV"));

        
        
      
        
        
 
    }

   
    /**
     * Test of quitaAcentos method, of class EjerciciosNivel01_2021.
     * Sólo quita los acentos no cambia a mayúsculas
     */
    @Test
    public void testQuitaAcentos() {
        System.out.println("quitaAcentos");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();

        
        assertEquals("pajaro", instance.quitaAcentos("pájaro"));
        assertEquals("Andale", instance.quitaAcentos("Ándale"));
        assertEquals("Cigueña", instance.quitaAcentos("Cigüeña"));
        assertEquals("perro", instance.quitaAcentos("perro"));
        assertEquals("pajaro", instance.quitaAcentos("pájaró"));
        assertEquals("pristino", instance.quitaAcentos("prístino"));
        assertEquals("murcielago", instance.quitaAcentos("murciélago"));
        assertEquals("atun", instance.quitaAcentos("atún"));
        assertEquals("camion", instance.quitaAcentos("camión"));
        assertEquals("PAJARO", instance.quitaAcentos("PÁJARO"));
        assertEquals("PRISTINO", instance.quitaAcentos("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentos("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentos("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentos("CAMIÓN"));

    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        String cadena = "";
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        String expResult = "";
        String result = instance.quitaAcentosV2(cadena);
        assertEquals("pajaro", instance.quitaAcentosV2("pájaro"));
        assertEquals("Andale", instance.quitaAcentosV2("Ándale"));
        assertEquals("Cigueña", instance.quitaAcentosV2("Cigüeña"));
        assertEquals("perro", instance.quitaAcentosV2("perro"));
        assertEquals("pajaro", instance.quitaAcentosV2("pájaró"));
        assertEquals("pristino", instance.quitaAcentosV2("prístino"));
        assertEquals("murcielago", instance.quitaAcentosV2("murciélago"));
        assertEquals("atun", instance.quitaAcentosV2("atún"));
        assertEquals("camion", instance.quitaAcentosV2("camión"));
        assertEquals("PAJARO", instance.quitaAcentosV2("PÁJARO"));
        assertEquals("PRISTINO", instance.quitaAcentosV2("PRÍSTINO"));
        assertEquals("MURCIELAGO", instance.quitaAcentosV2("MURCIÉLAGO"));
        assertEquals("ATUN", instance.quitaAcentosV2("ATÚN"));
        assertEquals("CAMION", instance.quitaAcentosV2("CAMIÓN"));

    }

    /**
     * Test of divideFrase method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testDivideFrase() {
        System.out.println("divideFrase");
        String frase = "";
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        String[] expResult = null;
        String[] result = instance.divideFrase(frase);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acronimo method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        assertEquals("CdETyS", instance.acronimo("Centro de Estudios Tecnológicos y Sociales"));
        assertEquals("CETYS", instance.acronimo("Centro de Estudios Tecnológicos y Sociales"));
        assertEquals("UFV", instance.acronimo("Universidad Francisco de Vitoria"));

    }

    /**
     * Test of esAnagrama method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testEsAnagrama() {
        System.out.println("esAnagrama");
        EjerciciosNivel01_2021 instance = new EjerciciosNivel01_2021();
        assertEquals(true, instance.esAnagrama("amor", "roma"));
        assertEquals(false, instance.esAnagrama("", ""));
        assertEquals(true, instance.esAnagrama("Claudia", "licuada"));
        
        assertEquals(true, instance.esAnagrama("Helios", "hielos"));
        assertEquals(true, instance.esAnagrama("Nacionalista", "Altisonancia"));
        assertEquals(false, instance.esAnagrama("kike", "aprobado"));
        assertEquals(false, instance.esAnagrama("amorr", "romma"));

    }

    /**
     * Test of main method, of class EjerciciosNivel01_2021.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosNivel01_2021.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
