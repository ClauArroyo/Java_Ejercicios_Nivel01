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

    
}
