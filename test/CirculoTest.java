/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package geometria.geometria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MaDaGaJor
 */
public class CirculoTest {
    
    public CirculoTest() {
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
     * Test of area method, of class Circulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circulo instance = null;
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perimetro method, of class Circulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Circulo instance = null;
        double expResult = 0.0;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
