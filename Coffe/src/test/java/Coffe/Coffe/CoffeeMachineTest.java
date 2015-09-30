package Coffe.Coffe;


import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CoffeeMachineTest {
    
    private CoffeeMachine instance;

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCafePreto() {
        System.out.println("cafePreto");
        String expResult = "Cafe Preto";
        String result = instance.cafePreto();
        assertEquals(expResult, result);
    }

    @Test
    public void testCafeComCreme() {
        System.out.println("cafeComCreme");
        String expResult = "Cafe com Creme";
        String result = instance.cafeComCreme();
        assertEquals(expResult, result);
    }

    @Test
    public void testCafeComAcucar() {
        System.out.println("cafeComAcucar");
        String expResult = "Cafe com Acucar";
        String result = instance.cafeComAcucar();
        assertEquals(expResult, result);
    }

    @Test
    public void testCafeComCremeAcucar() {
        System.out.println("cafeComCremeAcucar");
        String expResult = "Cafe com Creme e Acucar";
        String result = instance.cafeComCremeAcucar();
        assertEquals(expResult, result);
    }

    @Test
    public void testDepositarMoeda() {
        System.out.println("depositarMoeda");
        Moeda m = null;
        float expResult = 0.0F;
        float result = instance.depositarMoeda(m);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTroco() {
        System.out.println("getTroco");
        Iterator<Moeda> expResult = null;
        Iterator<Moeda> result = instance.getTroco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
