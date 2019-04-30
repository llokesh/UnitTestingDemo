package com.javacodegeeks.intellij.test;

import org.w3c.dom.ranges.RangeException;

import java.util.ArrayList;
import java.util.List;

public class SimpleCalculator {

    /**
     * n1 + n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 + n2.
     */
    public float add(float n1, float n2) {
        float n3 = 0;
        if (!(n1 < -255 && n1 > 255)) {
            n3 = n1 + n2;
        }
        return n3;
    }

    /**
     * n1 - n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 - n2.
     */
    public float subtract(float n1, float n2) {
        return n1 - n2;
    }

    /**
     * n1 * n2.
     *
     * @param n1 First number.
     * @param n2 Second number.
     * @return n1 * n2.
     */
    public float multiply(float n1, float n2) {
        return n1 * n2;
    }

    /**
     * n1 / n2.
     *
     * @param n1 First number.
     * @param n2 Second number (divisor).
     * @return n1 / n2.
     * @throws ArithmeticException If the divisor is 0.
     */
    public float divide(float n1, float n2) throws ArithmeticException {
        if ((int) n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return n1 / n2;
    }

    /**
     * n1 / n2.
     *
     * @param n1 First number.
     * @param n2 Second number (divisor).
     * @return n1 / n2.
     * @throws ArithmeticException If the divisor is 0.
     */
    public List<Integer> addTwoLists(List<Integer> n1, List<Integer> n2) throws ArrayIndexOutOfBoundsException {
        List<Integer> result = new ArrayList<>();
        if(n1.size() != n2.size()) {
            throw new ArrayIndexOutOfBoundsException("Cannot add out of bounds arrays.");
        }
        for (int i = 0; i < n1.size(); i++) {
            result.add(n1.get(i) + n2.get(i));
        }
        return result;
    }
}
