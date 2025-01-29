package com.ontariotechu.sofe3980U;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest {
    /**
     * Test the constructor with a valid binary value.
     */
    @Test
    public void normalConstructor() {
        Binary binary = new Binary("1001001");
        assertEquals("1001001", binary.getValue());
    }

    /**
     * Test the constructor with an invalid binary value of out-of-range digits.
     */
    @Test
    public void constructorWithInvalidDigits() {
        Binary binary = new Binary("1001001211");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the constructor with an invalid binary value of alphabetic characters.
     */
    @Test
    public void constructorWithInvalidChars() {
        Binary binary = new Binary("1001001A");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the constructor with an invalid binary value that has a sign.
     */
    @Test
    public void constructorWithNegativeSign() {
        Binary binary = new Binary("-1001001");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test the constructor with a zero-tailing valid binary value.
     */
    @Test
    public void constructorWithZeroTailing() {
        Binary binary = new Binary("00001001");
        assertTrue(binary.getValue().equals("1001"));
    }

    /**
     * Test the constructor with an empty string.
     */

    @Test
    public void constructorEmptyString() {
        Binary binary = new Binary("");
        assertTrue(binary.getValue().equals("0"));
    }


    /**
     * Test Case 1: The AND operation with two binary numbers of the same length.
     */
    @Test
    public void andT1() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("1000"));
    }
    /**
     * Test Case 1: The Multiplication operation with two binary numbers of the same length.
     */
    @Test
    public void multiplyT1() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1111000"));
    }
    /**
     * Test Case 1: The OR operation with two binary numbers of the same length.
     */
    @Test
    public void orT1() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1110"));
    }


    /**
     * Test Case 2: The AND operation where the first binary number is shorter than the second.
     */
    @Test
    public void andT2() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("10"));
    }
    /**
     * Test Case 2: The Multiplication operation where the first binary number is shorter than the second.
     */
    @Test
    public void multiplyT2() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("11110"));
    }
    /**
     * Test Case 2: The OR operation where the first binary number is shorter than the second.
     */
    @Test
    public void orT2() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }


    /**
     * Test Case 3: The AND operation where the first binary number is longer than the second.
     */
    @Test
    public void andT3() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("10"));
    }
    /**
     * Test Case 3: The Multiplication operation where the first binary number is longer than the second.
     */
    @Test
    public void multiplyT3() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("11110"));
    }
    /**
     * Test Case 3: The OR operation where the first binary number is longer than the second.
     */
    @Test
    public void orT3() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }


    /**
     * Test Case 4: The AND operation where one of the binary numbers is zero.
     */
    @Test
    public void andT4() {
        Binary binary1 = new Binary("1101");
        Binary binary2 = new Binary("0");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test Case 4: The Multiplication operation where one of the binary numbers is zero.
     */
    @Test
    public void multipyT4() {
        Binary binary1 = new Binary("1101");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test Case 4: The OR operation where one of the binary numbers is zero.
     */
    @Test
    public void orT4() {
        Binary binary1 = new Binary("1101");
        Binary binary2 = new Binary("0");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1101"));
    }


    /**
     * Test Case 5: The AND operation where both binary numbers are zero.
     */
    @Test
    public void andT5() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test Case 5: The Multiplication operation where both binary numbers are zero.
     */
    @Test
    public void multiplyT5() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
    /**
     * Test Case 5: The OR operation where both binary numbers are zero.
     */
    @Test
    public void orT5() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
}
