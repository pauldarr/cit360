import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pauldarr
 */
public class CalcTest {
    
    public CalcTest() {
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
     * Test of rectangle method, of class Calc.
     */
    @Test
    public void testRectangle() {	
	Calc test = new Calc();
	int result = test.rectangle(2, 5);
	int testValue = 10;
	assertEquals(testValue, result);			
    }

    /**
     * Test of isEvenNumber method, of class Calc.
     */
    @Test
    public void testIsEvenNumber() {
        System.out.println("isEvenNumber");
	Calc test = new Calc();
	int testValue1 = 3;
	assertFalse(test.isEvenNumber(testValue1));
	int testValue2 = 4;
	assertTrue(test.isEvenNumber(testValue2));
    }

    /**
     * Test of getValue method, of class Calc.
     */
    @Test
    public void testGetNullValue() {
        Calc test = new Calc();
        String testValue1 = "key1";
        assertNotNull(test.getValue(testValue1));
        String testValue2 = "key1";
    }

    @Test
    public void testGetSameValue() {
        Calc test = new Calc();
        String testValue1 = "key1";    
        String testValue2 = "key2";  
        assertSame(test.getValue(testValue1), test.getValue(testValue1));
        assertNotSame(test.getValue(testValue1), test.getValue(testValue2));
    }
    
    /**
     * Test of stringArray method, of class Calc.
     */
    @Test
    public void testStringArray() {
        Calc test = new Calc();
        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  Calc.stringArray();
        assertArrayEquals(expectedArray, resultArray);
    }
    
}