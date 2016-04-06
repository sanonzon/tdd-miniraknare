/**
 * Created by suddan on 2016-04-04.
 */
import miniraknare;

class miniraknareTest extends GroovyTestCase{
    void testAdd() {
        double x = 4.25;
        double y = 2.24;

        double result = miniraknare.addera(x, y)
        double expected = 6.49;
        assertEquals(expected, result);
    }
    /*
    void testAdd2() {
        println("This should fail!")
        double x = 8;
        double y = 9;

        BigDecimal
        double result = miniraknare.addera(x, y)
        double expected = 6;
        assertEquals(expected, result);
    }*/

    void testSub() {
        long x = 9.25;
        long y = 8.24;
        long result = miniraknare.subera(x,y);
        long expected = 1.01
        assertEquals(expected,result);
    }

    void testMult() {
        long x = 9;
        long y = 8;
        long result = miniraknare.mult(x,y);
        long expected = 72;
        assertEquals(expected,result);
    }

    void testDivide() {
        long x = 16;
        long y = 8;
        long result = miniraknare.divide(x,y);
        long expected = 2;
        assertEquals(expected,result);
    }

    void testSqrt() {
        long x = 9;
        long result = miniraknare.sqrt(x);
        long expected = 3;
        assertEquals(expected,result);
    }


}