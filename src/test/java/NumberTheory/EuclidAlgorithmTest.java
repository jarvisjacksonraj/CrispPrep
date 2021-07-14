package NumberTheory;


import org.junit.Test;

import static org.junit.Assert.*;

public class EuclidAlgorithmTest {

    @Test
    public void testGCD() {
        EuclidAlgorithm euclidAlgorithm = new EuclidAlgorithm();
        int a = 38, b = 150;
        int result;
        result = euclidAlgorithm.gcd(a, b);
        assertEquals(result, 2);
    }
}
