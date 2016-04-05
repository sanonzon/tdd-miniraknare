/**
 * Created by suddan on 2016-04-04.
 */
class miniraknareTest extends GroovyTestCase {
    public void main(String[] args) {
        testAdd();
    }

    void testAdd() {
        double x = 4;
        double y = 2;
        double result = miniraknare.add(x, y);
        double expected = 6;
        assertEquals(expected, result);

    }

    void testSub() {

    }

    void testMult() {

    }

    void testDivide() {

    }

    void testSqrt() {

    }


}
